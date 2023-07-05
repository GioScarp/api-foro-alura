package gio.apiforoalura.services.impl;

import gio.apiforoalura.dto.CourseDto;
import gio.apiforoalura.infra.validators.ObjectsValidator;
import gio.apiforoalura.mapper.CourseMapper;
import gio.apiforoalura.models.Course;
import gio.apiforoalura.repositories.CourseRepository;
import gio.apiforoalura.services.CourseService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    public static final String COURSE_NOT_FOUND = "No se ha encontrado un curso con este id";
    private final CourseRepository courseRepository;
    private final ObjectsValidator<CourseDto> validator;

    @Override
    public Long save(CourseDto dto) {
        validator.validate(dto);
        return courseRepository.save(CourseMapper.toEntity(dto)).getId();
    }

    @Override
    public Page<CourseDto> findAll(Pageable pageable) {
        return courseRepository.findByisActive(pageable, true).map(CourseMapper::ToResponseDto);
    }

    @Override
    public CourseDto findById(Long id) {
        return CourseMapper.ToResponseDto(courseRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(COURSE_NOT_FOUND)));
    }

    @Override
    public void delete(Long id) {
        Course course = courseRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException(COURSE_NOT_FOUND));
        course.setActive(false);
    }
}

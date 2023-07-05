package gio.apiforoalura.mapper;

import gio.apiforoalura.dto.CourseDto;
import gio.apiforoalura.models.Course;

public class CourseMapper {
    public static CourseDto ToResponseDto(Course course){
        return CourseDto.builder()
                .name(course.getName())
                .category(course.getCategory())
                .build();
    }

    public static Course toEntity(CourseDto courseDto){
        return Course.builder()
                .name(courseDto.name())
                .category(courseDto.category())
                .build();
    }
}

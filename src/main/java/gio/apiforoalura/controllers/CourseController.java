package gio.apiforoalura.controllers;

import gio.apiforoalura.dto.CourseDto;
import gio.apiforoalura.services.CourseService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @PostMapping("/")
    public ResponseEntity<Long> saveCourse(@RequestBody CourseDto courseDto, UriComponentsBuilder uriComponentsBuilder){
        Long idTopic = courseService.save(courseDto);
        URI url = uriComponentsBuilder.path("/api/users/{id}").buildAndExpand(idTopic).toUri();
        return ResponseEntity.created(url).body(idTopic);
    }

    @GetMapping("/")
    public ResponseEntity<Page<CourseDto>> findAllCourses(@PageableDefault(size = 15) Pageable pageable){
        return ResponseEntity.ok(courseService.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseDto> findByIdCourse(@PathVariable Long id){
        return ResponseEntity.ok(courseService.findById(id));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id){
        courseService.delete(id);
        return ResponseEntity.ok().build();
    }
}

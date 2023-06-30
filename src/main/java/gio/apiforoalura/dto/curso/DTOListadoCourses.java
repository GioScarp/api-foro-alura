package gio.apiforoalura.dto.curso;

import gio.apiforoalura.models.Course;

public record DTOListadoCourses(String name, String category) {

    public DTOListadoCourses(Course course){
        this(course.getName(), course.getCategory().toString());
    }
}

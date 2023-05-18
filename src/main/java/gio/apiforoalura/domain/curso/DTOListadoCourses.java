package gio.apiforoalura.domain.curso;

public record DTOListadoCourses(String name, String category) {

    public DTOListadoCourses(Course course){
        this(course.getName(), course.getCategory().toString());
    }
}

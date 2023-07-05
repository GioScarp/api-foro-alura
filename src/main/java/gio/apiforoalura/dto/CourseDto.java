package gio.apiforoalura.dto;

import gio.apiforoalura.models.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record CourseDto(
        @NotBlank(message = "El nombre del curso es obligatorio")
        String name,
        @NotNull(message = "La categoria del curso es obligatoria")
        Category category) {

}

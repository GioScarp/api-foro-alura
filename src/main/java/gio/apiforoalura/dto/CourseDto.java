package gio.apiforoalura.dto;

import gio.apiforoalura.models.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.io.Serial;
import java.io.Serializable;

@Builder
public record CourseDto(
        @NotBlank(message = "El nombre del curso es obligatorio")
        String name,
        @NotNull(message = "La categoria del curso es obligatoria")
        Category category) implements Serializable {

        @Serial
        private static final long serialVersionUID = -4487469355548545L;
}

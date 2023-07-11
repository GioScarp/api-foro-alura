package gio.apiforoalura.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.io.Serial;
import java.io.Serializable;

public record TopicUpdateDto(
        @NotBlank(message = "El titulo del topico es obligatorio")
        @Size(min = 1, max = 50, message = "El titulo debe tener entre 1 y 50 caracteres")
        String title,
        @NotBlank(message = "El topico debe tener un mensaje obligatorio")
        @Size(min = 5, max = 300, message = "El mensaje debe tener entre 1 y 300 caracteres")
        String message) implements Serializable {
        @Serial
        private static final long serialVersionUID = -3217469311548545L;
}

package gio.apiforoalura.dto;

import gio.apiforoalura.models.StatusTopic;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public record TopicDto(

        @NotBlank(message = "El titulo del topico es obligatorio")
        @Size(min = 1, max = 50, message = "El titulo debe tener entre 1 y 50 caracteres")
        String title,
        @NotBlank(message = "El topico debe tener un mensaje obligatorio")
        @Size(min = 5, max = 300, message = "El mensaje debe tener entre 1 y 300 caracteres")
        String message,
        StatusTopic statusTopic,
        @NotNull(message = "Usuario no debe estar null")
        Long user,
        @NotNull(message = "curso no debe estar null")
        Long course) {

}

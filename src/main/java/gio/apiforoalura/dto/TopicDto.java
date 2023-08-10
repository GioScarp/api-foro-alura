package gio.apiforoalura.dto;

import gio.apiforoalura.models.StatusTopic;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Builder
public record TopicDto(

        @NotBlank(message = "El titulo del topico es obligatorio")
        @Size(min = 1, max = 50, message = "El titulo debe tener entre 1 y 50 caracteres")
        String title,
        @NotBlank(message = "El topico debe tener un mensaje obligatorio")
        @Size(min = 5, max = 300, message = "El mensaje debe tener entre 1 y 300 caracteres")
        String message,
        @NotNull(message = "Usuario no debe estar null")
        Long user,
        @NotNull(message = "curso no debe estar null")
        Long course,
        StatusTopic statusTopic,

        String createBy,

        int numResponses,
        LocalDateTime lastlastModifiedDate,
        List<ResponseDto> respuestas) implements Serializable {

        @Serial
        private static final long serialVersionUID = -97824693522548545L;

}

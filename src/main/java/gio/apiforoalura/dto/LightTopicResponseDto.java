package gio.apiforoalura.dto;

import gio.apiforoalura.models.StatusTopic;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Builder
public record LightTopicResponseDto(
        @NotBlank(message = "El titulo del topico es obligatorio")
        @Size(min = 1, max = 50, message = "El titulo debe tener entre 1 y 50 caracteres")
        String title,

        StatusTopic statusTopic,

        @NotBlank(message = "El creador del topico es obligatorio")
        String createBy,
        int numResponses,
        LocalDateTime lastlastModifiedDate) implements Serializable {

        @Serial
        private static final long serialVersionUID = -978244569822548545L;
}

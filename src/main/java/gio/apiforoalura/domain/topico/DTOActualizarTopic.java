package gio.apiforoalura.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DTOActualizarTopic(

        @NotBlank
        String title,
        @NotBlank
        String message,
        @NotNull
        Long user,
        @NotNull
        Long course) {
}

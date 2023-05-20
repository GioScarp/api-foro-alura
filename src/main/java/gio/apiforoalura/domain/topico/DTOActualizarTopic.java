package gio.apiforoalura.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DTOActualizarTopic(String title, String message) {
}

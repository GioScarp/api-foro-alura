package gio.apiforoalura.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

import java.io.Serial;
import java.io.Serializable;

@Builder
public record UserUpdateDto(
        @NotBlank(message = "El username es obligatorio")
        String userName,
        @NotBlank(message = "El email es obligatorio")
        @Email(message = "El email no es valido")
        String email)implements Serializable {
        @Serial
        private static final long serialVersionUID = -5587469344548545L;

}

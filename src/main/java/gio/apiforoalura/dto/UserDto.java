package gio.apiforoalura.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.io.Serial;
import java.io.Serializable;

@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public record UserDto(
        Long id,
        @NotBlank(message = "El username es obligatorio")
        String userName,
        @NotBlank(message = "El email es obligatorio")
        @Email(message = "El email no es valido")
        String email,
        @NotBlank(message = "El titulo del topico es obligatorio")
        @Size(min = 8, max = 20, message = "La contraseña debe tener min 8 y max 20 caracteres")
        String password) implements Serializable {
        @Serial
        private static final long serialVersionUID = -1997469351548545L;
}

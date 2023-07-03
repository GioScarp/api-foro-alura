package gio.apiforoalura.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
public record UserUpdateDto(
        @NotBlank(message = "El username es obligatorio")
        String userName,
        @NotBlank(message = "El email es obligatorio")
        @Email(message = "El email no es valido")
        String email) {

}

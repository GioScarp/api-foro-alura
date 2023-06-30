package gio.apiforoalura.dto.usuario;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
public record UserDto(
        Long id,
        @NotBlank
        String userName,
        @NotBlank
        String email,
        String password) {
}

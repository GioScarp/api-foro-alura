package gio.apiforoalura.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public record ResponseDto(
        @NotBlank(message = "Debe tener un mensaje obligatorio")
        @Size(min = 5, max = 300, message = "El mensaje debe tener entre 1 y 300 caracteres")
        String message,

        boolean solution,

        String createBy,

        LocalDateTime lastModified,

        @NotNull(message = "Usuario no debe estar null")
        Long user

) implements Serializable {
    @Serial
    private static final long serialVersionUID = -32174693145898545L;
}

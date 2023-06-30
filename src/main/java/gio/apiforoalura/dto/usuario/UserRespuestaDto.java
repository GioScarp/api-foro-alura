package gio.apiforoalura.dto.usuario;

import gio.apiforoalura.models.User;
import lombok.Builder;

@Builder
public record UserRespuestaDto(String userName, String email) {

}

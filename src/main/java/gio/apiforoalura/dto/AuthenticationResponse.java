package gio.apiforoalura.dto;

import lombok.Builder;

@Builder
public record AuthenticationResponse(String token) {
}

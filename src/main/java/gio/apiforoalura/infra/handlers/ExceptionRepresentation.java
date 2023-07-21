package gio.apiforoalura.infra.handlers;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;

import java.util.Set;

@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public record ExceptionRepresentation (
    String errorMessage,
    String errorSource,
    Set<String> validationErrors){

}
package gio.apiforoalura.infra.handlers;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Set;

@Getter
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public record ExceptionRepresentation (
    String errorMessage,
    String errorSource,
    Set<String> validationErrors){

}
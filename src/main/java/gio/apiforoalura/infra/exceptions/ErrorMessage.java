package gio.apiforoalura.infra.exceptions;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;

@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public record ErrorMessage(String field, String message) {
//    public ErrorMessage(FieldError error) {
//        this(error.getField(), error.getDefaultMessage());
//    }

}

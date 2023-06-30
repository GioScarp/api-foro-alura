package gio.apiforoalura.infra.handlers;

import gio.apiforoalura.infra.exceptions.ObjectValidationException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler({ObjectValidationException.class})
    public ResponseEntity<ExceptionRepresentation> handleException(ObjectValidationException exception) {
        ExceptionRepresentation representation = ExceptionRepresentation.builder()
                .errorMessage("Object not valid exception has occurred")
                .errorSource(exception.getViolationSource())
                .validationErrors(exception.getViolations())
                .build();
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .contentType(MediaType.APPLICATION_JSON)
                .body(representation);
    }

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<List<ErrorMessage>> resourceNotFoundException(MethodArgumentNotValidException e){
//        var errors2 = e.getFieldErrors().stream().map(f-> ErrorMessage.builder().
//                        field(f.getField()).
//                        message(f.getDefaultMessage()).build())
//                        .toList();
//        //var errors = e.getFieldErrors().stream().map(ErrorMessage::new).toList();
//        return ResponseEntity.badRequest().body(errors2);
//    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ExceptionRepresentation> handleException(EntityNotFoundException e){
        ExceptionRepresentation representation = ExceptionRepresentation.builder()
                .errorMessage(e.getMessage())
                .build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(representation);
    }

//    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
//    public ResponseEntity<?> SQLIntegrity(SQLIntegrityConstraintViolationException e){
//        return ResponseEntity.notFound().build();
//    }
}

package dev._x.EventClean.infra.exception;

import dev._x.EventClean.core.entities.Event;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;


@RestControllerAdvice
public class ControllerExceptionsHandler {


    @ExceptionHandler(DupicateEventException.class)
    public ResponseEntity<Map<String, String>> handleDuplicateEvents(DupicateEventException exc){
        Map<String, String >response = new HashMap<>();

        response.put("Error ", exc.getMessage());
        response.put("Message: ", "Please, insert a valid hashId for your event and try again");

        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }
}

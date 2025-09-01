package dev._x.EventClean.infra.exception;

public class DupicateEventException extends RuntimeException {

    public DupicateEventException(String message){
        super(message);
    }
}

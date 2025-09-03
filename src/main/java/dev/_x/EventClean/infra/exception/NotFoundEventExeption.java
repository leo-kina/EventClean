package dev._x.EventClean.infra.exception;

public class NotFoundEventExeption extends RuntimeException {
    public NotFoundEventExeption(String message){
        super(message);
    }
}

package dev._x.EventClean.core.gateway;

import dev._x.EventClean.core.entities.Event;

import java.util.List;
import java.util.Optional;

public interface EventoGateway  {
    Event criarEvento(Event evento);
    List<Event> listarEvento();
    boolean existePorIdentificador(String identificador);
    Optional<Event> filtrarPorIdentificador(String identificador);
}

package dev._x.EventClean.core.usecases;

import dev._x.EventClean.core.entities.Event;
import dev._x.EventClean.core.gateway.EventoGateway;

import java.util.List;

public class BuscarEventoCaseImpl implements BuscarEventoCase {
    private final EventoGateway eventoGateway;

    public BuscarEventoCaseImpl(EventoGateway eventoGateway) {
        this.eventoGateway = eventoGateway;
    }

    @Override
    public List<Event> execute() {
        return eventoGateway.listarEvento();
    }
}

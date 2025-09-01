package dev._x.EventClean.core.usecases;

import dev._x.EventClean.core.entities.Event;
import dev._x.EventClean.core.gateway.EventoGateway;

import java.util.List;

public class BuscarEventoUseCaseImpl implements BuscarEventoUseCase {
    private final EventoGateway eventoGateway;

    public BuscarEventoUseCaseImpl(EventoGateway eventoGateway) {
        this.eventoGateway = eventoGateway;
    }

    @Override
    public List<Event> execute() {
        return eventoGateway.listarEvento();
    }
}

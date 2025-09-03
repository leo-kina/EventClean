package dev._x.EventClean.core.usecases;

import dev._x.EventClean.core.entities.Event;
import dev._x.EventClean.core.gateway.EventoGateway;

import java.util.List;

public class BuscarEventoIdUseCaseImpl implements BuscarEventoUseCase {
    private final EventoGateway eventoGateway;

    public BuscarEventoIdUseCaseImpl(EventoGateway eventoGateway) {
        this.eventoGateway = eventoGateway;
    }

    @Override
    public List<Event> execute() {
        return List.of();
    }
}

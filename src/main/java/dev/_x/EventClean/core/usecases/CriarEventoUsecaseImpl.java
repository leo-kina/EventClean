package dev._x.EventClean.core.usecases;

import dev._x.EventClean.core.entities.Event;
import dev._x.EventClean.core.gateway.EventoGateway;


public class CriarEventoUsecaseImpl implements CriarEventoUsecase {
    private final EventoGateway eventoGateway;

    public CriarEventoUsecaseImpl(EventoGateway eventoGateway) {
        this.eventoGateway = eventoGateway;
    }

    @Override
    public Event execute(Event evento) {
        return eventoGateway.criarEvento(evento);
    }
}

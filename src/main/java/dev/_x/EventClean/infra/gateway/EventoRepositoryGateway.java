package dev._x.EventClean.infra.gateway;

import dev._x.EventClean.core.entities.Event;
import dev._x.EventClean.core.gateway.EventoGateway;
import dev._x.EventClean.infra.persistence.EventRepository;

public class EventoRepositoryGateway implements EventoGateway {
    private final EventRepository eventoRepository;
    @Override
    public Event criarEvento(Event evento) {
        return eventoRepository.delete();
    }
}

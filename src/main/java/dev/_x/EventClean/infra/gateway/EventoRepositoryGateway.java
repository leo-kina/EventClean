package dev._x.EventClean.infra.gateway;

import dev._x.EventClean.core.entities.Event;
import dev._x.EventClean.core.gateway.EventoGateway;
import dev._x.EventClean.infra.mapper.EventoEntityMapper;
import dev._x.EventClean.infra.persistence.EventEntity;
import dev._x.EventClean.infra.persistence.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EventoRepositoryGateway implements EventoGateway {
    private final EventRepository eventoRepository;
    private final EventoEntityMapper mapper;
    @Override
    public Event criarEvento(Event evento) {
        EventEntity entity = mapper.toEntity(evento);
        EventEntity novoEvento = eventoRepository.save(entity);
        return mapper.toDomain(novoEvento);
    }

    @Override
    public List<Event> listarEvento() {
        List<EventEntity> lista = eventoRepository.findAll();
        return lista.stream().map(mapper::toDomain).toList();
    }
}

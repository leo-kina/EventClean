package dev._x.EventClean.infra.mapper;

import dev._x.EventClean.core.entities.Event;
import dev._x.EventClean.infra.persistence.EventEntity;
import org.springframework.stereotype.Component;

@Component
public class EventoEntityMapper {
    public EventEntity toEntity(Event evento){
        return new EventEntity(
                evento.id(),
                evento.nome(),
                evento.descricao(),
                evento.identificador(),
                evento.dataInicio(),
                evento.dataFim(),
                evento.localEvento(),
                evento.capacidade(),
                evento.organizador(),
                evento.tipo()
        );

    }
    public Event toDomain(EventEntity eventEntity){
        return new Event(
                eventEntity.getId(),
                eventEntity.getNome(),
                eventEntity.getDescricao(),
                eventEntity.getIdentificador(),
                eventEntity.getDataInicio(),
                eventEntity.getDataFim(),
                eventEntity.getLocalEvento(),
                eventEntity.getCapacidade(),
                eventEntity.getOrganizador(),
                eventEntity.getTipo()
        );

    }
}

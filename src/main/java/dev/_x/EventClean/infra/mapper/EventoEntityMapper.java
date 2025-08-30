package dev._x.EventClean.infra.mapper;

import dev._x.EventClean.core.entities.Event;
import dev._x.EventClean.infra.persistence.EventEntity;

public class EventoEntityMapper {
    public EventEntity toEntity(Event evento){
        return new EventEntity(
                evento.id(),
                evento.nome(),
                evento.descricao(),
                evento.identificador(),
                evento.datainicio(),
                evento.datafim(),
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
                eventEntity.getDatainicio(),
                eventEntity.getDatafim(),
                eventEntity.getLocalEvento(),
                eventEntity.getCapacidade(),
                eventEntity.getOrganizador(),
                eventEntity.getTipo()
        );

    }
}

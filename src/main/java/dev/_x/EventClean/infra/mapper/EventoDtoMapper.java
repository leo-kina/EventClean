package dev._x.EventClean.infra.mapper;

import dev._x.EventClean.core.entities.Event;
import dev._x.EventClean.infra.dtos.EventoDTO;
import dev._x.EventClean.infra.persistence.EventEntity;
import org.springframework.stereotype.Component;

@Component
public class EventoDtoMapper {

    public EventoDTO toDto(Event evento){
        return new EventoDTO(
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
    public Event toDomain(EventoDTO eventoDTO){
        return new Event(
                eventoDTO.id(),
                eventoDTO.nome(),
                eventoDTO.descricao(),
                eventoDTO.identificador(),
                eventoDTO.datainicio(),
                eventoDTO.datafim(),
                eventoDTO.localEvento(),
                eventoDTO.capacidade(),
                eventoDTO.organizador(),
                eventoDTO.tipo()
                );
    }

}

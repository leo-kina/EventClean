package dev._x.EventClean.infra.dtos;


import dev._x.EventClean.core.enums.TipoEvento;

import java.time.LocalDateTime;

public record EventoDTO(
        Long id,
        String nome,
        String descricao,
        String identificador,
        LocalDateTime datainicio,
        LocalDateTime datafim,
        String localEvento,
        Integer capacidade,
        String organizador,
        TipoEvento tipo

                        ) {
}

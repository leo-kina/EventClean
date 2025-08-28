package dev._x.EventClean.core.entities;


import dev._x.EventClean.core.enums.TipoEvento;

import java.time.LocalDateTime;

public record Event(
        Long id,
        String nome,
        String descricao,
        String identificador,
        LocalDateTime datainicio,
        LocalDateTime datafim,
        String Local,
        String organizador,
        TipoEvento tipo

) {}

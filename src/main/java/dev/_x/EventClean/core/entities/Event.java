package dev._x.EventClean.core.entities;


public record Event(
        String nome,
        String descricao,
        LocalDateTime inicio
) {}

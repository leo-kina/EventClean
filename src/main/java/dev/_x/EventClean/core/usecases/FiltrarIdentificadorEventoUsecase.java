package dev._x.EventClean.core.usecases;

import dev._x.EventClean.core.entities.Event;

public interface FiltrarIdentificadorEventoUsecase {
    Event execute(String identificador);
}

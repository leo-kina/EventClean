package dev._x.EventClean.core.usecases;

import dev._x.EventClean.core.entities.Event;

public interface CriarEventoCase {
    Event execute(Event evento);
}

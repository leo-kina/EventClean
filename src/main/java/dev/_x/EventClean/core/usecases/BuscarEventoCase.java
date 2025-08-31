package dev._x.EventClean.core.usecases;

import dev._x.EventClean.core.entities.Event;

import java.util.List;

public interface BuscarEventoCase {

     List<Event> execute();
}

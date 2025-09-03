package dev._x.EventClean.core.usecases;

import dev._x.EventClean.core.entities.Event;
import dev._x.EventClean.core.gateway.EventoGateway;
import dev._x.EventClean.infra.exception.NotFoundEventExeption;

import java.util.List;

public class FiltrarIdentificadorEventoUsecaseImpl implements FiltrarIdentificadorEventoUsecase{
    private final EventoGateway eventoGateway;

    public FiltrarIdentificadorEventoUsecaseImpl(EventoGateway eventoGateway) {
        this.eventoGateway = eventoGateway;
    }

    @Override
    public Event execute(String identificador) {
        return eventoGateway.filtrarPorIdentificador(identificador)
                .orElseThrow(() -> new NotFoundEventExeption("Evento com identificador: " + identificador+ " nao encontrado"));
    }
}

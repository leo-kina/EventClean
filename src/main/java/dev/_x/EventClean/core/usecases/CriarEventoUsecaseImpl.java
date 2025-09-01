package dev._x.EventClean.core.usecases;

import dev._x.EventClean.core.entities.Event;
import dev._x.EventClean.core.gateway.EventoGateway;
import dev._x.EventClean.infra.exception.DupicateEventException;


public class CriarEventoUsecaseImpl implements CriarEventoUsecase {
    private final EventoGateway eventoGateway;

    public CriarEventoUsecaseImpl(EventoGateway eventoGateway) {
        this.eventoGateway = eventoGateway;
    }

    @Override
    public Event execute(Event evento) {

        if(eventoGateway.existePorIdentificador(evento.identificador())){
            throw new DupicateEventException("O indentificador numero: " + evento.identificador() + " ja esta em uso em nosso banco de dados");
        }
        return eventoGateway.criarEvento(evento);
    }

}

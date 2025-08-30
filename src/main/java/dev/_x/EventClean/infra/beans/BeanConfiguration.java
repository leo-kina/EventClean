package dev._x.EventClean.infra.beans;

import dev._x.EventClean.core.gateway.EventoGateway;
import dev._x.EventClean.core.usecases.CriarEventoUsecase;
import dev._x.EventClean.core.usecases.CriarEventoUsecaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public CriarEventoUsecase criarEventoUsecase(EventoGateway eventoGateway){
        return new CriarEventoUsecaseImpl(eventoGateway);
    }
}

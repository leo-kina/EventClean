package dev._x.EventClean.infra.beans;

import dev._x.EventClean.core.gateway.EventoGateway;
import dev._x.EventClean.core.usecases.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public CriarEventoUsecase criarEventoUsecase(EventoGateway eventoGateway){
        return new CriarEventoUsecaseImpl(eventoGateway);
    }
    @Bean
    public BuscarEventoUseCase buscarEventoCase(EventoGateway eventoGateway){
        return new BuscarEventoUseCaseImpl(eventoGateway);
    }
    @Bean
    public FiltrarIdentificadorEventoUsecase filtrarIdentificadorEventoUsecase(EventoGateway eventoGateway){
        return new FiltrarIdentificadorEventoUsecaseImpl(eventoGateway);

    }
}

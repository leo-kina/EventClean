package dev._x.EventClean.infra.presentation;

import dev._x.EventClean.core.entities.Event;
import dev._x.EventClean.core.usecases.CriarEventoUsecase;
import dev._x.EventClean.infra.dtos.EventoDTO;
import dev._x.EventClean.infra.mapper.EventoDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class EventoController {

    private final CriarEventoUsecase criarEventoUsecase;

    private final EventoDtoMapper eventoDtoMapper;

    public EventoController(CriarEventoUsecase criarEventoUsecase, EventoDtoMapper eventoDtoMapper) {
        this.criarEventoUsecase = criarEventoUsecase;
        this.eventoDtoMapper = eventoDtoMapper;
    }

    @PostMapping("/criarevento")
    public EventoDTO criarEvento(@RequestBody EventoDTO eventoDto){
        Event novoEvento = criarEventoUsecase.execute(eventoDtoMapper.toDomain(eventoDto));
        return eventoDtoMapper.toDto(novoEvento);
    }
    @GetMapping
    public String listadeevento(){
        return "lista";
    }
}

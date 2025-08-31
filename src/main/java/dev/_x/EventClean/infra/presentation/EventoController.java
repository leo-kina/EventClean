package dev._x.EventClean.infra.presentation;

import dev._x.EventClean.core.entities.Event;
import dev._x.EventClean.core.usecases.BuscarEventoCase;
import dev._x.EventClean.core.usecases.CriarEventoUsecase;
import dev._x.EventClean.infra.dtos.EventoDTO;
import dev._x.EventClean.infra.mapper.EventoDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class EventoController {

    private final CriarEventoUsecase criarEventoUsecase;
    private final BuscarEventoCase buscarEventoCase;
    private final EventoDtoMapper eventoDtoMapper;


    public EventoController(CriarEventoUsecase criarEventoUsecase, BuscarEventoCase buscarEventoCase, EventoDtoMapper eventoDtoMapper) {
        this.criarEventoUsecase = criarEventoUsecase;
        this.buscarEventoCase = buscarEventoCase;
        this.eventoDtoMapper = eventoDtoMapper;
    }

    @PostMapping("/criarevento")
    public EventoDTO criarEvento(@RequestBody EventoDTO eventoDto){
        Event novoEvento = criarEventoUsecase.execute(eventoDtoMapper.toDomain(eventoDto));
        return eventoDtoMapper.toDto(novoEvento);
    }
    @GetMapping("/listar")
    public List<EventoDTO> listareventos(){
        return buscarEventoCase.execute().stream().map(eventoDtoMapper::toDto).toList();
    }
}

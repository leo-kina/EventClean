package dev._x.EventClean.infra.presentation;

import dev._x.EventClean.core.entities.Event;
import dev._x.EventClean.core.usecases.BuscarEventoUseCase;
import dev._x.EventClean.core.usecases.CriarEventoUsecase;
import dev._x.EventClean.core.usecases.FiltrarIdentificadorEventoUsecase;
import dev._x.EventClean.infra.dtos.EventoDTO;
import dev._x.EventClean.infra.mapper.EventoDtoMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("api/v1/")
public class EventoController {

    private final CriarEventoUsecase criarEventoUsecase;
    private final BuscarEventoUseCase buscarEventoCase;
    private final EventoDtoMapper eventoDtoMapper;
    private final FiltrarIdentificadorEventoUsecase filtrarIdentificadorEventoUsecase;

    public EventoController(CriarEventoUsecase criarEventoUsecase, BuscarEventoUseCase buscarEventoCase, EventoDtoMapper eventoDtoMapper, FiltrarIdentificadorEventoUsecase filtrarIdentificadorEventoUsecase) {
        this.criarEventoUsecase = criarEventoUsecase;
        this.buscarEventoCase = buscarEventoCase;
        this.eventoDtoMapper = eventoDtoMapper;
        this.filtrarIdentificadorEventoUsecase = filtrarIdentificadorEventoUsecase;
    }

    @PostMapping("/criarevento")
    public ResponseEntity<Map<String, Object>> criarEvento(@RequestBody EventoDTO eventoDto){
        Event novoEvento = criarEventoUsecase.execute(eventoDtoMapper.toDomain(eventoDto));
        Map<String, Object> response = new HashMap<>();
        response.put("Message: ", "Evento Cadastrado com sucesso no nosso banco de dados");
        response.put("Dados do evento ", eventoDtoMapper.toDto(novoEvento));
        return ResponseEntity.ok(response);
    }
    @GetMapping("/listar")
    public List<EventoDTO> listareventos(){
        return buscarEventoCase.execute().stream().map(eventoDtoMapper::toDto).toList();
    }
    @GetMapping("/filtrar/{identificador}")
    public ResponseEntity<Event> buscarPorIdentificador(@PathVariable String identificador ){
        Event event = filtrarIdentificadorEventoUsecase.execute(identificador);
        return ResponseEntity.ok(event);
    }
}

package dev._x.EventClean.infra.persistence;

import dev._x.EventClean.core.enums.TipoEvento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Eventos")
public class EventEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private String identificador;
    private LocalDateTime datainicio;
    private LocalDateTime datafim;
    private String localEvento;
    private String capacidade;
    private String organizador;
    @Enumerated(EnumType.STRING)
    private TipoEvento tipo;
}

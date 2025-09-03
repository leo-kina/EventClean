package dev._x.EventClean.infra.persistence;

import dev._x.EventClean.core.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventRepository extends JpaRepository<EventEntity, Long> {
    Optional<Event> findByIdentificador(String identificador);
}

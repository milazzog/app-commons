package it.mgdev.app.commons.persistence.repository;

import it.mgdev.app.commons.persistence.model.Identifiable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository<T extends Identifiable> extends JpaRepository<T, Long> {
}

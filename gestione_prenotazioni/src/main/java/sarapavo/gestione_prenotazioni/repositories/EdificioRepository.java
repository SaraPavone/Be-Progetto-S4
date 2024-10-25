package sarapavo.gestione_prenotazioni.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sarapavo.gestione_prenotazioni.entities.Edificio;

public interface EdificioRepository extends JpaRepository<Edificio, Long> {
}

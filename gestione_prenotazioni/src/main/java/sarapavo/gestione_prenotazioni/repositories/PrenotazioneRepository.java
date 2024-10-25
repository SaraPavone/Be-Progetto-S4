package sarapavo.gestione_prenotazioni.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sarapavo.gestione_prenotazioni.entities.Postazione;
import sarapavo.gestione_prenotazioni.entities.Prenotazione;
import sarapavo.gestione_prenotazioni.entities.Utente;

import java.time.LocalDate;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    boolean existsByGiornoPrenotatoAndPostazione(LocalDate giornoPrenotato, Postazione postazione);

    boolean existsByGiornoPrenotatoAndUtente(LocalDate giornoPrenotato, Utente utente);
}

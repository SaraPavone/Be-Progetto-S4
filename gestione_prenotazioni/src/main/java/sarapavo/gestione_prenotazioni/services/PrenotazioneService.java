package sarapavo.gestione_prenotazioni.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sarapavo.gestione_prenotazioni.entities.Prenotazione;
import sarapavo.gestione_prenotazioni.exceptions.ValidationException;
import sarapavo.gestione_prenotazioni.repositories.PrenotazioneRepository;


@Service
public class PrenotazioneService {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    private void savePrenotazione(Prenotazione newPrenotazione) {
        if (prenotazioneRepository.existsByGiornoPrenotatoAndPostazione(newPrenotazione.getGiornoPrenotato(), newPrenotazione.getPostazione()))
            throw new ValidationException("La postazione desiderata é giá occupata in questa data!");

        if (prenotazioneRepository.existsByGiornoPrenotatoAndUtente(newPrenotazione.getGiornoPrenotato(), newPrenotazione.getUtente()))
            throw new ValidationException("Non puoi effettuare piú prenotazione per la stessa data!");

        prenotazioneRepository.save(newPrenotazione);

    }
}

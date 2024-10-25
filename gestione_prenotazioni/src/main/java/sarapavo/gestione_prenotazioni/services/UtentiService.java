package sarapavo.gestione_prenotazioni.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sarapavo.gestione_prenotazioni.entities.Utente;
import sarapavo.gestione_prenotazioni.repositories.UtenteRepository;

@Service
public class UtentiService {
    @Autowired
    private UtenteRepository utenteRepository;

    public void saveUtente(Utente utente) {
        utenteRepository.save(utente);
    }

}

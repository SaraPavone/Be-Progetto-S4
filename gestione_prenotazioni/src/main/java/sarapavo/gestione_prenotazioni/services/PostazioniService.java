package sarapavo.gestione_prenotazioni.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sarapavo.gestione_prenotazioni.entities.Postazione;
import sarapavo.gestione_prenotazioni.repositories.PostazioneRepository;

@Service
public class PostazioniService {
    @Autowired
    private PostazioneRepository postazioneRepository;

    public void savePostazione(Postazione postazione) {
        postazioneRepository.save(postazione);
    }
}

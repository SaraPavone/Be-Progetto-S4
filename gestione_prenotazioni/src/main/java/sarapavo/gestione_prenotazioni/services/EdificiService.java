package sarapavo.gestione_prenotazioni.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sarapavo.gestione_prenotazioni.entities.Edificio;
import sarapavo.gestione_prenotazioni.repositories.EdificioRepository;

@Service
public class EdificiService {
    @Autowired
    private EdificioRepository edificioRepository;

    public void saveEdificio(Edificio edificio) {

        edificioRepository.save(edificio);
    }

}

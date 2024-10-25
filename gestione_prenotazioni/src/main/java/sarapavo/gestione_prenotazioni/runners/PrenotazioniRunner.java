package sarapavo.gestione_prenotazioni.runners;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sarapavo.gestione_prenotazioni.entities.Edificio;
import sarapavo.gestione_prenotazioni.entities.Postazione;
import sarapavo.gestione_prenotazioni.entities.TipoPostazione;
import sarapavo.gestione_prenotazioni.services.EdificiService;
import sarapavo.gestione_prenotazioni.services.PostazioniService;
import sarapavo.gestione_prenotazioni.services.PrenotazioneService;
import sarapavo.gestione_prenotazioni.services.UtentiService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

@Component
@Slf4j
public class PrenotazioniRunner implements CommandLineRunner {

    @Autowired
    private UtentiService utentiService;
    @Autowired
    private PrenotazioneService prenotazioneService;
    @Autowired
    private EdificiService edificiService;
    @Autowired
    private PostazioniService postazioniService;

    @Override
    public void run(String... args) throws Exception {
        Faker faker = new Faker(Locale.ITALY);

//        List<Utente> newUtenteLista = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            Utente newUtente = new Utente(faker.pokemon().name(), faker.internet().emailAddress(), faker.name().fullName());
//            newUtenteLista.add(newUtente);
//            utentiService.saveUtente(newUtente);
//        }
//        System.out.println(newUtenteLista);

//        List<Edificio> newEdificioLista = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            Edificio newEdificio = new Edificio(faker.name().name(), faker.address().cityName(), faker.address().fullAddress());
//            newEdificioLista.add(newEdificio);
//            edificiService.saveEdificio(newEdificio);
//
//        }


        List<Postazione> newPostazioneLista = new ArrayList<>();

        Edificio randomEdif = new Edificio("Ferdinando Cattaneo", "Sesto Piersilvio lido", "Contrada Santoro 491, San Damiana nell'emilia, MT 55740");

        for (int i = 0; i < 10; i++) {
            String descrizione = faker.lorem().characters(50);
            TipoPostazione tipo = TipoPostazione.randomTipo();
            int numeroMaxOccupanti = new Random().nextInt(91) + 10;
            boolean isFree = new Random().nextBoolean();

            Postazione newPostazione = new Postazione();
            newPostazioneLista.add(newPostazione);
            postazioniService.savePostazione(newPostazione);
        }
    }
}

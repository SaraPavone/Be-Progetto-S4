package sarapavo.gestione_prenotazioni.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "prenotazioni")
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroPrenotazione;

    @ManyToOne
    @JoinColumn(name = "utente_id", nullable = false)
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "postazione_id", nullable = false)
    private Postazione postazione;

    @Column(name = "giorno_prenotato")
    private LocalDate giornoPrenotato;


    public Prenotazione(Utente utente, Postazione postazione, LocalDate giornoPrenotato) {
        this.utente = utente;
        this.postazione = postazione;
        this.giornoPrenotato = giornoPrenotato;

    }
}

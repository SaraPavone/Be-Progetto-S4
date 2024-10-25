package sarapavo.gestione_prenotazioni.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "postazioni")
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoPostazione tipoPostazione;

    private int numeroMaxOccupanti;

    @ManyToOne
    @JoinColumn(name = "edificio_id", nullable = false)
    private Edificio edificio;

    private boolean isFree;


    public Postazione(String descrizione, TipoPostazione tipoPostazione, int numeroMaxOccupanti, Edificio edificio, boolean isFree) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.numeroMaxOccupanti = numeroMaxOccupanti;
        this.edificio = edificio;
        this.isFree = isFree;
    }
}

package sarapavo.gestione_prenotazioni.entities;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "utenti")
@Getter
@Setter
@NoArgsConstructor


public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String nomeCompleto;
    @Column(nullable = false)
    private String email;

    public Utente(String username, String email, String nomeCompleto) {
        this.username = username;
        this.email = email;
        this.nomeCompleto = nomeCompleto;
    }

}

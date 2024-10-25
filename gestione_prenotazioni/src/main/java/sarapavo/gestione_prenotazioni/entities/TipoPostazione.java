package sarapavo.gestione_prenotazioni.entities;

import java.util.Random;

public enum TipoPostazione {
    PRIVATO, OPENSPACE, SALA_RIUNIONI;

    public static TipoPostazione randomTipo() {
        TipoPostazione[] tipo = values();
        return tipo[new Random().nextInt(tipo.length)];
    }
}

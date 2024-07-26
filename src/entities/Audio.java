package entities;

// costruttore
public class Audio extends ElementoRiproducibile {
    private int volume;


    public Audio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }

    // metodo per abbassare il volume
    public void abbassaVolume() {
        if (volume > 0) volume--;
    }

    // metodo per alzare il volume
    public void alzaVolume() {
        volume++;
    }

    // implementazione del metodo play (), e stampa il titolo con sequenza di "!"
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }
}

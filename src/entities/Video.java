package entities;

// costruttore
public class Video extends ElementoRiproducibile {
    private int volume;
    private int luminosità;

    public Video(String titolo, int durata, int volume, int luminosità) {
        super(titolo, durata);
        this.volume = volume;
        this.luminosità = luminosità;
    }

    public void abbassaVolume() {
        if (volume > 0) volume--;
    }

    public void alzaVolume() {
        volume++;
    }

    // metodo per l'aumento della luminosita
    public void aumentaLuminosità() {
        luminosità++;
    }

    // metodo per diminuire la luminosita
    public void diminuisciLuminosità() {
        if (luminosità > 0) luminosità--;
    }

    // implementazione del metodo play () che stampa il titolo con una sequenza di "!" e "*"
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume) + " " + "*".repeat(luminosità));
        }
    }
}

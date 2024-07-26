package entities;

// classe che estende da ElementoMultimedile
public class Immagine extends ElementoMultimediale {
    private int luminosità;

    // construttore
    public Immagine(String titolo, int luminosità) {
        super(titolo);
        this.luminosità = luminosità;
    }

    public void aumentaLuminosità() {
        luminosità++;
    }

    public void diminuisciLuminosità() {
        if (luminosità > 0) luminosità--;
    }

    // metodo show () che stampa il titolo e una sequenza di "*"
    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosità));
    }
}

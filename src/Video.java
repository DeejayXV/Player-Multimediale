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

    public void aumentaLuminosità() {
        luminosità++;
    }

    public void diminuisciLuminosità() {
        if (luminosità > 0) luminosità--;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume) + " " + "*".repeat(luminosità));
        }
    }
}

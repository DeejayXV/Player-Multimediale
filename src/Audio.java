public class Audio extends ElementoRiproducibile {
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }

    public void abbassaVolume() {
        if (volume > 0) volume--;
    }

    public void alzaVolume() {
        volume++;
    }

    @Override
    public void play() {
        System.out.println("Riproduzione audio: " + titolo + " per " + durata + " secondi. Volume: " + volume);
    }
}

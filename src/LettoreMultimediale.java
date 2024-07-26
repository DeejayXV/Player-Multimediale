import java.util.Scanner;

public class LettoreMultimediale {
    private ElementoMultimediale[] elementi = new ElementoMultimediale[5];

    public static void main(String[] args) {
        LettoreMultimediale lettore = new LettoreMultimediale();
        lettore.inizializzaElementi();
        lettore.esegui();
    }

    public void inizializzaElementi() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il tipo di elemento (1) Audio - (2) Video - (3) Immagine ... ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci il titolo: ");
            String titolo = scanner.nextLine();

            switch (tipo) {
                case 1:
                    System.out.println("Inserisci la durata: ");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci il volume: ");
                    int volumeAudio = scanner.nextInt();
                    elementi[i] = new Audio(titolo, durataAudio, volumeAudio);
                    break;
                case 2:
                    System.out.println("Inserisci la durata: ");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci il volume: ");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità: ");
                    int luminositàVideo = scanner.nextInt();
                    elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositàVideo);
                    break;
                case 3:
                    System.out.println("Inserisci la luminosità: ");
                    int luminositàImmagine = scanner.nextInt();
                    elementi[i] = new Immagine(titolo, luminositàImmagine);
                    break;
                default:
                    System.out.println("Tipo non valido.");
                    i--;
                    break;
            }
        }
    }

    public void esegui() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Scegli un elemento da 1 a 5, oppure 0 per finire: ");
            int scelta = scanner.nextInt();
            if (scelta == 0) break;
            if (scelta < 1 || scelta > 5) {
                System.out.println("Scelta non valida, scegli di nuovo!");
                continue;
            }

            ElementoMultimediale elemento = elementi[scelta - 1];
            if (elemento instanceof Riproducibile) {
                ((Riproducibile) elemento).play();
            } else if (elemento instanceof Immagine) {
                ((Immagine) elemento).show();
            }
        }
    }
}

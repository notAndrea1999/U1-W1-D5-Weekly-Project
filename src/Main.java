import multimedia.Immagine;
import multimedia.Multimedia;
import multimedia.RegistrazioneAudio;
import multimedia.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Multimedia[] multimediaArr = new Multimedia[5];
        for (int i = 0; i < multimediaArr.length; i++) {
            System.out.println("Benvenuto, che file multimediale ti piacerebbe creare?");
            System.out.println("Digita 1 per creare una Immagine");
            System.out.println("Digita 2 per creare una Video");
            System.out.println("Digita 3 per creare una Audio");
            switch (Integer.parseInt(input.nextLine())) {
                case 1: {
                    System.out.println("Perfetto hai scelto di creare una immagine, iniziamo");
                    System.out.println("Inserisci il titolo alla tua immagine");
                    String title = input.nextLine();
                    System.out.println("Scegli la luminosita che ritieni piu opportuna");
                    int luminosita = Integer.parseInt(input.nextLine());
                    multimediaArr[i] = new Immagine(title, luminosita);
                    System.out.println("Immagine creata con successo");
                    System.out.println("Riepilogo elemento ->" + " " + multimediaArr[i]);
                    System.out.println("-----------------------------------------------");
                    break;
                }
                case 2: {
                    System.out.println("Perfetto hai scelto di creare un video, iniziamo");
                    System.out.println("Inserisci il titolo del tuo video");
                    String title = input.nextLine();
                    System.out.println("Scegli il volume piu' idoneo");
                    int volume = Integer.parseInt(input.nextLine());
                    System.out.println("Scegli la luminosita che ritieni piu opportuna");
                    int luminosita = Integer.parseInt(input.nextLine());
                    System.out.println("Quanto deve durare?");
                    int durata = Integer.parseInt(input.nextLine());
                    multimediaArr[i] = new Video(title, volume, luminosita, durata);
                    System.out.println("Video creato con successo");
                    System.out.println("Riepilogo elemento ->" + " " + multimediaArr[i]);
                    System.out.println("-----------------------------------------------");
                    break;
                }
                case 3: {
                    System.out.println("Perfetto hai scelto di creare un audio, iniziamo");
                    System.out.println("Inserisci il titolo del tuo audio ");
                    String title = input.nextLine();
                    System.out.println("Scegli il volume piu' idoneo");
                    int volume = Integer.parseInt(input.nextLine());
                    System.out.println("Quanto deve durare?");
                    int durata = Integer.parseInt(input.nextLine());
                    multimediaArr[i] = new RegistrazioneAudio(title, durata, volume);
                    System.out.println("Audio creato con successo");
                    System.out.println("Riepilogo elemento ->" + " " + multimediaArr[i]);
                    System.out.println("-----------------------------------------------");
                    break;
                }
                default: {
                    System.out.println("Hai selezionato un numero errato!!");
                    i--;
                }
            }
        }

        while (true) {
            for (int i = 0; i < multimediaArr.length; i++) {
                int posizione = i + 1;
                System.out.println(posizione + " " + multimediaArr[i]);
            }
            System.out.println("Quale file multimediale vuoi riprodurre?");
            int choseItem = Integer.parseInt(input.nextLine());

            if (choseItem > 5) {
                System.out.println("Scegli un numero da 1 a 5");
            }

            if (choseItem < 0) {
                System.out.println("Scegli un numero da 1 a 5");
            }

            if (choseItem == 0) {
                System.out.println("SEI USCITO DAL PROGRAMMA!");
                break;
            }

            choseItem--;
            if (multimediaArr[choseItem] instanceof Immagine) {
                ((Immagine) multimediaArr[choseItem]).show();
            } else if (multimediaArr[choseItem] instanceof Video) {
                ((Video) multimediaArr[choseItem]).play();
            } else if (multimediaArr[choseItem] instanceof RegistrazioneAudio) {
                ((RegistrazioneAudio) multimediaArr[choseItem]).play();
            }

        }
        input.close();
    }
}


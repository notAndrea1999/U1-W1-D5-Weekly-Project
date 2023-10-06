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
            System.out.println("Scegli 1 per istanziare un imagine, 2 per un video, 3 per un audio");
            switch (Integer.parseInt(input.nextLine())) {
                case 1: {
                    System.out.println("Inserisci titolo");
                    String title = input.nextLine();
                    System.out.println("Setta la luminosita");
                    int luminosita = Integer.parseInt(input.nextLine());
                    multimediaArr[i] = new Immagine(title, luminosita);
                    System.out.println("Elemento multimediale creato con successo");
                    break;
                }
                case 2: {
                    System.out.println("Inserisci titolo");
                    String title = input.nextLine();
                    System.out.println("Setta il volume");
                    int volume = Integer.parseInt(input.nextLine());
                    System.out.println("Setta la luminosita");
                    int luminosita = Integer.parseInt(input.nextLine());
                    System.out.println("Setta la durata");
                    int durata = Integer.parseInt(input.nextLine());
                    multimediaArr[i] = new Video(title, volume, luminosita, durata);
                    System.out.println("Elemento multimediale creato con successo");
                    break;
                }
                case 3: {
                    System.out.println("Inserisci titolo");
                    String title = input.nextLine();
                    System.out.println("Setta il volume");
                    int volume = Integer.parseInt(input.nextLine());
                    System.out.println("Setta la durata");
                    int durata = Integer.parseInt(input.nextLine());
                    multimediaArr[i] = new RegistrazioneAudio(title, durata, volume);
                    System.out.println("Elemento multimediale creato con successo");
                    break;
                }
            }
        }

        while (true) {
            System.out.println("Scegli il file multimediale da riprodurre");
            int choseItem = Integer.parseInt(input.nextLine());

            if (choseItem == 0) {
                System.out.println("SEI USCITO DAL PROGRAMMA!");
                break;
            }

            if (choseItem > 5) {
                System.out.println("Scegli un numero da 1 a 5");
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


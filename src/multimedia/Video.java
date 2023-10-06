package multimedia;

public class Video extends Multimedia implements Volume, Brightness, Play {

    private int volume;

    private int luminosita;

    private int durata;

    public Video(String title, int volume, int luminosita, int durata) {
        this.title = title;
        this.volume = volume;
        this.luminosita = luminosita;
        this.durata = durata;
    }

    @Override
    public void alzaLuminosita() {
        this.luminosita++;
    }

    @Override
    public void abbassaLuminosita() {
        this.luminosita--;
    }

    @Override
    public void alzaVolume() {
        this.volume++;
    }

    @Override
    public void abbassaVolume() {
        this.volume--;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + this.title + " " +
                "volume=" + this.volume + " " +
                "luminosita=" + this.luminosita + " " +
                "durata=" + this.durata +
                '}';
    }

    @Override
    public void play() {
        String asterisco = "";
        String escalmativo = "";
        for (int i = 0; i < this.volume; i++) {
            escalmativo = escalmativo + "!";
        }
        for (int i = 0; i < this.luminosita; i++) {
            asterisco = asterisco + "*";
        }
        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.title + escalmativo + asterisco);
        }


    }
}

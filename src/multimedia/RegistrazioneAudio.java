package multimedia;

public class RegistrazioneAudio extends Multimedia implements Volume, Play {

    private int durata;

    private int volume;

    public RegistrazioneAudio(String title, int durata, int volume) {
        this.title = title;
        this.durata = durata;
        this.volume = volume;
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
        return "RegistrazioneAudio{" +
                "title='" + this.title + " " +
                "durata=" + this.durata + " " +
                "volume=" + this.volume + " " +
                '}';
    }

    @Override
    public void play() {
        String escalmativo = "";
        for (int i = 0; i < this.volume; i++) {
            escalmativo = escalmativo + "!";
        }
        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.title + escalmativo);
        }

    }
}

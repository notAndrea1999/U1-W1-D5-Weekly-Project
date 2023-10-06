package multimedia;

public class Immagine extends Multimedia implements Brightness, Show {

    private int luminosita;

    public Immagine(String title, int luminosita) {
        this.title = title;
        this.luminosita = luminosita;
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
    public void show() {
        String asterisco = "";
        for (int i = 0; i < luminosita; i++) {
            asterisco = asterisco + "*";
        }
        System.out.println(this.title + asterisco);
    }

    @Override
    public String toString() {
        return "Immagine{" +
                "title='" + this.title + " " +
                "luminosita=" + this.luminosita +
                '}';
    }
}

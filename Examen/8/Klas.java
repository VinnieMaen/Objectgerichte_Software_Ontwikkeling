
public class Klas {
    private String naam;

    private static int klassen; //added code

    public Klas() {
        this.naam = null;
        klassen++; //added code
    }

    public Klas(String naam) {
        this.naam = naam;
        klassen++; //added code
    }

    public static int getAantalKlassen() {
        return klassen;
    }
}

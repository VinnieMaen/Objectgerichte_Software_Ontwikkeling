public class Fiets {
    private String merk;
    private int grootte;

    public Fiets () {
        this.merk = "";
        this.grootte = "";
    }

    public Fiets (String merk, int grootte) {
        this.merk = merk;
        this.grootte = grootte;

    }

    public Fiets (Fiets fiets) {
        this.merk = fiets.merk;
        this.grootte = fiets.grootte;
    }
}

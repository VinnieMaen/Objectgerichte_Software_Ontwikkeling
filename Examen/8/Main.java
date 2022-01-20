public class Main {
    public static void main(String[] args){
        System.out.println(Klas.getAantalKlassen());

        Klas klas1 = new Klas("1K");
        Klas klas2 = new Klas("1A");
        Klas klas3 = new Klas();

        System.out.println(Klas.getAantalKlassen());
    }
}

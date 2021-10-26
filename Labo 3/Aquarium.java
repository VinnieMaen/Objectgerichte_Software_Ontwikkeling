
public class Aquarium {
	//Definieren van globale variabelen
	private double length;
	private double width;
	private double heigth;
	private double price;
	private int stock;
	
	
	//Construcot met gegeven basiswaarden want geen argumenten meegegeven.
	public Aquarium() {
		this.length =20.5 ;
		this.width = 10.5;
		this.heigth = 15.5;
		this.price = 30.75;
		this.stock = 100;
	}
	
	//Constructor wanneer 5 argumenten meegegeven en de globale variabelen gelijkstellen aan hun overeenkomstige argumenten.
	public Aquarium(double l, double w, double h, double p, int s) {
		this.length = l;
		this.width = w;
		this.heigth = h;
		this.price = p;
		this.stock = s;
	}
	
	//Construcot waarbij een Aquarium gekopieerd wordt en enkel de lengte wordt gewijzigd.
	public Aquarium(Aquarium a, double l) {
		this.length = l;
		this.width = a.width;
		this.heigth = a.heigth;
		this.price = a.price;
		this.stock = a.stock;
	}
	
	//Copy construcot
	public Aquarium(Aquarium a) {
		this.length = a.length;
		this.width = a.width;
		this.heigth = a.heigth;
		this.price = a.price;
		this.stock = a.stock;
	}
	
	//Copy functie (geen constructor). We maken een copy met de copyconstructor, wijzigen de breedte en returnen dan ons nieuw object.
	public Aquarium kopieer(double w) {
		Aquarium a2 = new Aquarium(this);
		a2.width = w;

		return a2;
	}
	
	//Schrijf naar scherm.
	public void schrijf() {
		System.out.println("lengte: " + this.length + " breedte: " + this.width + " hoogte: " + this.heigth + " prijs: " + this.price + " aantal in stock: " + this.stock);
	}
	
	//Trek het verkochte amount af van de totale stock en geef de prijs terug door te vermenigvuldigen met de prijs van het object.
	public double ontvangen(int amount) {
		this.stock -= amount;
		return amount * this.price;
	}
}


public class BankRekening {
	//Definieer op voorhand alle variabelen die we nodig gaan hebben in ons object.
	private String accountNr;
	private String fullName;
	private double accountBalance;
	
	//Maak een constructor indien geen argumenten meegegeven zijn vanuit de main class.
	public BankRekening() {
		//Zet bovenstaande variabelen naar een standaard waarde.
		this.accountNr = "";
		this.fullName = "";
		this.accountBalance = 0;
	}
	
	//Maak een constructor indien 3 argumenten gegeven zijn vanuit de main class.
	public BankRekening(String accNumber, String name, double balance) {
		//Zet de bovenstaand gedefinieerde variabelen naar hun overeenkomstige argumenten.
		this.accountNr = accNumber;
		this.fullName = name;
		this.accountBalance = balance;
	}
	
	//Getters gelijk vorig oefening returnen String voor getNummer en getNaam. Omdat Saldo een double is en we dus een double returnen is getSaldo van het type public double.
	public String getNummer() {
		return this.accountNr;
	}
	
	public String getNaam() {
		return this.fullName;
	}
	
	public double getSaldo() {
		return this.accountBalance;
	}
	
	//Om een variabele te wijzigen geven we een argument mee en vervangen we bovenstaand gedefinieerde variabelen hun huidige waarde naar de nieuwe meegegeven waarde.
	public void setNummer(String nr) {
		this.accountNr = nr;
	}
	
	public void setNaam(String nm) {
		this.fullName = nm;
	}
	
	public void setSaldo(double saldo) {
		this.accountBalance = saldo;
	}
	
	//Stort geld dan moeten we het argument (hoeveelheid geld) bij het huidige saldo voegen.
	public void stortGeld(double amount) {
		this.accountBalance += amount;
	}
	
	//Hetzelfde maar ipv plus moeten we het er van aftrekken.
	public void haalGeldAf(double amount) {
		this.accountBalance -= amount;
	}
}

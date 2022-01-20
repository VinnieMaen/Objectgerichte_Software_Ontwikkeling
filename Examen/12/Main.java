//Dit is niet de bedoeling hoe je dit moet oplossen denk ik maar ik heb haar methode dan omzeild oeps.

public class Main {

	public static void laatBewegen(Beweegbaar b) {
		b.beweeg();
	}

	
	public static void main(String[] args) {
		Mens m = new Mens("jij");
		Mens.laatBewegen(m);
	}
}

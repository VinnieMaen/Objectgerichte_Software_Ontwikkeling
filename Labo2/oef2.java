import java.util.Scanner;

public class L2_2 {
	public static void main(String[] args) {
		//Scanner aanmaken
		Scanner sc = new Scanner(System.in);
		
		//String inlezen
		String inputStr = sc.nextLine();
		
		//ints definiëren voor later waarde aan toe te kennen
		int a = 0;
		int b = 0;
		int c = 0;
		
		//De 3 letters uit de string halen
		char ch1 = inputStr.charAt(0);
		char ch2 = inputStr.charAt(1);
		char ch3 = inputStr.charAt(2);
		
		//Kijken met welke letter het character overeenkomt en dan de ints van hierboven juist zetten met info uit tabel (Misschien niet de mooiste manier om dit aan te pakken maar het werkt ;) )
		switch ( ch1 ) {
			case 'z' : a = 0; break;
			case 'b' : a = 1; break;
			case 'r' : a = 2; break;
			case 'o' : a = 3; break;
			case 'g' : a = 4; break;
			case 'G' : a = 5; break;
			case 'B' : a = 6; break;
			case 'V' : a = 7; break;
			case 'L' : a = 8; break;
			case 'W' : a = 9; break;
		}
		
		switch ( ch2 ) {
			case 'z' : b = 0; break;
			case 'b' : b = 1; break;
			case 'r' : b = 2; break;
			case 'o' : b = 3; break;
			case 'g' : b = 4; break;
			case 'G' : b = 5; break;
			case 'B' : b = 6; break;
			case 'V' : b = 7; break;
			case 'L' : b = 8; break;
			case 'W' : b = 9; break;
		}
		
		switch ( ch3 ) {
			case 'z' : c = 0; break;
			case 'b' : c = 1; break;
			case 'r' : c = 2; break;
			case 'o' : c = 3; break;
			case 'g' : c = 4; break;
			case 'G' : c = 5; break;
			case 'B' : c = 6; break;
			case 'V' : c = 7; break;
			case 'L' : c = 8; break;
			case 'W' : c = 9; break;
		}
		
		//We krijgen floats door de functie Math.pow (macht berekenen van 10 tot de c'de) dus casten we die naar een int. Dit wordt gedaan door (int) voor de bewerking te plaatsen.
		int result = (int) ((10 * a + b) * Math.pow(10, c));
		System.out.println(result);
	}
}

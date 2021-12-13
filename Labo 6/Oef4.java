import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class L6_4 {

	public static void main(String[] args) throws IOException {
		//Open teams.csv
		FileReader fr = new FileReader("teams.csv");
		Scanner sc = new Scanner(fr);
		
		//Maak array van team objecten met dimensie 7.
		Team[] teams = new Team[7];
		
		//Loop over de 7 lijnen in de csv.
		for ( int i = 0; i < 7; i++ ) {
			String text = sc.nextLine();
			
			//Split elke lijn zodat je naam, stad en score appart kunt gebruiken.
			String[] data = text.split(";");
			
			//Maak nieuw team object met naam (data[0]), stad ... en score ... .
			Team team = new Team(data[0], data[1], Integer.parseInt(data[2]));
			
			//Vraag de gebruiker voor input wat de laatste score was.
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Insert score for team " + data[0]);
			int score = Integer.parseInt(sc2.nextLine());
			
			//Functie om score toe te voegen. We voegen de ingegeven score bij bij de score van het huidige team.
			team.addScore(score);
			
			//We voegen het team object toe aan de Array.
			teams[i] = team;

		}
		
		//Open file om te schrijven.
	    PrintWriter printWriter = new PrintWriter(new FileWriter("teams.csv"));
	    
	    //Loop over onze 7 team objecten en maak er een csv formatted lijn van.
	    for ( int i = 0; i < 7; i++ ) {
			printWriter.println(teams[i].getNaam().toString() + ";" + teams[i].getStad().toString() + ";" + teams[i].getScore());

		}

		printWriter.close();
		fr.close();
		
	}

}

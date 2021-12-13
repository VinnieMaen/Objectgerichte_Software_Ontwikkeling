import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class L6_01 {

	public static void main(String[] args) throws IOException {
		//Defineer een counter voor straks door de matrix te loopen
		int counter = 0;
		
		//Definieer een nieuwe printWriter en filewwriter met een bestandsnaam naar keuze. Dit zijn objecten die het mogelijkmaken een file te maken en ernaar te schrijven
	    PrintWriter printWriter = new PrintWriter(new FileWriter("text.txt"));


	    //Loop 10 keer en vraag telkens voor een nieuw getal. Println dit getal naar de printwriter en zo dus in de file.
		for ( int i = 0; i < 10; i++) {

			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			printWriter.println(input);


		}
		
		System.out.println("Done");
		printWriter.close();
		
		//Defineer een filereader met de bestandsnaam gelijk in de printwriter. Dit is een object om te file te lezen.
		FileReader fr = new FileReader("text.txt");
		
		//Hier net zoals bij user input een scanner maar deze keer geven we ipv system.in onze filereader mee omdat we will scannen over de tekst in onze file ipv in de console.
		Scanner sc2 = new Scanner(fr);
		
		//Definieer tweedimensionale array met dimensies 2 op 5 en definieer de colom als 0 want dit is de eerste kolom;
		int[][] Arr = new int[2][5];
		int col = 0;
		
		//Loop 10 keer om elk cijfer uit het bestand te lezen.
		for ( int i = 0; i < 10; i++) {
			
			//Indien i = 5 gaan we naar de volgende kolom en resetten we de counter die over de rijen in de matrix gaat.
			if (i == 5) {
				col = 1; 
				counter = 0;
			}
			
			//Zelfde als in console, lees telkens volgende lijn en zet het om naar integer. Je kan het als string laten maar dan moet je bovenaan je array ook van type string maken.
			int getal = Integer.parseInt(sc2.nextLine());
			
			//Zet plek op kolom 0/1 en rij (zie counter) gelijk aan het getal.
			Arr[col][counter] = getal; 
			
			//Counter plus een want naar volgende rij.
			counter += 1;


		}
		
		//Print de matrix. Lijntje code gevonden op google, je kan altijd zelf eens rondgoogelen hoeje een matrix best print.
		System.out.println(Arrays.deepToString(Arr));

		
	}

}

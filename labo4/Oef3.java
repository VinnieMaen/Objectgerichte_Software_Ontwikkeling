import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class L6_3 {

	public static void main(String[] args) throws IOException {
		//Open file met tekst en maak scanner aan.
		FileReader fr = new FileReader("smallText.txt");
		Scanner sc = new Scanner(fr);

		//Lees eerste lijn.
		String text = sc.nextLine();
		
		//Open file om te schrijven.
	    PrintWriter printWriter = new PrintWriter(new FileWriter("bigText.txt"));
	    
	    //Print normale tekst en maak hoofdletters met .toUpperCase().
	    printWriter.println(text.toUpperCase());

		printWriter.close();
		fr.close();
		
	}

}


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class L6_2 {

	public static void main(String[] args) throws IOException {
		//Lees beide text files en creeer er een scanner voor.
		FileReader fr = new FileReader("text1.txt");
		FileReader fr2 = new FileReader("text2.txt");
		Scanner sc2 = new Scanner(fr);
		Scanner sc = new Scanner(fr2);

		//Neem de eerste lijn in elke file.
		String text = sc2.nextLine();
		String text2 = sc.nextLine();
		
		//Open een file om naar te schrijven.
	    PrintWriter printWriter = new PrintWriter(new FileWriter("text2.txt"));
	    
	    //Schrijf text2 en plak er text 1 achter.
	    printWriter.println(text2 + " " + text);

		printWriter.close();
		fr.close();
		
	}

}

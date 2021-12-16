import java.util.List;
import java.util.Scanner;

public class DanswedstrijdMain {

	public static void drukMenu() {
		System.out.println("Hoofdmenu" + System.getProperty("line.separator"));
		System.out.println("\t  1. Toevoegen deelnemer");
		System.out.println("\t  2. Toevoegen jurylid");
		System.out.println("\t  3. Toevoegen alle scores");
		System.out.println("\t  4. Tonen deelnemersLijst");
		System.out.println("\t  5. Tonen juryleden");
		System.out.println("\t  6. Verwijderen deelnemer");
		System.out.println("\t  7. Ordenen deelnemerslijst alfabetisch op naam");
		System.out.println();
		System.out.println("\t  8. Ordenen deelnemerslijst op inschrijvingsnummer");
		System.out.println("\t  9. Ordenen deelnemerslijst op behaalde totale score");
		System.out.println("\t 10. Zoek deelnemer op naam en toon");
		System.out.println("\t 11. Toon winnaar");
		System.out.println("\t 12. Verwijder JuryLid en al zijn gegeven scores");
		System.out.println("\t 13. Verwijder scores van deelnemer");
		System.out.println();
		System.out.println("\t 0. Stoppen");
		System.out.println();
		System.out.print("Keuze: ");
	}

	public static void wisScherm() {
		for (int i = 0; i < 100; i++)
			System.out.println();
	}

	public static void waitUntilKeypressed() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Druk <enter> om verder te gaan: ");
		sc.nextLine();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DeelnemersLijst l = new DeelnemersLijst();
		JuryLedenLijst jl = new JuryLedenLijst();

		int keuze;
		int nummer;
		String naam;

		do {
			wisScherm();
			drukMenu();
			keuze = Integer.parseInt(sc.nextLine());
			switch (keuze) {
			case 0:
				break;
			case 1: // voeg deelnemer toe
				System.out.print("Inschrijvingsnummer: ");
				nummer = Integer.parseInt(sc.nextLine());
				System.out.print("Naam: ");
				naam = sc.nextLine();
				Deelnemer d = new Deelnemer(nummer, naam);
				l.voegDeelnemerToe(d);
				waitUntilKeypressed();

				break;
			case 2: // voeg jurylid toe
				System.out.print("Id: ");
				nummer = Integer.parseInt(sc.nextLine());
				System.out.print("Naam: ");
				naam = sc.nextLine();
				JuryLid jurylid = new JuryLid(nummer, naam);
				jl.voegJuryLidToe(jurylid);
				waitUntilKeypressed();

				break;
			case 3: // voeg alle scores toe
				int waarde;
				for (int i = 0; i < l.getAantalDeelnemers(); i++) {
					Deelnemer deelnemer = l.getDeelnemer(i);
					System.out.println("score voor " + deelnemer.getNaam() + ": ");
					for (int j = 0; j < jl.getAantalJuryLeden(); j++) {
						JuryLid lid = jl.getJuryLid(j);
						System.out.print("\t" + lid.getNaam() + ": ");
						waarde = Integer.parseInt(sc.nextLine());
						Score s = new Score(waarde, lid);
						deelnemer.voegScoreToe(s);
					}
				}
				break;
			case 4: // toon deelnemerslijst
				wisScherm();
				System.out.println(l.toString());
				waitUntilKeypressed();
				break;
			case 5: // toon juryledenlijst
				wisScherm();
				System.out.println(jl.toString());
				waitUntilKeypressed();
				break;
			case 6: // verwijderDeelnemer
				System.out.print("Inschrijvingsnummer: ");
				nummer = Integer.parseInt(sc.nextLine());
				if (l.zoekDeelnemerOpInschrijvingsNummer(nummer) < 0)
					System.out.println(nummer + " bestaat niet");
				else {
					l.verwijderDeelnemer(nummer);
					System.out.println("deelnemer " + nummer + " is verwijderd");
				}
				waitUntilKeypressed();
				break;

			case 7: // sorteer deelnemerslijst op naam
				l.sorteerOpNaamDeelnemer();
				System.out.println("Ok");
				waitUntilKeypressed();
				break;

			case 8: // sorteer deelnemerslijst op nummer
				l.sorteerOpInschrijvingsNummerDeelnemer();
				System.out.println("Ok");
				waitUntilKeypressed();
				break;

			case 9: // sorteer deelnemerslijst op score
				l.sorteerOpTotaleAflopendeScoreDeelnemer();
				System.out.println("Ok");
				waitUntilKeypressed();
				break;

			case 10: // krijg totale score voor naam
				System.out.print("Naam: ");
				naam = sc.nextLine();
				int score = l.getScoreBijNaam(naam);
				if (score != -1)
					System.out.println("Score voor " + naam + " is: " + score);
				else
					System.out.println("Deelnemer bestaat niet!");
				waitUntilKeypressed();
				break;

			case 11: // krijg totale score voor naam
				l.getWinnaars();
				waitUntilKeypressed();
				break;

			case 12: // krijg totale score voor naam
				System.out.print("ID: ");
				nummer = Integer.parseInt(sc.nextLine());
				if (jl.zoekJuryLidOpID(nummer) < 0) {
					System.out.println(nummer + " bestaat niet");

				} else {
					jl.verwijderJuryLid(nummer);
					List<Deelnemer> lijst = l.getDeelnemerLijst();

					for (int i = 0; i < l.getAantalDeelnemers(); i++) {
						Deelnemer deelnemer = lijst.get(i);
						List<Score> scoreLijst = deelnemer.getScorelijst();

						for (int x = 0; x < scoreLijst.size(); x++) {
							if (scoreLijst.get(x).getJury().getId() == nummer) {
								scoreLijst.remove(x);
							}
						}
					}

					System.out.println("Jurylid " + nummer + " is verwijderd");
				}
				waitUntilKeypressed();
				break;

			case 13: // krijg totale score voor naam
				System.out.print("Inschrijvingsnummer: ");
				nummer = Integer.parseInt(sc.nextLine());
				int exists = l.zoekDeelnemerOpInschrijvingsNummer(nummer);
				if (exists != -1)
					l.getDeelnemerLijst().get(exists).clearScoreLijst();
				
				else
					System.out.println("Deelnemer bestaat niet!");
				waitUntilKeypressed();
				break;

			default:
				System.out.println("Ongeldige keuze!");
				waitUntilKeypressed();
				break;
			}
		} while (keuze != 0);
		System.out.println("Good bye");
	}
}

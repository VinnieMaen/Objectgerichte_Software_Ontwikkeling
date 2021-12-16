import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DeelnemersLijst {

	private List<Deelnemer> deelnemers;

	public DeelnemersLijst() {
		deelnemers = new ArrayList<Deelnemer>();
	}
	
	public Deelnemer getDeelnemer(int index){
		return deelnemers.get(index);
	}
	
	public int getAantalDeelnemers(){
		return deelnemers.size();
	}
	
	public List<Deelnemer> getDeelnemerLijst() {
		return deelnemers;
	}
	
	public void voegDeelnemerToe(Deelnemer d){
		for (int i = 0; i < deelnemers.size(); i++) {
			Deelnemer deelnemer = deelnemers.get(i);
			if (deelnemer.getInschrijvingsNummer() == d.getInschrijvingsNummer()) {
				System.out.println("Inschrijvingsnummer bestaat al!");
				return;
			}
		}
		
		deelnemers.add(d);
	}
	
	public int zoekDeelnemerOpInschrijvingsNummer(int inschrijvingsNummer){
		int aantal = deelnemers.size();
		boolean gevonden = false;
		int i=0;
		while (i<aantal && !gevonden){
			Deelnemer d = deelnemers.get(i);
			if (d.checkInschrijvingsNummer(inschrijvingsNummer)) 
				gevonden = true;
			else 
				i++;
		}
		if (gevonden) return i; else return -1;
	}
	
	public int zoekDeelnemerOpNaam(String naam){
		int aantal = deelnemers.size();
		boolean gevonden = false;
		int i=0;
		while (i<aantal && !gevonden){
			Deelnemer d = deelnemers.get(i);
			if (d.checkNaam(naam)) 
				gevonden = true;
			else 
				i++;
		}
		if (gevonden) return i; else return -1;
	}
	
	public int getScoreBijNaam (String naam){
		int index = this.zoekDeelnemerOpNaam(naam);
		if (index >= 0) return deelnemers.get(index).getTotaleScore();
		
		return index;
	}
	
	public void getWinnaars (){
		int max = 0;
		int score;
		
		for ( int i = 0; i < deelnemers.size(); i++) {
			score = deelnemers.get(i).getTotaleScore();
			if (score > max) max = score;
			
			if (i == deelnemers.size() - 1) {
				for ( int x = 0; x < deelnemers.size(); x++) {
					score = deelnemers.get(x).getTotaleScore();
					Deelnemer d = deelnemers.get(x);
					if (score == max) {
						System.out.println(d.getInschrijvingsNummer() + ". " + d.getNaam());
						System.out.println("Score: " + d.getTotaleScore());
					}
				}
			}
		}
	}
	
	public void verwijderDeelnemer(int inschrijvingsNummer){
		int index = this.zoekDeelnemerOpInschrijvingsNummer(inschrijvingsNummer);
		if (index >= 0) deelnemers.remove(index);
	}

	public void sorteerOpNaamDeelnemer(){
		Collections.sort(deelnemers, new ComparatorVolgensNaamDeelnemer());
	}
	
	public void sorteerOpTotaleAflopendeScoreDeelnemer(){
		Collections.sort(deelnemers, new ComparatorVolgensAflopendeScore());
	}
	
	public void sorteerOpInschrijvingsNummerDeelnemer(){
		Collections.sort(deelnemers, new ComparatorVolgensInschrijvingsNummer());
	}
	
	@Override
	public String toString() {
		StringBuffer hulp = new StringBuffer();
		//int aantal = deelnemers.size();
		//for(int i=0; i<aantal; i++){
		//	Deelnemer d = deelnemers.get(i);
		//	hulp.append(d.toString());
		//}
		for (Deelnemer d:deelnemers)
			hulp.append(d.toString());
		return hulp.toString();
	}
	
	
}

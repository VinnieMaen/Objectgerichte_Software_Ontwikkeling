import java.util.ArrayList;
import java.util.List;

public class Deelnemer{
	
	private int inschrijvingsNummer;
	private String naam;
	private List<Score> scoreLijst;
	
	public Deelnemer() {
		inschrijvingsNummer = 0;
		naam = null;
		scoreLijst = new ArrayList<Score>();
	}
	
	public Deelnemer(int inschrijvingsNummer, String naam) {
		this.inschrijvingsNummer = inschrijvingsNummer;
		this.naam = naam;
		scoreLijst = new ArrayList<Score>(); 
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	
	public int getInschrijvingsNummer() {
		return inschrijvingsNummer;
	}

	public void setInschrijvingsNummer(int inschrijvingsNummer) {
		this.inschrijvingsNummer = inschrijvingsNummer;
	}

	public List<Score> getScorelijst() {
		return scoreLijst;
	}

	public void setScoreLijst(List<Score> scorelijst) {
		this.scoreLijst = scorelijst;
	}
	
	public void clearScoreLijst() {
		this.scoreLijst = new ArrayList<Score>();
	}

	public void voegScoreToe(Score s){
		scoreLijst.add(s);
	}
	
	public boolean checkInschrijvingsNummer(int inschrijvingsNummer){
		return this.inschrijvingsNummer == inschrijvingsNummer;
	}
	
	public boolean checkNaam(String naam){
		return this.naam.equals(naam);
	}
	
	public int getTotaleScore(){
		int totaal = 0;
		//int aantal = scoreLijst.size();
		//for(int i=0; i<aantal; i++){
		//	Score s = scoreLijst.get(i); 
		//	totaal += s.getWaarde();
		//}
		for (Score s:scoreLijst)
			totaal += s.getWaarde();
		return totaal;
	}
	
	@Override
	public String toString() {
		StringBuffer hulp = new StringBuffer(inschrijvingsNummer + ". " + naam+ "\t");
		//int aantal = scoreLijst.size();
		//for(int i=0; i<aantal; i++){
		//	Score s = scoreLijst.get(i);
		//	hulp.append(s.toString());
		//}
		for (Score s:scoreLijst)
			hulp.append(s.toString());
		return hulp.toString() + System.getProperty("line.separator");
	}
	
	
	
	
	
	
}

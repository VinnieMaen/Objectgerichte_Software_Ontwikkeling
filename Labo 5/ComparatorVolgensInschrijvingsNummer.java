import java.util.Comparator;


public class ComparatorVolgensInschrijvingsNummer implements Comparator<Deelnemer>{
	public int compare(Deelnemer d1, Deelnemer d2 ){
		return d1.getInschrijvingsNummer() - d2.getInschrijvingsNummer();
	}
	

}

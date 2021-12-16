import java.util.Comparator;


public class ComparatorVolgensAflopendeScore implements Comparator<Deelnemer>{
	public int compare(Deelnemer d1, Deelnemer d2 ){
		return d2.getTotaleScore() - d1.getTotaleScore();
	}
	

}

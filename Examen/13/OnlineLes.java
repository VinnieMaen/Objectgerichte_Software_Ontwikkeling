import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OnlineLes {
    List<Persoon> deelnemers = new ArrayList<Persoon>();
    //Dit niet gezien dus denk niet dat ze dit gaat vragen, neem gewoon null null maar moeten eigenlijk argumenten zijn om het juiste tijdstip aan te geven.
    LocalDateTime tijdstip = new LocalDateTime(null, null); 
    
    public void deelnemen(Persoon p) {
    	deelnemers.add(p);
    }
}

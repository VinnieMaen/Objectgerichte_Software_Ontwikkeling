import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OnlineLes {
    List<Persoon> deelnemers = new ArrayList<Persoon>();
    LocalDateTime tijdstip = new LocalDateTime(null, null);
    
    public void deelnemen(Persoon p) {
    	deelnemers.add(p);
    }
}

import java.util.ArrayList;
import java.util.List;


public class JuryLedenLijst {

	private List<JuryLid> juryLeden;
	
	public JuryLedenLijst(){
		juryLeden = new ArrayList<JuryLid>();
	}
	
	public int getAantalJuryLeden(){
		return juryLeden.size();
	}
	
	public JuryLid getJuryLid(int index){
		return juryLeden.get(index);
	}
	
	public void voegJuryLidToe(JuryLid lid){
		for (int i = 0; i < juryLeden.size(); i++) {
			JuryLid jl = juryLeden.get(i);
			if (jl.getId() == lid.getId()) {
				System.out.println("ID bestaat al!");
				return;
			}
		}
		
		juryLeden.add(lid);
	}
	
	public int zoekJuryLidOpID(int id){
		int aantal = juryLeden.size();
		boolean gevonden = false;
		int i=0;
		while (i<aantal && !gevonden){
			JuryLid d = juryLeden.get(i);
			if (d.checkID(id)) 
				gevonden = true;
			else 
				i++;
		}
		if (gevonden) return i; else return -1;
	}
	
	public void verwijderJuryLid(int id){
		int index = this.zoekJuryLidOpID(id);
		if (index >= 0) {
			juryLeden.remove(index);
		}
	}
	
	public String toString() {
		StringBuffer hulp = new StringBuffer();
		//int aantal = juryLeden.size();
		//for(int i=0; i<aantal; i++){
		//	JuryLid lid = juryLeden.get(i);
		//	hulp.append(lid.toString() + System.getProperty("line.separator"));
		//}
		for (JuryLid lid:juryLeden)
			hulp.append(lid.toString() + System.getProperty("line.separator"));
		return hulp.toString();
	}
}

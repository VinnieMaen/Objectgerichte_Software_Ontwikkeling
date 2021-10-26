
public class Tijd {
	//Opnieuw definieren van variabelen voor later gebruik.
	private int h;
	private int m;
	private int s;

	//Constructor wanneer geen argumenten worden meegegeven.
	public Tijd() {
		this.h = 0;
		this.m = 0;
		this.s = 0;
	}

	//Copy constructor. We geven een ander Tijd object mee en zetten de globale variabelen in dit object naar die van het meegegeven object. Merk op dat we hier wel .h .m en .s kunen gebruiken ondanks deze private zijn omdat we in de Tijd class zelf bezig zijn.
	public Tijd(Tijd t) {
		this.h = t.h;
		this.m = t.m;
		this.s = t.s;
	}
	
	//Constructor wanneer 3 variabelen worden meegegeven.
	public Tijd(int hour, int minute, int second) {
		this.h = hour;
		this.m = minute;
		this.s = second;
	}

	//Schrijf huidige waarden naar scherm.
	public void schrijf() {
		System.out.println(this.h + " uur, " + this.m + " minuten en " + this.s + " seconden.");
	}

	//Zet alle variabelen op nul.
	public void resetOpNul() {
		this.h = 0;
		this.m = 0;
		this.s = 0;
	}
	
	//Kijk als t2.h (uur) groter is dan 12, zoja, trek van het huidige uur 12 af om de AM/PM variant ge verkrijgen. Zo niet doe niks en return huidige waarde.
	public Tijd modulo12() {
		Tijd t2 = new Tijd(this);

		if (t2.h > 12) {
			t2.h -= 12;
		}

		return t2;
	}

	//Tel twee tijden op bij elkaar rekening houdend dat 60 min een uur is en 60 seconden een minuut.
	public void telOp(Tijd t) {
		//Bepaal alle sommen
		int hSum = this.h + t.h;
		int mSum = this.m + t.m;
		int sSum = this.s + t.s;
		
		//Als som van uren groter dan 24u dan opnieuw beginnen tellen dus -24, anders gewoon gelijkstellen aan de som.
		if (hSum > 24) {
			this.h = hSum - 24;
		
		} else {
			this.h = hSum;
		}
		
		//Als som van minuten groter dan 60, minuten opnieuw laten beginnen en uren plus 1 doen. Geen rekening houden dat uren 24 zou kunnen zijn en dankzij 60min 25 zou worden wat weer 1 zou zijn. Dit zou complexe functie maken.
		if (mSum > 60) {
			this.m = mSum - 60;
			this.h += 1;
		
		} else {
			this.m = mSum;
		}
		
		//Zelfde als hierboven maar voor seconden.
		if (sSum > 60) {
			this.s = sSum - 60;
			this.m += 1;
			
		} else {
			this.s = sSum;
		}
		
	}
}

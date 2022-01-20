
public class main9 {
	
	public static void main(String[] args) {
		int waarde = bepaalWoordWaarde("hey");
				
		System.out.println(waarde);
	}
	
	public static int bepaalWoordWaarde(String str) {
	    int waarde = 0;

	    str = str.toLowerCase();
	    
	    for ( int i = 0; i < str.length(); i++) {
	       String character = String.valueOf(str.charAt(i));
	        
	        switch(character) {
	        	case "a": waarde += 1; break;
	        	case "b": waarde += 2; break;
	        	case "c": waarde += 3; break;
	        	case "d": waarde += 4; break;
	        	case "e": waarde += 5; break;
	        	case "f": waarde += 6; break;
	        	case "g": waarde += 7; break;
	        	case "h": waarde += 8; break;
	        	case "i": waarde += 9; break;
	        	case "j": waarde += 10; break;
	        	case "k": waarde += 11; break;
	        	case "l": waarde += 12; break;
	        	case "m": waarde += 13; break;
	        	case "n": waarde += 14; break;
	        	case "o": waarde += 15; break;
	        	case "p": waarde += 16; break;
	        	case "q": waarde += 17; break;
	        	case "r": waarde += 18; break;
	        	case "s": waarde += 19; break;
	        	case "t": waarde += 20; break;
	        	case "u": waarde += 21; break;
	        	case "v": waarde += 22; break;
	        	case "w": waarde += 23; break;
	        	case "x": waarde += 24; break;
	        	case "y": waarde += 25; break;
	        	case "z": waarde += 26; break;
	        	
	        }
	        
	    }
	    
	    return waarde;
	}
}

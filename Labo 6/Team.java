
public class Team {

	private String naam;
	private String stad;
	private int score;
	
	public Team(String n, String s, int sc) {
		this.setNaam(n);
		this.setStad(s);
		this.setScore(sc);
	}
	
	public void addScore(int i) {
		this.setScore(this.getScore() + i);
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getStad() {
		return stad;
	}

	public void setStad(String stad) {
		this.stad = stad;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}

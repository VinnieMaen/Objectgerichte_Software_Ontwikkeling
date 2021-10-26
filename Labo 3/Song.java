import java.io.File;

public class Song {
	//Definieer alle variabelen die we nodig hebben in ons object en maak deze private zodat ze buiten deze classe niet kunnen gewijzigd worden.
	private String title;
	private String artist;
	private String album;
	private File file;
	
	//Maak een constructor voor 4 doorgegeven argumenten en zorg dat deze niet dezelfde naam hebben als de hierboven gedifinieerde variabelen.
	public Song(String inTitle, String inArtist, String inAlbum, File inFile) {
		//Zet nu de globale variabelen naar hun overeenkomstig argument die we hebben meegegeven vanuit de main functie.
		this.title = inTitle;
		this.artist = inArtist;
		this.album = inAlbum;
		this.file = inFile;
	}
	
	//Getter voor de titel, return bovenstaand variabele this.title met this het huidige object.
	public String getTitel() {
		return this.title;
	}
	
	
	//Zeflde voor artist
	public String getArtist() {
		return this.artist;
	}
	
	//Zelfde voor album
	public String getAlbum() {
		return this.album;
	}
	
	//Zelfde voor file (public File omdat we een File object returnen)
	public File getFile() {
		return this.file;
	}

}

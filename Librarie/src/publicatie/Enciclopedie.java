package publicatie;

public class Enciclopedie extends Publicatie {

	protected String autori;

	public Enciclopedie(String isbn, String titlu, String autori) {
		super(isbn, titlu);
		this.autori = autori;
	}

	public String getAutori() {
		return autori;
	}

	public void setAutori(String autori) {
		this.autori = autori;
	}

	@Override
	public String toString() {
		return "Enciclopedie [ISBN: " + getIsbn() + ", TITLU: " + getTitlu() + ", AUTORI: " + getAutori() + "]";
	}

}

package publicatie;

public class Carte extends Publicatie {

	protected String autori;
	protected String tematica;

	public Carte(String isbn, String titlu, String autori, String tematica) {
		super(isbn, titlu);
		this.autori = autori;
		this.tematica = tematica;
	}

	public String getAutori() {
		return autori;
	}

	public void setAutori(String autori) {
		this.autori = autori;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	@Override
	public String toString() {
		return "Carte [ISBN: "  + getIsbn() + ", TITLU: " + getTitlu() + ", AUTOR: " + getAutori() + ", TEMATICA: "
				+ getTematica() + "]";
	}

}

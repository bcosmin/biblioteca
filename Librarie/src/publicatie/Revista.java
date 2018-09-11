package publicatie;

public class Revista extends Publicatie {

	protected int numar;
	protected String tematica;

	public Revista(String isbn, String titlu, int numar, String tematica) {

		super(isbn, titlu);
		this.numar = numar;
		this.tematica = tematica;
	}

	public int getNumar() {
		return numar;
	}

	public void setNumar(int numar) {
		this.numar = numar;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	@Override
	public String toString() {

		return "Revista [ISBN: " + getIsbn() + ", TITLU: " + getTitlu() + ", NUMARUL: " + getNumar() + ", TEMATICA: "
				+ getTematica() + "]";
	}

}

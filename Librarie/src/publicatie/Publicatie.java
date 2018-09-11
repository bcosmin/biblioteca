package publicatie;

public abstract class Publicatie {
	protected String isbn;
	protected String titlu;
	
	
	public Publicatie(String isbn, String titlu) {
		super();
		this.isbn = isbn;
		this.titlu = titlu;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getTitlu() {
		return titlu;
	}


	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	
	
	
	
}

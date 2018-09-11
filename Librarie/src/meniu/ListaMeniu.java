package meniu;

import system.Constante;

public class ListaMeniu implements Constante {

	private void afisMeniuPrincipal() {

		System.out.println(topEmpty);
		System.out.println("+  Selecteaza optiune:               + ");
		System.out.println(topEmpty);
		System.out.println("+    1) Reviste                      + ");
		System.out.println("+    2) Carti                        + ");
		System.out.println("+    3) Enciclopedie                 + ");
		System.out.println("+    4) Lista publicatii             + ");
		System.out.println("+    5) Stocuri                      + ");
		System.out.println("+    6) Iesire aplicatie             + ");
		System.out.println(topEmpty);
		System.out.println(lineSeparator);
	}

	private void afisMeniuRevista() {
		
		System.out.println("+  Selecteaza optiune:               + ");
		System.out.println(topEmpty);
		System.out.println("+    a) Adauga revista               + ");
		System.out.println("+    b) Elimina revista              + ");
		System.out.println("+    c) Lista reviste                + ");
		System.out.println("+    d) Stoc reviste                 + ");
		System.out.println("+    e) Imprumuta revista            + ");
		System.out.println("+    f) Returneaza revista           + ");
		System.out.println("+    g) << Inapoi                    + ");

	}

	private void afisMeniuCarte() {
		
		System.out.println("+  Selecteaza optiune:               + ");
		System.out.println(topEmpty);
		System.out.println("+    a) Adauga carte                 + ");
		System.out.println("+    b) Elimina carte                + ");
		System.out.println("+    c) Lista carti                  + ");
		System.out.println("+    d) Stoc carti                   + ");
		System.out.println("+    e) Imprumuta carte              + ");
		System.out.println("+    f) Returneaza carte             + ");
		System.out.println("+    g) << Inapoi                    + ");

	}

	private void afisMeniuEnciclopedie() {

		System.out.println("+  Selecteaza optiune:               + ");
		System.out.println(topEmpty);
		System.out.println("+    a) Adauga enciclopedie          + ");
		System.out.println("+    b) Elimina enciclopedie         + ");
		System.out.println("+    c) Lista enciclopedii           + ");
		System.out.println("+    d) Stoc enciclopedii            + ");
		System.out.println("+    e) Imprumuta enciclopedie       + ");
		System.out.println("+    f) Returneaza enciclopedie      + ");
		System.out.println("+    g) << Inapoi                    + ");

	}

	// public

	public void printMeniuPrincipal() {

		afisMeniuPrincipal();
	}

	public void printMeniuRevista() {

		afisMeniuRevista();
	}

	public void printMeniuCarte() {

		afisMeniuCarte();
	}

	public void printMeniuEnciclopedie() {

		afisMeniuEnciclopedie();
	}


}

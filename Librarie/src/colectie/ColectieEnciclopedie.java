package colectie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import publicatie.Enciclopedie;
import system.Constante;
import system.Functie;

public class ColectieEnciclopedie implements Constante, Functie {

	protected Scanner input = new Scanner(System.in);
	private List<Enciclopedie> listaEnciclopedie = new ArrayList<>();
	private List<Enciclopedie> listaEnImprumut = new ArrayList<>();

	public ColectieEnciclopedie() {
		listaEnciclopedie = new ArrayList<>();
	}

	@Override
	public void adauga() {

		System.out.println("Scrie cate enciclopedii vrei sa adaugi in librarie: ");

		int numarBucatiKey = input.nextInt();

		for (int i = 1; i <= numarBucatiKey; i++) {

			System.out.println(wIsbn);
			String isbn = input.next();

			System.out.println(wTitlu);
			String titlu = input.next();

			System.out.println(wAutori);
			String autori = input.next();
			System.out.println(longLine);
			System.out.println(blankString);

			Enciclopedie e = new Enciclopedie(isbn, titlu, autori);
			e.setIsbn(isbn);
			e.setTitlu(titlu);
			e.setAutori(autori);

			listaEnciclopedie.add(e);

			if (listaEnciclopedie.size() > listaEnciclopedie.size() - 1) {
				System.out.println("Enciclopedie adaugata cu succes!");
				// System.out.println(listaEnciclopedie.size());
				System.out.println(blankString);
			} else {
				System.out.println("Enciclopedia nu s-a adaugat.");
				// System.out.println(listaEnciclopedie.size());
				System.out.println(blankString);
			}
		}
	}

	@Override
	public void elimina() {

		if (listaEnciclopedie.isEmpty()) {

			System.out.println(emptyList);

		} else {

			int i = 0;

			for (Enciclopedie e : listaEnciclopedie) {
				System.out.println("Index: " + (i++) + separatorTab + e);
			}

			System.out.println("Scrie INDEXUL enciclopediei: ");
			int index = input.nextInt();
			listaEnciclopedie.remove(index);

			if (listaEnciclopedie.size() < listaEnciclopedie.size() + 1) {
				System.out.println("A fost eliminat cu succes indexul: " + index);
				// listaEnciclopedie.size();
			} else {
				System.out.println("Indexul " + index + " nu a fost eliminat");
				// listaEnciclopedie.size();
			}
		}

	}

	@Override
	public void afiseaza() {

		if (listaEnciclopedie.isEmpty()) {
			System.out.println("Enciclopedii: " + emptyList);
		} else {
			for (Enciclopedie en : listaEnciclopedie) {
				System.out.println(en.toString());
			}
		}

	}

	@Override
	public long stoc() {

		long stocEnciclopedie;

		stocEnciclopedie = listaEnciclopedie.size();

		return stocEnciclopedie;

	}

	@Override
	public void imprumuta() {
		if (listaEnciclopedie.isEmpty()) {

			System.out.println(emptyList + " Nu poti imprumuta enciclopedii.");

		} else {

			try {

				System.out.println(
						"Stocul de enciclopedii este: " + stoc() + " bucati." + "\nPoti imprumuta enciclopedii.");
				System.out.println(blankString);

				int i = 0;

				System.out.println("Lista enciclopediilor este: ");

				for (Enciclopedie e : listaEnciclopedie) {
					System.out.println(blankString);
					System.out.println("Index: " + (i++) + separatorTab + e);

				}

				System.out.println(blankString);
				System.out.println("Scrie numele tau: ");
				String nume = input.next();
				System.out.println(blankString);
				System.out.println("Scrie INDEXUL enciclopediei pentru imprumut: ");
				int index = input.nextInt();

				Enciclopedie e = listaEnciclopedie.get(index);
				listaEnImprumut.add(e);
				listaEnciclopedie.remove(index);

				System.out.println("Enciclopedia cu indexul " + index + " a fost imprumutata de " + nume);
				System.out.println("Numarul enciclopediilor ce mai pot fi imprumutate este: " + stoc());

			} catch (IndexOutOfBoundsException e) {
				System.out.println("Index incorect.");
			}

		}

	}

	@Override
	public void returneaza() {
		if (listaEnImprumut.isEmpty()) {
			System.out.println(emptyList);
		} else {

			try {

				System.out.println("Stocul de enciclopedii imprumutate este: " + stocImprumut() + " bucati.");
				System.out.println(blankString);

				int i = 0;

				for (Enciclopedie e : listaEnImprumut) {
					System.out.println("Lista enciclopediilor imprumutate este: ");
					System.out.println(blankString);
					System.out.println("Index: " + (i++) + separatorTab + e);

				}

				System.out.println(blankString);
				System.out.println("Scrie INDEXUL enciclopediei pentru returnare: ");
				int index = input.nextInt();

				Enciclopedie e = listaEnImprumut.get(index);
				listaEnciclopedie.add(e);
				listaEnImprumut.remove(index);

				System.out.println("Numarul enciclopediilor ce pot fi returnate este: " + stocImprumut());

			} catch (IndexOutOfBoundsException e) {
				System.out.println("Index incorect.");
			}

		}

	}

	@Override
	public long stocImprumut() {

		long stocEnImprumut = listaEnImprumut.size();

		return stocEnImprumut;
	}

}

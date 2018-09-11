package colectie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import publicatie.Revista;
import system.Constante;
import system.Functie;

public class ColectieRevista implements Constante, Functie {

	protected Scanner input = new Scanner(System.in);

	private List<Revista> listaRevista = new ArrayList<>();

	private List<Revista> listaRevImprumut = new ArrayList<>();

	public ColectieRevista() {

		listaRevista = new ArrayList<>();
	}

	@Override
	public void adauga() {

		System.out.println("Scrie cate reviste vrei sa adaugi in librarie: ");

		int numarBucatiKey = input.nextInt();

		for (int i = 1; i <= numarBucatiKey; i++) {

			try {

				System.out.println(wIsbn);
				String isbn = input.next();

				System.out.println(wTitlu);
				String titlu = input.next();

				System.out.println(wNumar);
				int numar = Integer.parseInt(input.next());

				System.out.println(wTematica);
				String tematica = input.next();
				System.out.println(longLine);
				System.out.println(blankString);

				Revista r = new Revista(isbn, titlu, numar, tematica);

				r.setIsbn(isbn);
				r.setTitlu(titlu);
				r.setNumar(numar);
				r.setTematica(tematica);

				listaRevista.add(r);

				if (listaRevista.size() > listaRevista.size() - 1) {
					System.out.println("Revista adaugata cu succes!");
					// System.out.println(listaRevista.size());
					System.out.println(blankString);
				} else {
					System.out.println("Revista nu s-a adaugat.");
					// System.out.println(listaRevista.size());
					System.out.println(blankString);
				}

			} catch (NumberFormatException e) {
				System.out.println("Format incorect la numarul revistei.");
			}
		}
	}

	@Override
	public void elimina() {

		if (listaRevista.isEmpty()) {

			System.out.println(emptyList);

		} else {

			int i = 0;

			for (Revista r : listaRevista) {
				System.out.println("Index: " + (i++) + separatorTab + r);

			}

			System.out.println("Scrie INDEXUL revistei: ");
			int index = input.nextInt();
			listaRevista.remove(index);

			if (listaRevista.size() < listaRevista.size() + 1) {
				System.out.println("A fost eliminat cu succes indexul: " + index);
				// listaRevista.size();
			} else {
				System.out.println("Indexul " + index + " nu a fost eliminat");
				// listaRevista.size();
			}

		}

	}

	@Override
	public void afiseaza() {

		if (listaRevista.isEmpty()) {
			System.out.println("Reviste: " + emptyList);
		} else {

			for (Revista rev : listaRevista) {
				System.out.println(rev.toString());
			}
		}

	}

	@Override
	public long stoc() {

		long stocRevista = listaRevista.size();

		return stocRevista;
	}

	@Override
	public void imprumuta() {

		if (listaRevista.isEmpty()) {

			System.out.println(emptyList + " Nu poti imprumuta reviste.");

		} else {

			try {

				System.out.println("Stocul de reviste este: " + stoc() + " bucati." + "\nPoti imprumuta reviste.");
				System.out.println(blankString);

				int i = 0;

				System.out.println("Lista revistelor este: ");

				for (Revista r : listaRevista) {
					System.out.println(blankString);
					System.out.println("Index: " + (i++) + separatorTab + r);

				}
				
				System.out.println(blankString);
				System.out.println("Scrie numele tau: ");
				String nume = input.next();
				System.out.println(blankString);
				System.out.println("Scrie INDEXUL revistei pentru imprumut: ");
				int index = input.nextInt();

				Revista r = listaRevista.get(index);
				listaRevImprumut.add(r);
				listaRevista.remove(index);
				
				System.out.println("Revista cu indexul " + index + " a fost imprumutata de " + nume);
				System.out.println("Numarul revistelor ce mai pot fi imprumutate este: " + stoc());

			} catch (IndexOutOfBoundsException e) {
				System.out.println("Index incorect.");
			}

		}

	}

	@Override
	public void returneaza() {

		if (listaRevImprumut.isEmpty()) {
			System.out.println(emptyList);
		} else {

			try {

				System.out.println("Stocul de reviste imprumutate este: " + stocImprumut() + " bucati.");
				System.out.println(blankString);

				int i = 0;

				for (Revista r : listaRevImprumut) {
					System.out.println("Lista revistelor imprumutate este: ");
					System.out.println(blankString);
					System.out.println("Index: " + (i++) + separatorTab + r);

				}

				System.out.println(blankString);
				System.out.println("Scrie INDEXUL revistei pentru returnare: ");
				int index = input.nextInt();

				Revista r = listaRevImprumut.get(index);
				listaRevista.add(r);
				listaRevImprumut.remove(index);

				System.out.println("Numarul revistelor ce pot fi returnate este: " + stocImprumut());

			} catch (IndexOutOfBoundsException e) {
				System.out.println("Index incorect.");
			}

		}

	}

	@Override
	public long stocImprumut() {

		long stocRevImprumut = listaRevImprumut.size();

		return stocRevImprumut;
	}
}

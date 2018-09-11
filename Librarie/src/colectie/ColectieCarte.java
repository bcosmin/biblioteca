package colectie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import publicatie.Carte;
import system.Constante;
import system.Functie;

public class ColectieCarte implements Constante, Functie {

	protected Scanner input = new Scanner(System.in);

	private List<Carte> listaCarte = new ArrayList<>();
	private List<Carte> listaCarteImprumut = new ArrayList<>();

	public ColectieCarte() {
		listaCarte = new ArrayList<>();
	}

	@Override
	public void adauga() {

		System.out.println("Scrie cate carti vrei sa adaugi in librarie: ");

		int numarBucatiKey = input.nextInt();

		for (int i = 1; i <= numarBucatiKey; i++) {

			System.out.println(wIsbn);
			String isbn = input.next();

			System.out.println(wTitlu);
			String titlu = input.next();

			System.out.println(wAutori);
			String autori = input.next();

			System.out.println(wTematica);
			String tematica = input.next();
			System.out.println(longLine);
			System.out.println(blankString);

			Carte c = new Carte(isbn, titlu, autori, tematica);

			c.setIsbn(isbn);
			c.setTitlu(titlu);
			c.setAutori(autori);
			c.setTematica(tematica);

			listaCarte.add(c);

			if (listaCarte.size() > listaCarte.size() - 1) {
				System.out.println("Carte adaugata cu succes!");
				// System.out.println(listaRevista.size());
				System.out.println(blankString);
			} else {
				System.out.println("Cartea nu s-a adaugat.");
				// System.out.println(listaRevista.size());
				System.out.println(blankString);
			}
		}
	}

	@Override
	public void elimina() {

		if (listaCarte.isEmpty()) {
			System.out.println(emptyList);
		} else {

			int i = 0;

			for (Carte c : listaCarte) {
				System.out.println("Index: " + (i++) + separatorTab + c);
			}

			System.out.println("Scrie INDEXUL cartii: ");
			int index = input.nextInt();
			listaCarte.remove(index);

			if (listaCarte.size() < listaCarte.size() + 1) {
				System.out.println("A fost eliminat cu succes indexul: " + index);
				// listaCarte.size();
			} else {
				System.out.println("Indexul " + index + " nu a fost eliminat");
				// listaCarte.size();
			}
		}

	}

	@Override
	public void afiseaza() {

		if (listaCarte.isEmpty()) {
			System.out.println("Carti: " + emptyList);
		} else {
			for (Carte cr : listaCarte) {
				System.out.println(cr.toString());
			}
		}

	}

	@Override
	public long stoc() {
		long stocCarte;

		stocCarte = listaCarte.size();

		return stocCarte;
	}

	@Override
	public void imprumuta() {
		if (listaCarte.isEmpty()) {

			System.out.println(emptyList + " Nu poti imprumuta carti.");

		} else {

			try {

				System.out.println("Stocul de carti este: " + stoc() + " bucati." + "\nPoti imprumuta carti.");
				System.out.println(blankString);

				int i = 0;

				System.out.println("Lista cartilor este: ");

				for (Carte c : listaCarte) {
					System.out.println(blankString);
					System.out.println("Index: " + (i++) + separatorTab + c);

				}

				System.out.println(blankString);
				System.out.println("Scrie numele tau: ");
				String nume = input.next();
				System.out.println(blankString);
				System.out.println("Scrie INDEXUL cartii pentru imprumut: ");
				int index = input.nextInt();

				Carte c = listaCarte.get(index);
				listaCarteImprumut.add(c);
				listaCarte.remove(index);

				System.out.println("Cartea cu indexul " + index + " a fost imprumutata de " + nume);
				System.out.println("Numarul cartilor ce mai pot fi imprumutate este: " + stoc());

			} catch (IndexOutOfBoundsException e) {
				System.out.println("Index incorect.");
			}

		}

	}

	@Override
	public void returneaza() {
		if (listaCarteImprumut.isEmpty()) {
			System.out.println(emptyList);
		} else {

			try {

				System.out.println("Stocul de carti imprumutate este: " + stocImprumut() + " bucati.");
				System.out.println(blankString);

				int i = 0;

				for (Carte c : listaCarteImprumut) {
					System.out.println("Lista cartilor imprumutate este: ");
					System.out.println(blankString);
					System.out.println("Index: " + (i++) + separatorTab + c);

				}

				System.out.println(blankString);
				System.out.println("Scrie INDEXUL cartii pentru returnare: ");
				int index = input.nextInt();

				Carte c = listaCarteImprumut.get(index);
				listaCarte.add(c);
				listaCarteImprumut.remove(index);

				System.out.println("Numarul cartilor ce pot fi returnate este: " + stocImprumut());

			} catch (IndexOutOfBoundsException e) {
				System.out.println("Index incorect.");
			}

		}

	}

	@Override
	public long stocImprumut() {

		long stocCarteImprumut = listaCarteImprumut.size();

		return stocCarteImprumut;
	}

}

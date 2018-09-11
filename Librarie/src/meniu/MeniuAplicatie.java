package meniu;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import colectie.ColectieCarte;
import colectie.ColectieEnciclopedie;
import colectie.ColectieRevista;
import system.Constante;

public class MeniuAplicatie implements Constante {

	private ColectieRevista colectieRevista = new ColectieRevista();
	private ColectieCarte colectieCarte = new ColectieCarte();
	private ColectieEnciclopedie colectieEnciclopedie = new ColectieEnciclopedie();

	private Scanner input = new Scanner(System.in);

	private ListaMeniu listaMeniu = new ListaMeniu();

	private void afiseazaTop() {

		System.out.println(lineSeparator);
		System.out.println("+---------- MENIU BIBLIOTECA --------+");
		System.out.println(lineSeparator);
	}

	private void afiseazaContinut() {

		listaMeniu.printMeniuPrincipal();

	}

	public void afiseazaMeniuAplicatie() {
		boolean exit = false;
		List<String> optiuni = Arrays.asList(new String[] { "1", "2", "3", "4", "5", "6" });
		String optiune = "";

		while (!exit) {
			afiseazaTop();
			afiseazaContinut();
			optiune = input.nextLine();
			if (optiuni.contains(optiune))
				break;
		}

		switch (optiune) {
		case "1": // submeniu revista
			listaMeniu.printMeniuRevista();
			optiune = input.nextLine();

			if (optiune.equals("a")) {
				colectieRevista.adauga();
				System.out.println(blankSpace);
				afiseazaMeniuAplicatie();
			} else if (optiune.equals("b")) {
				colectieRevista.elimina();
				System.out.println(blankSpace);
				afiseazaMeniuAplicatie();
			} else if (optiune.equals("c")) {
				colectieRevista.afiseaza();
				System.out.println(blankSpace);
				afiseazaMeniuAplicatie();
			} else if (optiune.equals("d")) {
				System.out.println("Stocul de reviste este: " + colectieRevista.stoc() + " bucati");
				System.out.println(blankSpace);
				afiseazaMeniuAplicatie();
			} else if (optiune.equals("e")) {
				colectieRevista.imprumuta();
				System.out.println(blankSpace);
				afiseazaMeniuAplicatie();
			} else if (optiune.equals("f")) {
				colectieRevista.returneaza();
				System.out.println(blankSpace);
				afiseazaMeniuAplicatie();
				System.out.println(blankSpace);
			} else if (optiune.equals("g")) {
				afiseazaMeniuAplicatie();
			} else {
				System.out.println("Selectie incorecta.");
				afiseazaMeniuAplicatie();
			}

			break;

		case "2": // submeniu carte
			listaMeniu.printMeniuCarte();
			optiune = input.nextLine();

			if (optiune.equals("a")) {
				colectieCarte.adauga();
				System.out.println(blankSpace);
				afiseazaMeniuAplicatie();
			} else if (optiune.equals("b")) {
				colectieCarte.elimina();
				System.out.println(blankSpace);
				afiseazaMeniuAplicatie();
			} else if (optiune.equals("c")) {
				colectieCarte.afiseaza();
				System.out.println(blankSpace);
				afiseazaMeniuAplicatie();
			} else if (optiune.equals("d")) {
				System.out.println("Stocul de carti este: " + colectieCarte.stoc() + " bucati");
				System.out.println(blankSpace);
				afiseazaMeniuAplicatie();
			} else if (optiune.equals("e")) {
				colectieCarte.imprumuta();
				System.out.println(blankSpace);
				afiseazaMeniuAplicatie();
			} else if (optiune.equals("f")) {
				colectieCarte.returneaza();
				System.out.println(blankSpace);
				afiseazaMeniuAplicatie();
			} else if (optiune.equals("g")) {
				afiseazaMeniuAplicatie();
			} else {
				System.out.println("Selectie incorecta.");
				afiseazaMeniuAplicatie();
			}

			break;

		case "3": // submeniu enciclopedie
			listaMeniu.printMeniuEnciclopedie();
			optiune = input.nextLine();

			if (optiune.equals("a")) {
				colectieEnciclopedie.adauga();
				System.out.println(blankSpace);
				afiseazaMeniuAplicatie();
			} else if (optiune.equals("b")) {
				colectieEnciclopedie.elimina();
				System.out.println(blankSpace);
				afiseazaMeniuAplicatie();
			} else if (optiune.equals("c")) {
				colectieEnciclopedie.afiseaza();
				System.out.println(blankSpace);
				afiseazaMeniuAplicatie();
			} else if (optiune.equals("d")) {
				System.out.println("Stocul de enciclopedii este: " + colectieEnciclopedie.stoc() + " bucati");
				System.out.println(blankSpace);
				afiseazaMeniuAplicatie();
			} else if (optiune.equals("e")) {
				colectieEnciclopedie.imprumuta();
				System.out.println(blankSpace);
				afiseazaMeniuAplicatie();
			} else if (optiune.equals("f")) {
				colectieEnciclopedie.returneaza();
				System.out.println(blankSpace);
				afiseazaMeniuAplicatie();
			} else if (optiune.equals("g")) {
				afiseazaMeniuAplicatie();
			} else {
				System.out.println("Selectie incorecta.");
				afiseazaMeniuAplicatie();
			}

			break;
		case "4":
			listaPublicatii();
			afiseazaMeniuAplicatie();
			break;
		case "5":
			stocPublicatie();
			afiseazaMeniuAplicatie();
			break;
		case "6":
			System.out.println(thk);
			System.exit(0);
			break;
		default:
			System.out.println("Selectie incorecta.");
			afiseazaMeniuAplicatie();
			break;
		}

	}

	private void stocPublicatie() {

		long stocTotal = colectieRevista.stoc() + colectieCarte.stoc() + colectieEnciclopedie.stoc();
		long stocImprumut = colectieRevista.stocImprumut() + colectieCarte.stocImprumut() + colectieEnciclopedie.stocImprumut();

		
		System.out.println(lineSeparator);
		System.out.format(format, blankString, "STOC", "IMPRUMUT");
		System.out.println(lineSeparator);
		System.out.format(format, "Reviste", colectieRevista.stoc(), colectieRevista.stocImprumut());
		System.out.println(lineSeparator);
		System.out.format(format, "Carti", colectieCarte.stoc(), colectieCarte.stocImprumut());
		System.out.println(lineSeparator);
		System.out.format(format, "Enciclopedii", colectieEnciclopedie.stoc(), colectieEnciclopedie.stocImprumut());
		System.out.println(lineSeparator);
		System.out.format(format, "TOTAL", stocTotal, stocImprumut);
		System.out.println(lineSeparator);
		System.out.println(blankString);
		
	}

	private void listaPublicatii() {

		colectieRevista.afiseaza();
		colectieCarte.afiseaza();
		colectieEnciclopedie.afiseaza();
	}

}

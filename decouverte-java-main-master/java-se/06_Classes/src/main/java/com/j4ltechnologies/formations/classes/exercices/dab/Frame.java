package com.j4ltechnologies.formations.classes.exercices.dab;

public class Frame {
	
	public void affichagePreCard() {
		System.out.println("Selectionnez le compte");
	}
	
	public void affichage() {
	System.out.printf("\n0 - %s\n", Menu.VIREMENT);
	System.out.printf("1 - %s\n", Menu.RETRAIT);
	System.out.printf("2 - %s\n", Menu.DEPOT);
	System.out.printf("3 - %s\n", Menu.SOLDE);
	System.out.printf("4 - %s\n", Menu.QUITTER);

	System.out.println();

	System.out.print("Faites votre choix : ");
	}

}

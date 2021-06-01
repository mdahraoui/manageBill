package com.j4ltechnologies.formations.io;

import java.util.Scanner;

public class Saisie {

	public static void main(String[] args) {

		// Creer un objet Scanner pour lire les entrées clavier
		Scanner saisie = new Scanner(System.in);

		System.out.print("Entrez votre prenom : ");
		String prenom = saisie.nextLine();
		System.out.println("Votre prenom est " + prenom);
		
		System.out.print("Entrez le nb de bouteilles : ");
		int nbBouteilles = saisie.nextInt();
		System.out.println("nbBouteilles =  " + nbBouteilles);

		System.out.print("Entrez votre prenom : ");
		prenom = saisie.next();
		System.out.println("Votre prenom est " + prenom);
				
		saisie.close();		
	}
}

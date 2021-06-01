package com.j4ltechnologies.formations.decision;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		System.out.print("N° Etage : ");
		if (saisie.hasNextInt()) {
			// Ici l'utilisateur a saisi un entier
			int etage = saisie.nextInt();

			// On traite d'abord les cas invalide
			if (etage == 13) {
				System.out.println("Erreur, l'etage 13 n'existe pas");
			} else if (etage >= 0 && etage <= 20) {
				// Ici la saisie est valide
				int etageReel = etage;
				if (etage > 13) {
					etageReel = etage - 1;
				}
				System.out.println("L'ascenseur se rendra à l'etage " + etageReel);
			}else {
				System.out.println("Etage inexistant");
			}
		} else {
			// Ici la saise utilisateur n'est bonne
			System.out.println("Un entier est attendu comme N° d'etage");
		}		
		saisie.close();
	}
}

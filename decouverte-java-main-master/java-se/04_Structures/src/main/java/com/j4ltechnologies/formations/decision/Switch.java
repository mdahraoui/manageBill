package com.j4ltechnologies.formations.decision;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		System.out.print("N° Jour :");

		if (saisie.hasNextInt()) {
			// ici la saisie est un entier
			int numero = saisie.nextInt();

//			String jourDeLaSemaine;

//			switch (numero) {
//
//			case 1:
//				jourDeLaSemaine = "Lundi";
//				break;
//
//			case 2:
//				jourDeLaSemaine = "Mardi";
//				break;
//
//			case 3:
//				jourDeLaSemaine = "Mercredi";
//				break;
//
//			case 4:
//				jourDeLaSemaine = "Jeudi";
//				break;
//
//			case 5:
//				jourDeLaSemaine = "Vendredi";
//				break;
//
//			case 6:
//				jourDeLaSemaine = "Samedi";
//				break;
//
//			case 7:
//				jourDeLaSemaine = "Dimanche";
//				break;
//
//			default:
//				jourDeLaSemaine = "Numero de jour inconnu du systeme";
//				break;
//			}

			// Depuis Java 14, il est possible d'ecrire le switch comme suit :
			String jourDeLaSemaine = switch (numero) {
				case 1 -> "Lundi";
				case 2 -> "Mardi";
				case 3 -> "Mercredi";
				case 4 -> "Jeudi";
				case 5 -> "Vendredi";
				case 6 -> "Samedi";
				case 7 -> "Dimanche";
				default -> "Numero de jour inconnu du systeme";
			};

			System.out.println(numero + " --> " + jourDeLaSemaine);
		} else {
			// ici la saisie n'est pas un entier
			System.out.println("Un entier est attendu comme N° de jour");
		}

		saisie.close();
	}
}

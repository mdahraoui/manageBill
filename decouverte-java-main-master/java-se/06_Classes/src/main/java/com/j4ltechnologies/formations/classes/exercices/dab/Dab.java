package com.j4ltechnologies.formations.classes.exercices.dab;

import java.util.Scanner;

public class Dab {

	private Compte[] comptes;
	
	public Dab() {
		comptes = init();
	}

	public Compte[] getComptes() {
		return comptes;
	}
	
	public void activer() {
		
		Scanner scanner = new Scanner(System.in);		
		Frame frame = new Frame();
		String numero;
		
		do {
			frame.affichagePreCard();
			numero = scanner.next();
			
			if(!compteExist(numero)) {
				System.out.println("Attention ce compte est inexitant dans cette bank !!!\n");
			}			
		}while(!compteExist(numero));
		
		Compte compte = getCompteByNumero(numero);
		
		String saisie;				

		do {
			frame.affichage();
			saisie = scanner.next();
			
			StringBuilder affichage;
			affichage = new StringBuilder("Vous avez fait le choix ");

			switch (saisie) {
			
			case "0" ->{
				System.out.println(affichage.toString() + saisie);
				System.out.print("Montant du virement: ");

				if (scanner.hasNextInt()) {
					int montantDuVirement = scanner.nextInt();
					System.out.println("Vers quel compte souhaitez vous effectuer ce virement");
					do {
						System.out.print("Selectionnez le compte: ");
						numero = scanner.next();
						
						if(!compteExist(numero)) {
							System.out.println("Attention ce compte est inexitant dans cette bank !!!\n");
						}			
					}while(!compteExist(numero));
					Compte accountToTransferTo = getCompteByNumero(numero);
					System.out.println(compte.infos() + "   " + accountToTransferTo.infos());
					compte.virer(montantDuVirement,accountToTransferTo);
					System.out.println("Virement effectué" +compte.infos() + "   " + accountToTransferTo.infos());
					
				} else {
					System.out.println("Le montant du retrait est un entier");
					scanner = new Scanner(System.in);
				}
				
			}
			
			case "1" -> {
				System.out.println(affichage.toString() + saisie);
				System.out.print("Montant du retrait: ");

				if (scanner.hasNextInt()) {
					int montantDuRetrait = scanner.nextInt();
					compte.retirer(montantDuRetrait);
				} else {
					System.out.println("Le montant du retrait est un entier");
					scanner = new Scanner(System.in);
				}
			}
			case "2" -> {
				System.out.println(affichage.toString() + saisie);
				System.out.print("Montant du depot: ");

				if (scanner.hasNextInt()) {
					int montantDuDepot = scanner.nextInt();
					compte.deposer(montantDuDepot);
				} else {
					System.out.println("Le montant du depot doit etre un entier\n");
					scanner = new Scanner(System.in);
				}
			}
			case "3" -> {
				System.out.println(affichage.toString() + saisie);
				System.out.println("Votre solde est " + compte.getSolde());
			}
			case "4" -> {
				System.out.println(affichage.toString() + saisie);
				System.out.println("Fin des operations");
			}
				
			default -> System.out.println("Vous devez entrer un choix valide !!!");
			}

		} while (!saisie.equals("4"));
		scanner.close();
	}

	private Compte[] init() {
		
		Compte[] cpts = new Compte[10];
		int[] soldes = { 100, 53, 78, 951, 74, 36, 158, 752, 321, 963 };
		
		for (int i = 0; i < cpts.length; i++) {
			cpts[i] = new Compte("CPT" + (i + 1), soldes[i]);
		}		
		return cpts;
	}
	
	private boolean compteExist(String numero) {
		boolean existe = false;
		for (Compte compte : comptes) {
			if(compte.getNumero().equalsIgnoreCase(numero)) {
				existe = true;
				break;
			}
		}
		return existe;
	}
	
	public Compte getCompteByNumero(String numero) {
		Compte cpte = null;
		for (Compte compte : comptes) {
			if(compte.getNumero().equalsIgnoreCase(numero)) {
				cpte = compte;
				break;
			}
		}
		return cpte;
	}
	
	/*
	 * public void selectionCompte() { Scanner scanner = new Scanner(System.in);
	 * 
	 * String numero; do { System.out.print("Selectionnez le compte: "); numero =
	 * scanner.next();
	 * 
	 * if(!compteExist(numero)) {
	 * System.out.println("Attention ce compte est inexitant dans cette bank !!!\n"
	 * ); } }while(!compteExist(numero)); }
	 */
}
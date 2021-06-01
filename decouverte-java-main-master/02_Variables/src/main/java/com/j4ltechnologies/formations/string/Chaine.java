package com.j4ltechnologies.formations.string;

public class Chaine {
	public static void main(String[] args) {
		// Declaration d'une chaine de caracteres
		String prenom = "Joachim";
		String uneChaineVide = "";
		System.out.printf("prenom = %s\nuneChaineVide = %s\n", prenom, uneChaineVide);

		System.out.println("longueur = " + prenom.length());
		System.out.println("Maj = " + prenom.toUpperCase());
		System.out.println(prenom.charAt(prenom.length() - 1));

		String salut = "Bonjour";
		System.out.println(salut.substring(2));
		System.out.println(salut.substring(2, 4));
		System.out.println(salut.startsWith("B"));
		
		String nom = new String();
	}
}

// Le type String n'est pas un type primitif
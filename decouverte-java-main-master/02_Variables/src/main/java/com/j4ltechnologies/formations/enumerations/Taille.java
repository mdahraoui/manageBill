package com.j4ltechnologies.formations.enumerations;

import java.util.Arrays;

public enum Taille {
	PETIT, MOYEN, GRAND, TRES_GRAND
}

enum Civilite {
	MADAME, MONSIEUR
}

class TestTaille {
	public static void main(String[] args) {
		// Declaration d'une variable de type enum
		Taille taille = Taille.GRAND;
		System.out.println("taille = " + taille);
		System.out.println(Arrays.toString(Taille.values()));
		
		Civilite c = Civilite.MADAME;
	}
}
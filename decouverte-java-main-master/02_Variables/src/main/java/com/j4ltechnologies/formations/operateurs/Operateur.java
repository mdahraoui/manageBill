package com.j4ltechnologies.formations.operateurs;

public class Operateur {

	public static void main(String[] args) {

		/*
		 * Operateurs Arithmetiques (+,-,*,/,%) Operateurs Relationnels
		 * (>,>=,==,!=,<=,<) Operateurs Assignations (=, ++)
		 */
		int poids = 15;

		System.out.printf("poids = %s%n", poids);

		// poids++; Operateur de post-incrementation

		System.out.printf("poids = %s%n", poids++);

		// ++poids; Operateur de pre-incrementation
		System.out.printf("poids = %s%n", ++poids);

		// poids--; Operateur de post-decrementation

		System.out.printf("poids = %s%n", poids--);

		// --poids; Operateur de pre-decrementation
		System.out.printf("poids = %s%n", --poids);

		poids += 5;// poids = poids + 5;
		System.out.printf("poids = %s%n", poids);

		/*
		 * Les Operateurs Logiques
		 */

		boolean a = true;
		boolean b = false;

		System.out.printf("a && b = %s%n", a && b);
		System.out.printf("a & b = %s%n", a & b);

		System.out.printf("a || b = %s%n", a || b);
		System.out.printf("a | b = %s%n", a | b);
		
		System.out.printf("a ^ b = %s%n", a ^ b);
		System.out.printf("!a = %s%n", !a);
	}
}

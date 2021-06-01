package com.j4ltechnologies.formations.iteratives;

public class BoucleWhile {

	public static void main(String[] args) {

		int compteur = 12, val = 3;

		while (compteur < 11) {
			System.out.printf("%d x %d = %d\n", val, compteur, val * compteur);
			compteur++;
		}
		
		/*
         * Exercice : Table de multiplication
         */
        System.out.println("\n============= MULTIPLICATION =============\n");
        int j = 1;

        while (j <= 10) {
            int k = 1;
            while (k <= 10) {
                System.out.println(j + " x " + k + " = " + (j * k));
                k++;
            }
            j++;
            System.out.println();
        }
	}
}

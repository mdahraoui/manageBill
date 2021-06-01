package com.j4ltechnologies.formations.iteratives;

public class RuptureBreak {

	public static void main(String[] args) {

		int compteur = 1, val = 3;

		while (compteur < 11) {
			if(compteur == 5) {
				break;
			}
			System.out.printf("%d x %d = %d\n", val, compteur, val * compteur);
			compteur++;
		}
	}
}
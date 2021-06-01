package com.j4ltechnologies.formations.primitifs;

public class TypeChar {
	public static void main(String[] args) {
		System.out.println("====== Type CHAR =====");

		// Declaration d'un char
		char unChar = 'f';
		System.out.println("unChar = " + unChar);

		// Promotion d'un char en int
		int charMin = Character.MIN_VALUE;
		System.out.println("minChar  = " + charMin);

		int charMax = Character.MAX_VALUE;
		System.out.println("maxChar  = " + charMax);

		charMin = '\u0000';
		charMax = '\uffff';
		
		System.out.println("minChar  = " + charMin);
		System.out.println("maxChar  = " + charMax);
	}
}

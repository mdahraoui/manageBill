package com.j4ltechnologies.formations.primitifs;

public class Conversion {

	public static void main(String[] args) {

		byte unByte = 45;
		int unInt, grandInt;

		System.out.printf("unByte = %s\n", unByte);

		unInt = 45;
		System.out.printf("\n", unInt);

		unInt = unByte; //Conversion implicite
		System.out.printf("unInt = %s\n", unInt);

		unByte = (byte) unInt; //Conversion explicite
		System.out.printf("unByte = %s\n", unByte);

		grandInt = 456;
		unByte = (byte) grandInt; //Conversion explicite
		System.out.printf("unByte = %s\n", unByte);
	}
}

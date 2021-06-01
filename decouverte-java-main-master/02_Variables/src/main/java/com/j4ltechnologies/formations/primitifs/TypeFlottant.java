package com.j4ltechnologies.formations.primitifs;

public class TypeFlottant {

	public static void main(String[] args) {
		System.out.println("==== Type float ====\n");
		/*
		 * Le type float est un flottant sign� et cod� sur 4 octets soit 32-bits Sa valeur
		 * par defaut est 0
		 */
		float unFloat = -2698.25f;
		System.out.printf("unFloat = %s\n", unFloat);
		System.out.printf("floatMin = %s\n", Float.MIN_VALUE);
		System.out.printf("floatMax = %s\n", Float.MAX_VALUE);

		System.out.println("\n==== Type double ====\n");

		/*
		 * Le type double est un entier sign� et cod� sur 8 octets soit 64-bits Sa valeur
		 * par defaut est 0
		 */
		double unDouble = -269878965.36;
		System.out.printf("unDouble = %s%n", unDouble);
		System.out.printf("doubleMin = %s%n", Double.MIN_VALUE);
		System.out.printf("doubleMax = %s%n", Double.MAX_VALUE);
		
		System.out.printf("divideByZero = %s%n", unDouble/0);
		System.out.printf("divideByInfiny = %s%n", unDouble/Double.POSITIVE_INFINITY);
		System.out.printf("NaN = %s%n", Double.NaN);
		System.out.printf("0/0 = %s%n", 0/0.);
	}

}

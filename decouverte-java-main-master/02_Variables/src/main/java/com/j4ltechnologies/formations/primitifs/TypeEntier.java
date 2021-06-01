package com.j4ltechnologies.formations.primitifs;

import java.math.BigInteger;

public class TypeEntier {

	public static void main(String[] args) {

		System.out.println("==== Type byte ====\n");

		/*
		 * Le type byte est un entier sign� et cod� sur 1 octet soit 8-bits Sa valeur
		 * par defaut est 0
		 */
		byte unByte = -56;
		System.out.println(String.format("unByte = %s", unByte));
		System.out.println(String.format("byteMin = %s", Byte.MIN_VALUE));
		System.out.println(String.format("byteMax = %s", Byte.MAX_VALUE));

		System.out.println("\n==== Type short ====\n");

		/*
		 * Le type short est un entier sign� et cod� sur 2 octets soit 16-bits Sa valeur
		 * par defaut est 0
		 */
		short unShort = -2698;
		System.out.println(String.format("unShort = %s", unShort));
		System.out.println(String.format("shortMin = %s", Short.MIN_VALUE));
		System.out.println(String.format("shortMax = %s", Short.MAX_VALUE));

		System.out.println("\n==== Type int ====\n");

		/*
		 * Le type int est un entier sign� et cod� sur 4 octets soit 32-bits Sa valeur
		 * par defaut est 0
		 */
		int unInt = -2698;
		System.out.println(String.format("unInt = %s", unInt));
		System.out.println(String.format("intMin = %s", Integer.MIN_VALUE));
		System.out.println(String.format("intMax = %s", Integer.MAX_VALUE));

		System.out.println("\n==== Type long ====\n");

		/*
		 * Le type long est un entier sign� et cod� sur 8 octets soit 64-bits Sa valeur
		 * par defaut est 0
		 */
		long unLong = -269878965;
		System.out.println(String.format("unLong = %s", unLong));
		System.out.println(String.format("longMin = %s", Long.MIN_VALUE));
		System.out.println(String.format("longMax = %s", Long.MAX_VALUE));

		unLong = 12583698547l;

		/*
		 * Cas partibulier des entiers hors limites du primitif
		 */
		BigInteger bi1, bi2;
		bi1 = new BigInteger("7895");
		bi2 = new BigInteger("8412");
		System.out.println(String.format("bi1 = %s", bi1));
		System.out.println(String.format("bi2 = %s", bi2));
		System.out.println(String.format("bi1 + bi2 = %s", bi1.add(bi2)));

		System.out.println(String.format("divideByZero = %s", unInt/0.0));
	}
}

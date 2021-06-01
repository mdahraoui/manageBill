package com.j4ltechnologies.formations.classes.string;

public class TestString {

	public static void main(String[] args) {

//		String str1 = "coucou";
//		System.out.println(str1);
//
//		String str2 = new String(str1);
//		System.out.println(str2);
//
//		String str3 = new String(new char[] { 'c', 'o', 'u', 'c', 'o', 'u' });
//		System.out.println(str3);
//
//		System.out.printf("str1 == str2 : %s\n", str1 == str2);
//		System.out.printf("str1.equals(str2) : %s\n\n", str1.equals(str2));
//
//		// str1 = str1 + " Joachim";
//		StringBuilder sb = new StringBuilder();
//		sb.append("Bonjour");
//		System.out.println(sb);
//		sb.append(" Joachim");
//		System.out.println(sb);

//		String str1 = "";
		StringBuilder builder = new StringBuilder();
		final int MAX = 1000000000;
		long depart = System.currentTimeMillis();

		for (int i = 0; i < MAX; i++) {
			builder.append('q');
		}
		
		
		long tempsPerformance = System.currentTimeMillis() - depart;
		System.out.println("String --> " + tempsPerformance);

	}

}

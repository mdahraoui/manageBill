package com.j4ltechnologies.formations.classes.test;

import com.j4ltechnologies.formations.classes.Compte;
import com.j4ltechnologies.formations.classes.Personne;

import java.time.LocalDate;

public class TestClasse {

    public static void main(String[] args) {

        // Declaration d'une variable de type Compte
        //Compte a;

        // Initialisation ou instanciation de la variable
//        a = new Compte();// On cree un objet que l'on place dans a
//        System.out.println("N°a = " + a.getNumero());
//        System.out.println("a.getSolde() = " + a.getSolde());
//
//        Compte b = new Compte();
//        System.out.println("b.getSolde = " + b.getSolde());
//        System.out.println("N°b = " + b.getNumero());

        Compte a = new Compte("N°1");
//        System.out.println("a.getNumero() = " + a.getNumero());
//        System.out.println("a.getSolde() = " + a.getSolde());
//        System.out.println(a.description());
//        System.out.println("nbCompte--> " + Compte.getNbCompte());
//
//        Compte b = new Compte("N°2", 1000);
//        System.out.println("nbCompte--> " + Compte.getNbCompte());
//
//        Compte c = new Compte("N°3", 500);
//        System.out.println("nbCompte--> " + Compte.getNbCompte());

//        System.out.println(b.description());
//
//        b.crediter(20);
//        System.out.println(b.description());
//
//        b.debiter(800);
//        System.out.println(b.description());

        Personne julie = new Personne("Julie", LocalDate.of(2000, 3, 12));
//        System.out.println(julie.description());

        Personne francois = new Personne("Francois", LocalDate.of(1999, 12, 24));
//        System.out.println(francois.description());

        //Mariage effectué ici
        francois.seMarier(julie);
        System.out.println(francois.description());
    }

    boolean isMultiple(int a, int b) {
        return a % b == 0;
    }
}

package com.j4ltechnologies.formations.classes.exercices.dab.test;

import com.j4ltechnologies.formations.classes.exercices.dab.Compte;

public class CompteTest {
    public static void main(String[] args) {

        Compte compte = new Compte("001", 5500);

        //Depot de 500 €
        compte.deposer(500);
        System.out.println(compte.infos());

        compte.retirer(2500);
        System.out.println(compte.infos());
    }
}

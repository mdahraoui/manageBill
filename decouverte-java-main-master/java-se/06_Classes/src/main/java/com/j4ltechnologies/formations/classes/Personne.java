package com.j4ltechnologies.formations.classes;

import java.time.LocalDate;
import java.time.Period;

/**
 * Classe Personne, créée le 12/04/2021 à 13:40
 *
 * @author Joachim Zadi
 * @version 1.0 du 12/04/2021
 */
public class Personne {
    //Attributs
    private String prenom;
    private LocalDate ddn;
    private Personne conjoint;

    //Constructeur
    public Personne(String prenom, LocalDate ddn) {
        this.prenom = prenom;
        this.ddn = ddn;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getDdn() {
        return ddn;
    }

    public Personne getConjoint() {
        return conjoint;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        Period p = Period.between(ddn, LocalDate.now());
        int age = p.getYears();
        return age;
    }

    public void seMarier(Personne pp) {
        if (getAge() >= 18 && pp.getAge() >= 18 && conjoint == null && pp.conjoint == null) {
            conjoint = pp;
            pp.conjoint = this;
        }
    }

    public String description() {
        String affichage = String.format("%s, %s ans ", prenom, getAge());
        if (conjoint != null) {
            affichage += String.format("a pour conjoint %s, %s ans", conjoint.prenom, conjoint.getAge());
        }
        return affichage;
    }
}

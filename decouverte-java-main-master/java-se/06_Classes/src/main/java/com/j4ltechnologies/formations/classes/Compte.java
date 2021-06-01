package com.j4ltechnologies.formations.classes;

public class Compte {

    //Les attributs ou champs
    //Ils doivent etre de preferences private
    //On parle d'encapsulation
    private double solde;
    private String numero;

    //Attribut de classe
    private static int nbCompte;

    //Constructeurs
    public Compte(String n) {
        numero = n;
        solde = 80;
        nbCompte++;
    }

    public Compte(String n, double depot) {
        numero = n;
        solde = depot + 80;
        nbCompte++;
    }

    /**
     * Getter ou un acces en lecture de l'attribut solde
     *
     * @return
     */
    public double getSolde() {
        return solde;
    }

    public String getNumero() {
        return numero;
    }

    public static int getNbCompte() {
        return nbCompte;
    }

    public void crediter(double montant) {
        if (montant > 0) {
            solde += montant;
        }
    }

    public boolean debiter(double montant) {
        boolean resultat = false;
        if (montant > 0 && solde >= montant) {
            solde -= montant;
            resultat = true;
        }
        return resultat;
    }

    public String description() {
        return "[N°: " + numero + ", Solde: " + solde + "]";
    }
}

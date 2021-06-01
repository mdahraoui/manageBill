package com.j4ltechnologies.formations.classes.exercices.dab;

/**
 * @author Stagiaire
 *
 */
public class Compte {
    private String numero;
    private int solde;

    public Compte(String numero) {
        this(numero, 0);
    }

    public Compte(String numero, int solde) {
        this.numero = numero;
        this.solde = solde;
    }

    /**
     * @return Le numero du compte
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @return Le solde du compte
     */
    public int getSolde() {
        return solde;
    }

    /**
     * Permet de crediter un compte avec la somme passée en parametre
     *
     * @param s la somme à crediter
     */
    public void deposer(int s) {
        if (s > 0) {
            solde += s;
        }
    }

    /**
     * Permet de debiter un compte de la somme passée en parametre
     *
     * @param s La somme à debiter
     */
    public void retirer(int s) {
        if (s > 0 && s < solde) {
            solde -= s;
        }
    }
    
    
    /**
     * Permet d'effectuer un virement de la somme passée en parametre
     * 
     * @param montant La somme à virer
     * 
     * @param c Le compte vers lequel virer
     */
    public void virer(int montant,Compte c) {
    	
    	c.deposer(montant);
    	retirer(montant);
    }

    /**
     * @return La description textuelle du compte courant
     */
    public String infos() {
        return String.format("Compte[Num: %s, Solde: %s]\n", numero, solde);
    }
}

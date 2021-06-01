package com.j4ltechnologies.formations.classes.exercices.rationnel;

/**
 * Classe Rationnel, créée le 12/04/2021 à 15:01
 *
 * @author Joachim Zadi
 * @version 1.0 du 12/04/2021
 */
public class Rationnel {

    private long numerateur;
    private long denominateur;

    public Rationnel(long numerateur, long denominateur) {
        this.numerateur = numerateur;
        if (denominateur != 0) {
            this.denominateur = denominateur;
        } else {
            System.out.println("Le denominateur ne peut être null");
        }
    }

    public long getNumerateur() {
        return numerateur;
    }

    public void setNumerateur(long numerateur) {
        this.numerateur = numerateur;
    }

    public long getDenominateur() {
        return denominateur;
    }

    public void setDenominateur(long denominateur) {
        if (numerateur != 0) {
            this.denominateur = denominateur;
        }
    }

    @Override
    public String toString() {
        return String.format("%s/%s", numerateur, denominateur);
    }

    public static Rationnel create(long numerateur, long denominateur) {
        return new Rationnel(numerateur, denominateur);
    }

    public Rationnel copy() {
        return create(numerateur, denominateur);
    }

    public Rationnel opposite() {
        return create(-numerateur, denominateur);
    }

    public Rationnel inverse() {
        return create(denominateur, numerateur);
    }

    public void reduce() {
        // ALGO PGCD
        long p = Math.max(numerateur, denominateur);
        long q = Math.min(numerateur, denominateur);
        while (q != 0) {
            long r = p % q;
            p = q;
            q = r;
        }
        numerateur /= p;
        denominateur /= p;
    }

    public boolean isPositive() {
        return numerateur * denominateur > 0;
    }

    public Rationnel add(Rationnel o) {
        long numAdd = numerateur * o.denominateur + denominateur * o.numerateur;
        long denAdd = denominateur * o.denominateur;
        return create(numAdd, denAdd);
    }

    public void addTo(Rationnel o) {
        add(o).reduce();
    }

    public Rationnel sub(Rationnel o) {
        return add(o.opposite());
    }

    public Rationnel multiply(Rationnel other) {
        return create(numerateur * other.numerateur, denominateur * other.denominateur);
    }

    public Rationnel divide(Rationnel other) {
        return multiply(other.inverse());
    }

    public boolean equals(Rationnel other) {
        return numerateur * other.denominateur == denominateur * other.numerateur;
    }
}
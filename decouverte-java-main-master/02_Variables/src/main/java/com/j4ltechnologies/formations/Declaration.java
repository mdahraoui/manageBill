package com.j4ltechnologies.formations;

public class Declaration {
    public static void main(String[] args) {
        // Declaration simple de variable
        int stagiaireId;

        // Assignation d'une valeur à la variable
        stagiaireId = 12;

        System.out.println(stagiaireId);

        // Declaration suivie d'une assignation
        int autreVariable = 45;

        System.out.println("autreVariable = " + autreVariable);

        int var1, var2 = 3, var3;

        // On fait une reassiganation de valeur
        stagiaireId = 25;
        System.out.println("stagiaireId = " + stagiaireId);

        final int UNE_CONSTANTE = -12;
        System.out.println("UNE_CONSTANTE = " + UNE_CONSTANTE);

        // UNE_CONSTANTE = 12;//On ne peut faire de reassignation de valeur sur constante

        // Depuis Java 10, vous n'avez pas besoin de spécifier le type de variable
        // que vous initialisez. Par exemple, au lieu de

        double longueur = 22.5;
        String salut = "Hello";

        // On peut utiliser le mot clé var
        var largeur = 22.5;
        var prenom = "Joachim";
        System.out.printf("largeur = %s\n", largeur);
        System.out.printf("prenom = %s\n", prenom);

        //largeur = "22.5";
    }
}

/*
 * Le nom d'une variable ne contient pas d'espace
 *
 * Le nom d'une variable ne peut commencer par un nombre
 *
 * Le nom d'une variable ne peut etre un nom reservé du Java
 *
 * Depuis Java 10 on peut utiliser l'inference de type pour declarer les variable en Java
 * Une fois le type inferé, on ne peut plus le changer.
 */

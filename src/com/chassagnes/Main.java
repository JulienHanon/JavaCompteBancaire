package com.chassagnes;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        /*
	// write your code here
        int choix;
        Compte compte = new Compte("5112", "Michel", 0);
        do {
            choix = runMenu();
            switch (choix) {
                case 1 -> {
                    double montant = setMontant();
                    compte.deposer(montant);
                    System.out.println(compte);
                }
                case 2 -> {
                    double montant = setMontant();
                    compte.retirer(montant);
                    System.out.println(compte);
                }
                case 3 -> System.out.println(compte);
            }
        }while (choix != 4);

    }

    public static void displayMenu() {
        System.out.println("Opération sur le compte : ");
        System.out.println("1 - Déposer de l'argent");
        System.out.println("2 - Retirer de l'argent");
        System.out.println("3 - Editer le compte");
        System.out.println("4 - Sortir du programme");
        System.out.println("Saisissez votre choix");
    }

    public static int runMenu() {
        displayMenu();
        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();
        return choix;
    }

    public static double setMontant() {
        System.out.println("Saisir le montant à déposer/retirer : ");
        Scanner sc = new Scanner(System.in);
        double montant = sc.nextDouble();
        return montant;
    }

    */
        Client julien = new Client("Hanon", "Julien", "23 Rue Pierre Semard");
        Compte compte1 = new Compte("0707", "Julien", 1000);
        Compte compte2 = new Compte("0606", "Julien", 1500);
        julien.AjouterCompte(compte1);
        julien.AjouterCompte(compte2);
        System.out.println(julien);

    }
}

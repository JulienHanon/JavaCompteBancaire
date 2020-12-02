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
                    System.out.println("Choissisez le compte que ou vous souhaitez deposer :");
                    System.out.println("1 = Compte1");
                    System.out.println("2 = Compte2");
                    Scanner sc = new Scanner(System.in);
                    int choix2 = sc.nextInt();
                    switch (choix2) {
                        case 1 -> {
                            System.out.println("Vous avez choisi Compte1");
                            System.out.println("Saisissez la somme a déposer :");
                            double montant = setMontant();
                            compte1.deposer(montant);
                            System.out.println(compte1);
                        }
                        case 2 -> {
                            System.out.println("Vous avez choisi Compte2");
                            System.out.println("Saisissez la somme a déposer :");
                            double montant = setMontant();
                            compte2.deposer(montant);
                            System.out.println(compte2);
                        }
                    }

                }
                case 2 -> {
                    System.out.println("Choissisez le compte que ou vous souhaitez retirer :");
                    System.out.println("1 = Compte1");
                    System.out.println("2 = Compte2");
                    Scanner sc = new Scanner(System.in);
                    int choix2 = sc.nextInt();
                    switch (choix2) {
                        case 1 -> {
                            System.out.println("Vous avez choisi Compte1");
                            System.out.println("Saisissez la somme a retirer :");
                            double montant = setMontant();
                            compte1.retirer(montant);
                            System.out.println(compte1);
                        }
                        case 2 -> {
                            System.out.println("Vous avez choisi Compte2");
                            System.out.println("Saisissez la somme a retirer :");
                            double montant = setMontant();
                            compte2.retirer(montant);
                            System.out.println(compte2);
                        }
                    }
                    case 3 -> System.out.println(compte);
                }
            }
            while (choix != 4) ;
*/






            Client julien = new Client("Hanon", "Julien", "23 Rue Pierre Semard");
            Compte compte1 = new Compte("0707", "Julien", 1000);
            Compte compte2 = new Compte("0606", "Julien", 1500);
            julien.AjouterCompte(compte1);
            julien.AjouterCompte(compte2);
            System.out.println(julien);

        }

    }
    /*
    public static double setMontant () {
        System.out.println("Saisir le montant à déposer/retirer : ");
        Scanner sc = new Scanner(System.in);
        double montant = sc.nextDouble();
        return montant;
    }
    public static int runMenu () {
        displayMenu();
        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();
        return choix;
    }
    public static void displayMenu () {
        System.out.println("Opération sur le compte : ");
        System.out.println("1 - Déposer de l'argent");
        System.out.println("2 - Retirer de l'argent");
        System.out.println("3 - Editer le compte");
        System.out.println("4 - Sortir du programme");
        System.out.println("Saisissez votre choix");
    }
*/


package com.chassagnes;

/**
 * Classe Compte.
 * permet de créer un compte et de le gérer :
 * déposer ou retirer de l'argent du compte.
 * @author : B. CHATAING.
 * created on  08/11/2020
 */

public class Compte {
    /**
     * Attributs privés.
     * _numero : le numéro du compte.
     * _nomTitulaire : le nom du titulaire du compte.
     * _solde : le solde du compte.
     */
    private String _numero;
    private String _nomTitulaire;
    private double _solde;

    /**
     * Constructeur.
     * Crée une instance de compte bancaire.
     * @param numero : le numéro du compte.
     * @param nomTitulaire : le nom du titulaire.
     * @param solde : le solde du compte à sa création.
     */
    public Compte(String numero, String nomTitulaire, double solde)
    {
        _numero = numero;
        _nomTitulaire = nomTitulaire;
        _solde = solde;
    }

    /**
     * Accesseur en lecture.
     * @return : le numéro du compte.
     */
    public String get_numero() {
        return _numero;
    }

    /**
     * Accesseur en lecture.
     * @return : le nom du titulaire.
     */
    public String get_nomTitulaire() {
        return _nomTitulaire;
    }

    /**
     * Accesseur en lecture.
     * @return : le solde du compte.
     */
    public double get_solde() {
        return _solde;
    }

    /**
     * Dépose un montant sur le compte.
     * Le solde est mis à jour.
     * @param montant : de type double. Représente le montant déposé sur le compte.
     */
    public void deposer(double montant) {
        _solde += montant;
    }

    /**
     * Retire un montant du compte.
     * Le solde est mis à jour
     * @param montant : de type double. Représente le montant à retirer.
     */
    public void retirer(double montant) {
        _solde -= montant;
    }

    /**
     * Rend le compte sous forme textuelle.
     * @return : l'objet courant Compte au format String.
     */
    public String toString() {
        String compte;
        compte = "Compte : "+_numero+" Titulaire : "+_nomTitulaire+" Solde : "+_solde;
        return compte;
    }
}

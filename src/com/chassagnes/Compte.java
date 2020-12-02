package com.chassagnes;


public class Compte {

    //region Attribut privée

    /**
     * Attributs privés.
     * _numero : le numéro du compte.
     * _nomTitulaire : le nom du titulaire du compte.
     * _solde : le solde du compte.
     */
    protected String _numero;
    protected String _nomTitulaire;
    protected double _solde;
    //endregion

    //region Constructeur
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
    //endregion

    //region Accesseur

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
    //endregion

    //region Setteur
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

    public void set_solde(double montant){
        _solde = montant;
    }
    //endregion

    //region Methode
    /**
     * Rend le compte sous forme textuelle.
     * @return : l'objet courant Compte au format String.
     */
    public String toString() {
        String compte;
        compte = "Compte : "+_numero+" Titulaire : "+_nomTitulaire+" Solde : "+_solde;
        return compte;
    }
    //endregion
}

package com.chassagnes;

public class CompteEpargne extends Compte  {


    //region Attribut privée

    /**
     * Constructeur.
     * Crée une instance de compte bancaire.
     *
     * @param numero       : le numéro du compte.
     * @param nomTitulaire : le nom du titulaire.
     * @param solde        : le solde du compte à sa création.
     */
    private double _txInteret;
    //endregion


    //region Constructeur
    public CompteEpargne(String numero, String nomTitulaire, double solde, float txInteret) {
        super(numero, nomTitulaire, solde);
        _txInteret = txInteret;
    }
    //endregion



    //region methode
    public double get_txInteret(){
        return _txInteret;

    }
    public void set_txInteret(float txInteret){
        _txInteret = txInteret;
    }

    public void CalculerInteret(){
        this.set_solde(this.get_txInteret()*this.get_solde());
    }
    //endregion
}

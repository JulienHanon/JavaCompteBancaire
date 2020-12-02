package com.chassagnes;

public class Client {

    //region Attribut privée
    private String _nom;
    private String _prenom;
    private String _adresse;
    //endregion



    //region Constructeur
    public Client(String nom, String prenom, String adresse)
    {
        _nom = nom;
        _prenom = prenom;
        _adresse = adresse;
    }
    //endregion



    //region Methode

    public String get_nom(){
        return _nom;
    }

    public String get_prenom() {
        return _prenom;
    }

    public String get_adresse() {
        return _adresse;
    }
    public void set_adresse(String adresse){
        _adresse = adresse;
    }
    //endregion



}

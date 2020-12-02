package com.chassagnes;

import java.util.ArrayList;

public class Client {

    //region Attribut privée
    private String _nom;
    private String _prenom;
    private String _adresse;
    private ArrayList<Compte> ListCompte;
    //endregion



    //region Constructeur
    public Client(String nom, String prenom, String adresse)
    {
        _nom = nom;
        _prenom = prenom;
        _adresse = adresse;
        ListCompte = new ArrayList<Compte>();
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
    public void AjouterCompte (Compte unCompte){
        ListCompte.add(unCompte);
    }
    public void supprimerCompte (Compte unCompte){
        ListCompte.remove(unCompte);
    }


    @Override
    public String toString() {
        return "Client{" +
                "nom='" + _nom + '\'' +
                ", prenom='" + _prenom + '\'' +
                ", adresse='" + _adresse + '\'' +
                ", ListCompte=" + ListCompte +
                '}';
    }
}

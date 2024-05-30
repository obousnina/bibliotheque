package classes;

import enumeration.Categorie;
import exceptions.LivreNonDisponibleException;
import interfaces.Empruntable;

public class Livre implements Empruntable {
    private String titre;
    private String auteur;
    private String idbook;
    private boolean disponible;
    private Categorie categorie;

    //Constructeur

public Livre (String titre, String auteur, String idbook, boolean disponible, Categorie categorie){
    this.titre = titre;
    this.auteur = auteur;
    this.idbook = idbook;
    this.disponible = disponible;
    this.categorie = categorie;
}

    //Méthodes

    public void emprunter(){
    System.out.println("Le livre " +idbook+" n'est plus disponible");
}

public void rendre(){
    boolean disponible=true;
    System.out.println("Le livre est à nouveau disponible");
}

    @Override
    public String toString() {
        return  "Titre du livre: " + titre +
                " Auteur du livre: " + auteur +
                " Identifiant du livre: " + idbook +
                " Disponibilité du livre: " + disponible +
                " Catégorie du livre: " + categorie;}                ;


    }

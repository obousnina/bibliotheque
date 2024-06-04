package classes;

import exeption.LivreNonDisponibleException;
import interfaces.Empruntable;

public class Livre implements Empruntable {
    private String titre;
    private String auteur;
    private int idBook;
    private boolean disponible;
    private String categorie;
    //constructor
    public Livre(String titre, String auteur, int idBook, boolean disponible, String categorie) {
        this.titre = titre;
        this.auteur = auteur;
        this.idBook = idBook;
        this.disponible = disponible;
        this.categorie = categorie;
    }
    //getter
    public String getTitre() {
        return titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public int getIdBook() {
        return idBook;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public String getCategorie() {return categorie;}
    //setter
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Caracteristiques du livre :" +
                "Titre : " + getTitre() + "\n" +
                "Auteur : " + getAuteur() + "\n" +
                "Identifiant : " + getIdBook() + "\n" +
                "Disponibilité : " + isDisponible() + "\n" +
                "Catégorie : " + getCategorie();
    }

    @Override
    public void emprunter() throws LivreNonDisponibleException {
        if (this.isDisponible() == false){
            throw new LivreNonDisponibleException("Le livre n'est pas disponible");
            }
        else {
            System.out.println("Le livre est disponible");
            this.setDisponible(true);
            System.out.println("Le livre est donc emprunté");
        }
    }
    @Override
    public void rendre() {
        this.setDisponible(true);
        System.out.println("le livre est rendu");
    }
}

package classes;

import interfaces.Empruntable;

public class Livre implements Empruntable {
    private String titre;
    private String auteur;
    private int idBook;
    private boolean disponible;
    //constructor
    public Livre(String titre, String auteur, int idBook, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.idBook = idBook;
        this.disponible = disponible;
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
    //setter
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public void emprunter() {
        this.setDisponible(false);
        System.out.println("le livre est emprunté, ");
        System.out.println("disponibilité du livre : "+ this.disponible);
    }

    @Override
    public void rendre() {
        this.setDisponible(true);
        System.out.println("le livre est rendu, ");
        System.out.println("disponibilité du livre : "+ this.disponible);
    }
}

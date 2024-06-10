package com.bibliotheque_java_poo.classes;
import com.bibliotheque_java_poo.exceptions.LivreNonDisponibleException;
import com.bibliotheque_java_poo.interfaces.Empruntable;

public class Livre implements Empruntable {

    private String titre;
    private String auteur;
    private String idBook;
    private boolean disponible;
    public Categorie categorie;
    
    public enum Categorie {
        FICTION,
        NON_FICTION,
        SCIENTIFIQUE,
        HISTOIRE,
        BIOGRAPHIE,
    }

    public Livre(String titre, String auteur, String idBook, Categorie categorie) {
        this.titre = titre;
        this.auteur = auteur;
        this.idBook = idBook;
        this.categorie = categorie;
        this.disponible = false;
    }

    @Override
    public void emprunter () throws LivreNonDisponibleException {

        if(this.disponible != true) {

            throw new LivreNonDisponibleException("Ce livre n'est pas disponible à l'emprunt");
        }else {
            this.disponible = false;
        }
    }

    @Override
    public void rendre () {
        this.disponible = true;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}



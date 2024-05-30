package classes;

import exceptions.LivreNonDisponibleException;
import interfaces.Empruntable;

import java.util.ArrayList;
import java.util.Random;

public class Livre implements Empruntable {
    private String titre;
    private String auteur;
    private String idbook;
    private boolean disponible;
    private Categories categorie;

    public Livre(String titre, String auteur, String idbook, boolean disponible) {

        this.titre = titre;
        this.auteur = auteur;
        this.idbook = idbook;
        this.disponible = disponible;

    }

    public Livre(String titre, String auteur, String idbook, boolean disponible, Categories categorie) {

        this.titre = titre;
        this.auteur = auteur;
        this.idbook = idbook;
        this.disponible = disponible;
        this.categorie = categorie;

    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setCategorie(Categories categorie) {
        this.categorie = categorie;
    }

    @Override
    public void emprunter() throws LivreNonDisponibleException{
        if (!this.disponible) {
            throw new LivreNonDisponibleException("Le livre que vous voulez emprunter n'est pas disponible");
        }
        this.disponible = false;
    }

    @Override
    public void rendre() {
        this.disponible = true;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", idbook='" + idbook + '\'' +
                ", disponible=" + disponible +
                ", categorie=" + categorie +
                '}';
    }
}

package classes;

import enums.Categorie;
import exceptions.LivreNonDisponibleException;
import interfaces.Empruntable;


public class Livre implements Empruntable {
    private String titre;
    private String auteur;
    private String idbook;
    private boolean disponible;
    private Categorie categorie;
    public Livre(String titre, String auteur, String idbook, boolean disponible, Categorie categorie) {
        this.titre = titre;
        this.auteur = auteur;
        this.idbook = idbook;
        this.disponible = disponible;
        this.categorie = categorie;
    }

    @Override
    public void emprunter() throws LivreNonDisponibleException {
        if(disponible){
            disponible = false;
        }
        throw new LivreNonDisponibleException("livre indispo");
    }

    @Override
    public void rendre() {
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

    public String getIdbook() {
        return idbook;
    }

    public void setIdbook(String idbook) {
        this.idbook = idbook;
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
    @Override
    public String toString() {
        return idbook + ";" + titre + ";" + auteur + ";" + disponible + ";" + categorie;
    }
}

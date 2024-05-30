package classes;

public class Livres implements Empruntable {
    private String titre;
    private String auteur;
    private String genre;
    private int idBook;
    private boolean disponible;
    public Livres(String titre, String auteur, int idBook, String genre, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.genre = genre;
        this.idBook = idBook;
        this.disponible = true;
    }

    @Override
    public void emprunter() {
        this.disponible = false;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", idBook=" + idBook +
                ", genre='" + genre + '\'' +
                ", disponible=" + disponible +
                "}\n";
    }
}


package classes;
import exception.LivreNonDisponibleException;
import methodes.Empruntable;

public class Livre implements Empruntable {
    String titre;
    String auteur;
    String idbook;
    public boolean disponible;
    Category category;

    public Livre(String titre, String auteur, String idbook, Category category) {
        this.titre = titre;
        this.auteur = auteur;
        this.idbook = idbook;
        this.disponible = true;
        this.category = category;
    }

    public void emprunter() throws LivreNonDisponibleException {
        if(!disponible){
            throw new LivreNonDisponibleException("Le livre n'est pas disponible");
        }
        disponible = false;
    }
public void rendre() throws LivreNonDisponibleException {
        if(disponible){
            throw new LivreNonDisponibleException("Le livre est actuellement disponible");
        }
        disponible = true;
    }
    public String toString() {
        return "Titre: " + titre + ", Auteur: " + auteur + ", ID: " + idbook + ", Disponible: " + disponible;
    }

}

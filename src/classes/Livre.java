package classes;
import interfaces.Empruntable;

public class Livre implements Empruntable{
    private String titre;
    private String auteur;
    private String idBook;
    private boolean disponible;

    public void emprunter (Livre livreEmprunte) {
        this.titre = livreEmprunte.titre;
        this.auteur = livreEmprunte.auteur;
        this.idBook = livreEmprunte.idBook;
        this.disponible = !this.disponible;
    }

    public void rendre (Livre livreRendu) {
        this.titre = livreRendu.titre;
        this.auteur = livreRendu.auteur;
        this.idBook = livreRendu.idBook;
        this.disponible = !this.disponible;
    }
}



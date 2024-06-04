package classes;
import interfaces.Empruntable;
import exceptions.LivreNonDisponibleException;

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
}



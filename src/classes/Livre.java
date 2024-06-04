public enum Categorie {
    FICTION,
    NON_FICTION,
    SCIENTIFIQUE,
    HISTOIRE,
    BIOGRAPHIE
}

public interface Empruntable {
    void emprunter() throws LivreNonDisponibleException;
    void rendre();
}

public class Livre implements Empruntable {
    private String titre;
    private String auteur;
    private String idbook;
    private boolean disponible;
    private Categorie categorie;

    // Constructeur
    public Livre(String titre, String auteur, String idbook, boolean disponible, Categorie categorie) {
        this.titre = titre;
        this.auteur = auteur;
        this.idbook = idbook;
        this.disponible = disponible;
        this.categorie = categorie;
    }

    // Getters and Setters


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

    // Interface emprunt
    @Override
    public void emprunter() throws LivreNonDisponibleException {
        if (disponible) {
            disponible = false;
            System.out.println("Livre emprunté.");
        } else {
            throw new LivreNonDisponibleException("Le livre n'est pas disponible.");
        }
    }

    @Override
    public void rendre() {
        if (!disponible) {
            disponible = true;
            System.out.println("Livre rendu.");
        } else {
            System.out.println("Le livre n'a pas été emprunté.");
        }
    }
}

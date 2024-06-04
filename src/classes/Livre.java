public interface Empruntable {
    void emprunter();
    void rendre();
}

public class Livre implements Empruntable {
    private String titre;
    private String auteur;
    private String idbook;
    private boolean disponible;

    // Constructeur
    public Livre(String titre, String auteur, String idbook, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.idbook = idbook;
        this.disponible = disponible;
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

    // Interface emprunt
    @Override
    public void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println("Livre emprunté.");
        } else {
            System.out.println("Le livre n'est pas disponible.");
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

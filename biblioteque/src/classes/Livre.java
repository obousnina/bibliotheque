package classes;

public class Livre {
    String titre;
    String auteur;
    String idbook;
    boolean disponible;

    public Livre(String titre, String auteur, String idbook, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.idbook = idbook;
        this.disponible = disponible;
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
}

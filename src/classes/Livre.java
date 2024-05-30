package classes;

public class Livre {

    private int idbook;
    private String titre;
    private String auteur;
    private boolean disponible;

    public Livre(int idbook, String titre, String auteur, boolean disponible) {
        this.idbook = idbook;
        this.titre = titre;
        this.auteur = auteur;
        this.disponible = disponible;
    }

    public int getIdbook() {
        return idbook;
    }

    public void setIdbook(int idbook) {
        this.idbook = idbook;
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

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

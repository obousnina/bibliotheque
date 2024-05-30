package classes;

public class Livre {
    private String titre;
    private String auteur;
    private String idBook;
    private boolean disponible;
    //constructor
    public Livre(String titre, String auteur, String idBook, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.idBook = idBook;
        this.disponible = disponible;
    }
    //getter
    public String getTitre() {
        return titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public String getIdBook() {
        return idBook;
    }
    public boolean isDisponible() {
        return disponible;
    }
    //setter
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

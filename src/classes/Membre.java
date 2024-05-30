package classes;

public class Membre {
    private String nom;
    private String prenom;

    public Membre(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    //getter
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
}

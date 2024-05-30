package classes;

public abstract class Membre {
    private String nom;
    private String prenom;
    private int id;

    public Membre(String nom, String prenom, int id) {
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
    }
}

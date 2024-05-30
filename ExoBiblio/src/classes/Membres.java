package classes;

public class Membres {
    private String nom;
    private String prenom;
    private int id ;
    private String email;

    public Membres(String nom, String prenom, String email, int id) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;

        this.id = id;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


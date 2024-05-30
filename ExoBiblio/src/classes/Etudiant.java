package classes;

public class Etudiant extends Membres{

    private String niveau;

    public Etudiant(String nom, String prenom, String email, int id, String niveau) {
        super(nom, prenom, email,id);
        this.niveau = niveau;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}


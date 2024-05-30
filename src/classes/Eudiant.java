package classes;

public class Eudiant extends Membre {
    private String niveau;

    public Eudiant(String nom, String prenom, int id, String niveau) {
        super(nom, prenom, id);
        this.niveau = niveau;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}

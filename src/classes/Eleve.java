package classes;

public class Eleve extends Membre {
    String niveau;

    public Eleve(String nom, String prenom, int id, String niveau) {
        super(nom, prenom, id);
        this.niveau = niveau;
    }
}

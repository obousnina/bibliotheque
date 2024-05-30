package classes;

public class Etudiant extends Membre {
    private String niveau;


    public Etudiant(String nom, String prenom, int id) {
        super(nom, prenom, id);
        this.niveau = niveau;
    }
}

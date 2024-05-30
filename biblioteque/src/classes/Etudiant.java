package classes;

public class Etudiant extends Membre{
    String niveau;

    public Etudiant(String prenom, String nom, int id, String niveau) {
        super(prenom, nom, id);
        this.niveau = niveau;
    }
}


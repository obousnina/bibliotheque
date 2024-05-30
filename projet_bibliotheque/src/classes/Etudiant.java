package classes;

public class Etudiant extends Membre {
    private String niveau;

    //Constructeur
    public Etudiant(String nom, String prenom, int id, String niveau) {
        super(nom, prenom, id);
        this.niveau = niveau;
    }

    //Méthodes
}

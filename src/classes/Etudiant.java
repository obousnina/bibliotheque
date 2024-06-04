package classes;

public class Etudiant extends Membre {
    private String niveau;

    public Etudiant(String nom, String prenom, int id, String niveau) {
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
        this.niveau = niveau;
    }
    
}

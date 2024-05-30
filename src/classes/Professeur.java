package classes;

public class Professeur extends Membre {
    String departement;

    public Professeur(String nom, String prenom, int id, String departement) {
        super(nom, prenom, id);
        this.departement = departement;
    }
}

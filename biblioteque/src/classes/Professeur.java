package classes;

public class Professeur extends Membre{
    String departement;

    public Professeur(String prenom, String nom, int id, String departement) {
        super(prenom, nom, id);
        this.departement = departement;
    }
}

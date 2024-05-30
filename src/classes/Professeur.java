package classes;

public class Professeur extends Membre {
    private String departement;


    public Professeur(String nom, String prenom, int id) {
        super(nom, prenom, id);
        this.departement = departement;
    }
}

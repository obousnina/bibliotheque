package classes;

public class Professeur extends Membre {
    private String departement;

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public Professeur(String nom, String prenom, int id, String departement) {
        super(nom, prenom, id);
        this.departement = departement;
    }



}

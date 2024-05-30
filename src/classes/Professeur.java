package classes;

public class Professeur extends Membres{
    private String departement;

    Professeur(String nom, String prenom, String adresse, String email, int id, String departement){
        super(nom,prenom,email, id);
        this.departement = departement;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }
}

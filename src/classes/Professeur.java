package classes;

public class Professeur extends classes.Membre{
    private String niveau;

    public Professeur(String nom, String prenom, String niveau) {
        super(nom, prenom);
        this.niveau = niveau;
    }
    //getter
    public String getNiveau() {
        return niveau;
    }
}

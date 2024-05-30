package classes;

public class Eleve extends Membre{
    private int id;

    public Eleve(String nom, String prenom, int id) {
        super(nom, prenom);
        this.id = id;
    }
    //getter
    public int getId() {
        return id;
    }
}

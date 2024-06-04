package classes;

public class Eleve extends Membre {
    String niveau;

    public Eleve(String nom, String prenom, int id, String niveau) {
        super(nom, prenom, id);
        this.niveau = niveau;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String toString() {
        return "Eleve{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", id='" + id + '\'' +
                ", niveau=" + niveau +
                '}';
    }
}


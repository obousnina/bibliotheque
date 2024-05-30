package classes;

public class Professeur extends Membre {
  String departement;
  
  public Professeur(String nom, String prenom, int id, String departement) {
    this.nom = nom;
    this.prenom = prenom;
    this.id = id;
    this.departement = departement;
  }
  
  public String getDepartement() {
    return departement;
  }
}

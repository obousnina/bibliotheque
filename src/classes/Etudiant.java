package classes;

public class Etudiant extends Membre {
  String niveau;
  
  public Etudiant(String nom, String prenom, int id, String niveau) {
    this.nom = nom;
    this.prenom = prenom;
    this.id = id;
    this.niveau = niveau;
  }
  
  public String getNiveau() {
    return niveau;
  }
}

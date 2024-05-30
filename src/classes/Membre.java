package classes;

abstract class Membre {
  String nom;
  String prenom;
  int id;
  
  public String getNom() {
    return nom;
  }
  
  public String getPrenom() {
    return prenom;
  }
  
  public int getId() {
    return id;
  }
}

package classes;

public class Livre {
  String titre;
  String auteur;
  String idbook;
  boolean disponible;
  
  public Livre (String titre, String auteur, String idbook, boolean disponible) {
    this.titre = titre;
    this.auteur = auteur;
    this.idbook = idbook;
    this.disponible = disponible;
  }
}

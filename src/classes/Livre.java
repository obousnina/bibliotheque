package classes;

public class Livre implements Empruntable {
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
  
  public void emprunter() {
    this.disponible = false;
  }
  
  public void rendre() {
    this.disponible = true;
  }
}

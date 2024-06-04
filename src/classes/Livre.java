package classes;

import java.io.Serializable;

public class Livre implements Empruntable, Serializable {
  String titre;
  String auteur;
  String idbook;
  Categorie categorie;
  boolean disponible =true;
  
  public Livre (String titre, String auteur, String idbook, Categorie categorie) {
    this.titre = titre;
    this.auteur = auteur;
    this.idbook = idbook;
    this.categorie = categorie;
  }
  
  public String getTitre() {
    return titre;
  }
  
  public void emprunter() throws LivreNonDisponibleExeption {
    if (!this.disponible) throw new LivreNonDisponibleExeption("Ce livre est momentanément indisponible");
    this.disponible = false;
    System.out.println("Vous venez d'emprunter "+this.titre);
  }
  
  public void rendre() {
    this.disponible = true;
  }
}

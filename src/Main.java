import classes.Professeur;

public class Main {
  
  public static void main(String... args) {
  // String nom, String prenom, int id, String departement
    Professeur oualid = new Professeur("Oualid", "Bousnina", 0, "Informatique");
    System.out.println(oualid.getDepartement());
  }
}
import classes.Categorie;
import classes.Livre;
import classes.LivreNonDisponibleExeption;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  
  public static void main(String... args) throws IOException, ClassNotFoundException {
    List<Livre> bibliotheque = new ArrayList<>();
    // Livre lesFleursDuMal = new Livre("Les fleurs du mal", "Charles Baudelaire", "1", Categorie.HISTOIRE);
    // bibliotheque.add(lesFleursDuMal);

    File bibliothequeFile = new File("C:/Users/cleme/bibliotheque/bibliotheque.txt");
    bibliothequeFile.createNewFile();
    FileInputStream fis = new FileInputStream(bibliothequeFile);
    ObjectInputStream ois = new ObjectInputStream(fis);

    bibliotheque = (List<Livre>) ois.readObject();

    for (Livre livre : bibliotheque) {
      System.out.println(livre.getTitre());
    }

    //
    app(bibliotheque);
    //

    FileOutputStream fos= new FileOutputStream(bibliothequeFile, false);
    ObjectOutputStream oos = new ObjectOutputStream(fos);

    oos.writeObject(bibliotheque);
  }
  
  public static Livre chercherLivre(List<Livre> bibliotheque, String titre) {
    Livre livreRecherche = null;
    for (Livre livre : bibliotheque) {
      if (livre.getTitre().equals(titre)) {
        livreRecherche = livre;
        break;
      }
    }
    return livreRecherche;
  }
  
  public static void emprunterLivre(Livre livre) {
    try {
      livre.emprunter();
    } catch (LivreNonDisponibleExeption e) {
      System.out.println(e.getMessage());
    }
  }
  
  public static void tacheEmprunt(List<Livre> bibliotheque) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Veuillez saisir le titre du livre à emprunter : ");
    String titre =  scan.nextLine();
    //scan.close();
    
    Livre livre = chercherLivre(bibliotheque, titre);
    
    try {
      if (livre == null) throw new Exception("Ce livre n'existe pas.");
      emprunterLivre(livre);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    finally {
      // app(bibliotheque);
    }
  }
  
  public static void tacheCreationLivre(List<Livre> bibliotheque) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Veuillez saisir le titre du livre  : ");
    String titre =  scan.nextLine();
    System.out.println("Veuillez saisir l'auteur du livre  : ");
    String auteur =  scan.nextLine();
    System.out.println("Veuillez saisir l'id du livre : ");
    String id =  scan.nextLine();
    System.out.println("Veuillez saisir la categorie du livre : ");
    
    boolean isValid = false;
    while (!isValid) {
      try {
        Categorie categorie = Categorie.valueOf(scan.nextLine());
        bibliotheque.add(new Livre(titre, auteur, id, categorie));
        System.out.println(titre+" a été ajouté à la biblithèque.");
        isValid = true;
      } catch (Exception e) {
        System.out.println("Categorie inconnue.");
      }
    }
    //scan.close();
  }
  
  public static void app(List<Livre> bibliotheque) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Voulez-vous créer ou empreunter un livre ? (creer/emprunter) : ");
    String tache =  scan.nextLine();
    switch (tache) {
      case "creer":
        tacheCreationLivre(bibliotheque);
        break;
      case "emprunter":
        tacheEmprunt(bibliotheque);
    }
  }
}
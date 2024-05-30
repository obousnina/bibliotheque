package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnregistrerLivre {

    public void enregistrer() {
        Scanner scanner = new Scanner(System.in);
// Création de la liste de Livre vide
        List<Livre> catalogue = new ArrayList<>();

// Créer 10 livres
        for (int i = 0; i < 10; i++) {
            System.out.println("\nLivre n°" + (i + 1) + " :");

            System.out.println("Veuillez entrer un livre");
            String nom = scanner.nextLine();

            System.out.println("Veuillez entrer l'auteur de ce livre");
            String auteur = scanner.nextLine();

            System.out.println("Veuillez entrer l'ID de ce livre");
            String id = scanner.nextLine();

            System.out.println("Le livre est-il disponible (true/false) ? ");
            String disponibilite = scanner.nextLine();
            boolean disponible = disponibilite.equalsIgnoreCase("true");

            System.out.println("Veuillez entrer la catégorie de ce livre");
            String categorie = scanner.nextLine();


            Livre livre = new Livre(nom, auteur, id, categorie, disponible);

// Ajouter le livre au catalogue
            catalogue.add(livre);
            System.out.print(catalogue);
        }
        scanner.close();
    }
}

import classes.Livre;
import enums.Categorie;
import exceptions.LivreNonDisponibleException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TP {
    public static void main(String[] args) {
        List<Livre> listeLivres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Partie 1 : Construction du catalogue
        for (int i = 0; i < 1; i++) {
            System.out.println("Entrez les informations du livre " + (i + 1) + " :");
            System.out.print("Titre: ");
            String titre = scanner.nextLine();
            System.out.print("Auteur: ");
            String auteur = scanner.nextLine();
            System.out.print("ID: ");
            String idbook = scanner.nextLine();
            System.out.print("enums.Categorie (FICTION, NON_FICTION, SCIENTIFIQUE, HISTOIRE, BIOGRAPHIE): ");
            Categorie categorie = Categorie.valueOf(scanner.nextLine().toUpperCase());
            Livre livre = new Livre(titre, auteur, idbook, true, categorie);
            listeLivres.add(livre);
        }

        // Ecriture du catalogue dans le fichier
        try (FileWriter writer = new FileWriter("catalogue.txt")) {
            for (Livre livre : listeLivres) {
                writer.write(livre.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Lecture du catalogue depuis le fichier
        List<Livre> catalogue = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("catalogue.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                Livre livre = new Livre(parts[1], parts[2], parts[0], Boolean.parseBoolean(parts[3]), Categorie.valueOf(parts[4]));
                catalogue.add(livre);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Partie 2 : Réservation d'un livre
        System.out.println("Catalogue des livres :");
        for (Livre livre : catalogue) {
            System.out.println(livre);
        }

        System.out.println("Entrez l'ID du livre à réserver :");
        String idbook = scanner.nextLine();
        for (Livre livre : catalogue) {
            if (livre.getIdbook().equals(idbook)) {
                try {
                    livre.emprunter();
                    System.out.println("Le livre " + livre.getTitre() + " a été réservé.");
                } catch (LivreNonDisponibleException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
        }

        // Mise à jour du fichier catalogue.txt
        try (FileWriter writer = new FileWriter("catalogue.txt")) {
            for (Livre livre : catalogue) {
                writer.write(livre.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}


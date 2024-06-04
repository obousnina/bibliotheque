import classes.Eleve;
import classes.Livre;
import enumerations.Categorie;
import exceptions.LivreNonDisponibleException;

import java.io.*;
import java.util.*;

import static classes.Livre.*;

public class Main {
    public static void main(String[] args) throws LivreNonDisponibleException, FileNotFoundException {

        // A dégeler pour créer le fichier

    /*    List<Livre> livres = createBookList();
        for (Livre livre : livres) {
            System.out.println(livre.toString());
        }
        saveBooksToFile(livres, "livres.txt");
       */
        List<Livre> livreList = loadBooksFromFile("livres.txt");

        Eleve eleve1 = new Eleve("Dubois", "Paul", 1, "terminale");
        Map<String, Eleve> imprunt = new HashMap<String, Eleve>();
        imprunt.put(livreList.get(3).getIdbook(), eleve1);

        Iterator<String> it = imprunt.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            Eleve ee = imprunt.get(key);

            System.out.println(key);
            System.out.println(ee.toString());
        }
//        System.out.println(imprunt);

        Eleve eleve2 = new Eleve("Claude", "Francois", 1, "Terminale");
        Eleve eleve3 = new Eleve("Paul", "Luc", 2, "Première");

        // Simulation des élèves empruntant des livres
        emprunterLivre(eleve1, livreList.get(3));
        emprunterLivre(eleve2, livreList.get(1));
        emprunterLivre(eleve3, livreList.get(3));

    }

    private static List<Livre> createBookList() {
        List<Livre> livreList = new ArrayList<>();

        livreList.add(new Livre("Harry Potter", "J.K. Rowling", "001", true, Categorie.fiction));
        livreList.add(new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", "002", true, Categorie.fiction));
        livreList.add(new Livre("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "003", true, Categorie.scientifique));
        livreList.add(new Livre("1984", "George Orwell", "004", true, Categorie.fiction));
        livreList.add(new Livre("Steve Jobs", "Walter Isaacson", "005", true, Categorie.biographie));
        livreList.add(new Livre("Cosmos", "Carl Sagan", "006", true, Categorie.scientifique));
        livreList.add(new Livre("Le Seigneur des Anneaux", "J.R.R. Tolkien", "007", true, Categorie.fiction));
        livreList.add(new Livre("Les Misérables", "Victor Hugo", "008", true, Categorie.fiction));
        livreList.add(new Livre("The Da Vinci Code", "Dan Brown", "009", true, Categorie.fiction));
        livreList.add(new Livre("L'art de la guerre", "Sun Tzu", "010", true, Categorie.non_fiction));

        return livreList;
    }

    private static List<Livre> loadBooksFromFile(String fileName) {
        List<Livre> livres = new ArrayList<>();

        try (FileReader reader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    String titre = parts[0].trim();
                    String auteur = parts[1].trim();
                    String idBook = parts[2].trim();
                    boolean disponible = Boolean.parseBoolean(parts[3].trim());
                    Categorie categorie = Categorie.valueOf(parts[4].trim());
                    livres.add(new Livre(titre, auteur, idBook, disponible, categorie));
                } else {
                    System.err.println("Format de ligne invalide: " + line);
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier " + fileName + ": " + e.getMessage());
        }
        return livres;
    }

    private static void saveBooksToFile(List<Livre> livres, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Livre livre : livres) {
                writer.write(livre.getTitre() + "," + livre.getAuteur() + "," + livre.getIdbook() + "," +
                        livre.isDisponible() + "," + livre.getCategorie() + "\n");
            }
            writer.close();
            System.out.println("Les livres ont été sauvegardés dans " + fileName);
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde des livres dans " + fileName + ": " + e.getMessage());
        }
    }

    private static void emprunterLivre(Eleve eleve, Livre livre) throws LivreNonDisponibleException {
        if (livre.isDisponible()) {
            System.out.println(eleve.getNom() + " " + eleve.getPrenom() + " a emprunté le livre \"" + livre.getTitre() + "\".");
            livre.setDisponible(false);
        } else
            throw new LivreNonDisponibleException(" Désolé, le livre \"" + livre.getTitre() + "\" n'est pas disponible pour l'emprunt.");
    }
}

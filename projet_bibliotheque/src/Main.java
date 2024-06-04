import classes.Livre;
import enumeration.Categorie;
import exceptions.LivreNonDisponibleException;

import java.io.*;
import java.util.*;

public class Main {
    static Random random = new Random();

    public Main() throws IOException {
    }

    public static void main(String[] args) throws LivreNonDisponibleException, IOException {

        List<String> listeTitres = List.of("Titre1", "Titre2", "Titre3", "Titre4", "Titre5", "Titre6");
        List<String> listeAuteurs = List.of("Auteur1", "Auteur2", "Auteur3", "Auteur4", "Auteur5", "Auteur6");
        List<String> listeIdbook = List.of("1", "2", "3", "4", "5", "6");
        List<Categorie>listeCategorie = new ArrayList<Categorie>(Arrays.asList(Categorie.values()));

        List<Livre> listeLivres = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
           listeLivres.add(getLivre(listeTitres, listeAuteurs, listeIdbook, listeCategorie));
            System.out.println(listeLivres);
        }


        File catalogue = new File("c:/Users/utilisateur/Documents/2024_POEC_EPSI RENNES/catalogue.txt");
        FileWriter ecrireCatalogue = new FileWriter("catalogue.txt");

        for (Livre livre : listeLivres){
            ecrireCatalogue.write(livre.getIdbook() + ";" + livre.getTitre() + ";" + livre.getAuteur() + ";" + livre.isDisponible() + ";" + livre.getCategorie() + "\n");
        }
        ecrireCatalogue.close();

        BufferedReader lectureCatalogue = new BufferedReader(new FileReader("catalogue.txt"));
        String ligne;
        while ((ligne = lectureCatalogue.readLine()) != null) {
            String[] parts = ligne.split(";");
            Livre livre = new Livre(parts[0], parts[1], parts[2], Boolean.parseBoolean(parts[3]), Categorie.valueOf(parts[4]));
            listeLivres.add(livre);
        }
        lectureCatalogue.close();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer l'ID du livre à réserver :");
        String idbook = scanner.nextLine();
        for (Livre livre : listeLivres) {
            if (livre.getIdbook().equals(idbook)) {
                try {
                    livre.emprunter();
                    System.out.println("Le livre " + livre.getIdbook() + livre.getTitre() + " a été réservé.");
                } catch (LivreNonDisponibleException e) {
                    System.out.println("Le livre est déjà emprunté.");
                }
                break;
            }
        }
        }


    private static Livre getLivre(List<String> listeTitres, List<String> listeAuteurs, List<String> listeIdbook, List<Categorie> listeCategorie) {
        String titreAleatoire = listeTitres.get(random.nextInt(0, listeTitres.toArray().length));
        String auteurAleatoire = listeAuteurs.get(random.nextInt(0, listeAuteurs.toArray().length));
        String idbookAleatoire = listeIdbook.get(random.nextInt(0, listeIdbook.toArray().length));
        Categorie categorieAleatoire = listeCategorie.get(random.nextInt(0,listeCategorie.toArray().length));
        boolean booleanAleatoire = random.nextBoolean();

        return new Livre(titreAleatoire, auteurAleatoire, idbookAleatoire, booleanAleatoire,categorieAleatoire);

    }


}
import classes.Livre;
import enumeration.Categorie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {

        List<String> listeTitres = List.of("Titre1", "Titre2", "Titre3", "Titre4", "Titre5", "Titre6");
        List<String> listeAuteurs = List.of("Auteur1", "Auteur2", "Auteur3", "Auteur4", "Auteur5", "Auteur6");
        List<String> listeIdbook = List.of("1", "2", "3", "4", "5", "6");
        List<Categorie>listeCategorie = new ArrayList<Categorie>(Arrays.asList(Categorie.values()));

        List<Livre> listeLivres = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
           listeLivres.add(getLivre(listeTitres, listeAuteurs, listeIdbook, listeCategorie));
            System.out.println(listeLivres);
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
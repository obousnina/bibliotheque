import classes.Livre;
import classes.Membre;
import classes.Professeur;
import enumerations.Categorie;
import exeption.LivreNonDisponibleException;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String... args) throws LivreNonDisponibleException {
        Membre Paul = new Membre("Perou", "Paul");
        //Paul creer le catalogue
        ArrayList<Livre> catalogue = Paul.creerCatalogue(2);
        //le prof Marc reserve le premier livre du catalogue
        Professeur Marc = new Professeur("Bob", "Marc", "master");
        Marc.reserver(catalogue.get(1));
    }
}

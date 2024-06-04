import classes.Livre;
import classes.Membre;
import enumerations.Categorie;
import exeption.LivreNonDisponibleException;
import java.util.Scanner;

public class Main {

    public static void main(String... args) throws LivreNonDisponibleException {
        Membre Paul = new Membre("Perou", "Paul");
        Paul.creerCatalogue(10);
    }
}

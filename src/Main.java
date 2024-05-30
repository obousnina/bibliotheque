import classes.Livre;
import enumerations.Categorie;
import exeption.LivreNonDisponibleException;

public class Main {

    public static void main(String... args) throws LivreNonDisponibleException {

        Livre roman = new Livre("arbre", "jacques", 1,false, Categorie.FICTION);
        roman.emprunter();
        roman.rendre();
    }
}

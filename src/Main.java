import classes.Livre;
import classes.Category;
import exception.LivreNonDisponibleException;

public class Main {
    public static void main(String[] args) {

        Livre[] catalogue = new Livre[10];
        for (int i = 0; i < 10; i++) {
            catalogue[i] = new Livre("Titre " + (i+1), "Autheur " + (i+1), "ID" + (i+1), Category.FICTION);
        }

        try {
            catalogue[0].emprunter();
            System.out.println("Le livre a bien été emprunté.");
        } catch (LivreNonDisponibleException e) {
            System.out.println(e.getMessage());
        }
    }
}
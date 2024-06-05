import classes.Biblioteque;
import classes.Livre;
import enums.Categorie;
import exceptions.LivreNonDisponibleException;


public class TEST {
    public static void main(String[] args) throws LivreNonDisponibleException {
        Biblioteque biblioteque = new Biblioteque();
        biblioteque.addLivre(new Livre("titre",
                "autheur",
                "25f",
                false,
                Categorie.BIOGRAPHIE));
       System.out.println(biblioteque.getLivreById ("25f"));
       System.out.println(biblioteque.afficherLivres());
    }

}


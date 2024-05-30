import classes.Livre;

public class Main {

    public static void main(String... args) {

        Livre roman = new Livre("arbre", "jacques", 1,true);
        roman.emprunter();
        roman.rendre();
    }
}

import classes.Categories;
import classes.Livre;
import exceptions.LivreNonDisponibleException;

import java.lang.reflect.Array;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenue sur la bibliothèque.");
        // Création de la liste
        ArrayList<Livre> livres = new ArrayList<>();

        // Récupération des catégories sous forme de liste
        ArrayList<Categories> categories = new ArrayList<>(Arrays.asList(Categories.values()));
        Random r = new Random();


        // Ajout des livres à la liste
        livres.add(new Livre("Le Tour du monde en 80 jours", "Jules Verne", "1", true));
        livres.add(new Livre("Moby Dick", "Herman Melville", "2", false));
        livres.add(new Livre("Madame Bovary", "Gustave Flaubert", "3", true));
        livres.add(new Livre("Les Hauts de Hurlevent", "Emily Brontë", "4", true));
        livres.add(new Livre("Anna Karenine", "Léon Tolstoï", "5", false));
        livres.add(new Livre("Le Portrait de Dorian Gray", "Oscar Wilde", "6", true));
        livres.add(new Livre("Lolita", "Vladimir Nabokov", "7", false));
        livres.add(new Livre("Cent ans de solitude", "Gabriel Garcia Marquez", "8", true));
        livres.add(new Livre("L'étranger", "Albert Camus", "9", true));
        livres.add(new Livre("1984", "George Orwell", "10", false));
        livres.add(new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", "11", true));
        livres.add(new Livre("Harry Potter à l'école des sorciers", "J.K. Rowling", "12", true));
        livres.add(new Livre("Voyage au bout de la nuit", "Louis-Ferdinand Céline", "13", false));
        livres.add(new Livre("A la recherche du temps perdu", "Marcel Proust", "14", true));
        livres.add(new Livre("Le Seigneur des Anneaux", "J.R.R. Tolkien", "15", true));
        livres.add(new Livre("Belle du Seigneur", "Albert Cohen", "16", true));
        livres.add(new Livre("Les Misérables", "Victor Hugo", "17", false));
        livres.add(new Livre("Animal Farm", "George Orwell", "18", true));
        livres.add(new Livre("La Guerre des mondes", "H.G. Wells", "19", false));
        livres.add(new Livre("Fahrenheit 451", "Ray Bradbury", "20", true));
        livres.add(new Livre("Le Jeu d'Ender", "Orson Scott Card", "21", false));
        livres.add(new Livre("Souviens-toi de l'homme de demain", "Philip K. Dick", "22", true));
        livres.add(new Livre("Neuromancien", "William Gibson", "23", false));
        livres.add(new Livre("Dune", "Frank Herbert", "24", true));
        livres.add(new Livre("Le Seigneur des Mouches", "William Golding", "25", false));
        livres.add(new Livre("L'Attrape-rêves", "J.D. Salinger", "26", true));
        livres.add(new Livre("Orgueil et Préjugés", "Jane Austen", "27", false));
        livres.add(new Livre("Emma", "Jane Austen", "28", true));
        livres.add(new Livre("Harry Potter 1", "J.K. Rowling", "29", false));
        livres.add(new Livre("Harry Potter 2", "J.K. Rowling", "30", true));



        // Affichage de la liste
        System.out.println("Voici la liste des livres disponibles : ");
        for (Livre livre : livres) {
            // On ajoute aléatoirement une catégorie à chaque livre depuis l'Enum Categories
            int i = r.nextInt(categories.size());
            Categories cat = categories.get(i);
            livre.setCategorie(cat);
            System.out.println(livre.toString());
        }

        System.out.println("Que souhaitez-vous faire ?");
        System.out.println("Emprunter un livre : 1, Rendre un livre : 2, Enregistrer un nouveau livre : 3");
        String input1 = input.nextLine();

        if ("1".equals(input1)) {
            System.out.println("Entrez l'id du livre que vous souhaitez emprunter");
            String idInput = input.nextLine();
            Livre livreChoisi = livres.get(Integer.parseInt(idInput)-1);

            try {
                livreChoisi.emprunter();
            } catch (LivreNonDisponibleException e) {
                System.out.print("Le livre que vous voulez emprunter n'est pas disponible");
            }

        } else {
            if ("2".equals(input1)) {
                System.out.println("Entrez l'id du livre que vous souhaitez rendre");
                String idInput = input.nextLine();
                Livre livreChoisi = livres.get(Integer.parseInt(idInput) - 1);
                if (livreChoisi.isDisponible()) {
                    System.out.println("Ce livre est disponible à l'emprunt !");
                } else {
                    livreChoisi.rendre();
                    System.out.println("Vous avez rendu le livre : " + livreChoisi.toString());
                }
            } else {
                if ("3".equals(input1)) {
                    System.out.println("Quel est son titre ?");
                    String titre = input.nextLine();

                    System.out.println("Quel est son auteur ?");
                    String auteur = input.nextLine();

                    String id = Integer.toString(livres.size()+1);

                    System.out.println("Quel est sa catégorie ? Entrez l'index de la catégorie voulue" + categories);
                    int c  = input.nextInt();
                    livres.add(new Livre(titre, auteur, id, true, categories.get(c)));

                    System.out.println("Vous avez ajouté à la bibliothèque le livre : ");
                    System.out.println(livres.getLast().toString());
                }
            }

        }


    }
}
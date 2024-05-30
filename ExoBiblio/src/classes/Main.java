
package classes;
import java.util.*;

import static java.util.Arrays.spliterator;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scannerMembres = new Scanner(System.in);  // setup du scanner

        System.out.println("Voulez vous creer un compte ? : Y/n ");
        String reponse = scannerMembres.nextLine();
        if (reponse.equals("Y")) {


            System.out.println("----Nous allons creer votre compte maintenant ---");


            //initialise le nom
            System.out.print("Quel est votre Nom ?");
            // nextLine() va récupérer ce que l'on a saisi en 'string'
            String nom = scannerMembres.nextLine();
            System.out.println("Nom : " + nom);

            // initialise le prenom
            System.out.print("Quel est votre Prenom ?");
            String prenom = scannerMembres.nextLine();
            System.out.println("Prenom : " + prenom);

            //initialise l'email
            System.out.print("Quel est votre Email ?");
            String email = scannerMembres.nextLine();
            System.out.println("Email : " + email);
            // initialise l'id
            Random R = new Random();
            int id = R.nextInt(10000);

            //création du membres
            Membres membres1 = new Membres(nom, prenom, email, id);
        }
        List<Livres> bibliotheque = new ArrayList<>();

        // Ajout de 30 livres à la bibliothèque
        bibliotheque.add(new Livres("Le Petit Prince", "Antoine de Saint-Exupéry", 1, "Fiction", true));
        bibliotheque.add(new Livres("1984", "George Orwell", 2, "Dystopie", false));
        bibliotheque.add(new Livres("Moby Dick", "Herman Melville", 3, "Aventure", true));
        bibliotheque.add(new Livres("L'Étranger", "Albert Camus", 4, "Philosophie", true));
        bibliotheque.add(new Livres("Pride and Prejudice", "Jane Austen", 5, "Romance", false));
        bibliotheque.add(new Livres("To Kill a Mockingbird", "Harper Lee", 6, "Drame", true));
        bibliotheque.add(new Livres("The Great Gatsby", "F. Scott Fitzgerald", 7, "Classique", true));
        bibliotheque.add(new Livres("Crime and Punishment", "Fyodor Dostoevsky", 8, "Classique", false));
        bibliotheque.add(new Livres("War and Peace", "Leo Tolstoy", 9, "Historique", true));
        bibliotheque.add(new Livres("The Catcher in the Rye", "J.D. Salinger", 10, "Fiction", true));
        bibliotheque.add(new Livres("The Hobbit", "J.R.R. Tolkien", 11, "Fantaisie", true));
        bibliotheque.add(new Livres("The Alchemist", "Paulo Coelho", 12, "Philosophie", true));
        bibliotheque.add(new Livres("The Divine Comedy", "Dante Alighieri", 13, "Poésie", false));
        bibliotheque.add(new Livres("The Brothers Karamazov", "Fyodor Dostoevsky", 14, "Classique", true));
        bibliotheque.add(new Livres("Brave New World", "Aldous Huxley", 15, "Dystopie", true));
        bibliotheque.add(new Livres("The Adventures of Huckleberry Finn", "Mark Twain", 16, "Aventure", true));
        bibliotheque.add(new Livres("Anna Karenina", "Leo Tolstoy", 17, "Romance", false));
        bibliotheque.add(new Livres("One Hundred Years of Solitude", "Gabriel Garcia Marquez", 18, "Magie", true));
        bibliotheque.add(new Livres("In Search of Lost Time", "Marcel Proust", 19, "Classique", true));
        bibliotheque.add(new Livres("Ulysses", "James Joyce", 20, "Classique", true));
        bibliotheque.add(new Livres("The Odyssey", "Homer", 21, "Épopée", true));
        bibliotheque.add(new Livres("Madame Bovary", "Gustave Flaubert", 22, "Classique", false));
        bibliotheque.add(new Livres("The Iliad", "Homer", 23, "Épopée", true));
        bibliotheque.add(new Livres("Don Quixote", "Miguel de Cervantes", 24, "Aventure", true));
        bibliotheque.add(new Livres("Jane Eyre", "Charlotte Bronte", 25, "Romance", true));
        bibliotheque.add(new Livres("Wuthering Heights", "Emily Bronte", 26, "Romance", true));
        bibliotheque.add(new Livres("Les Misérables", "Victor Hugo", 27, "Historique", false));
        bibliotheque.add(new Livres("The Count of Monte Cristo", "Alexandre Dumas", 28, "Aventure", true));
        bibliotheque.add(new Livres("Great Expectations", "Charles Dickens", 29, "Classique", true));
        bibliotheque.add(new Livres("The Grapes of Wrath", "John Steinbeck", 30, "Drame", true));

        //boucle de menu d'emprunt
        while (true) {
            // on affiche TOUS les livres
            System.out.println("Voici la liste des livres : ");
            for (Livres livre : bibliotheque) {
                System.out.println(livre.toString());
            }
            // on demande si le membre veut emprunter ou veut partir
            System.out.println("Si vous voulez emprunter un livre, veuillez écrire son id : sinon tapez exit");
            // scan de la réponse
            String reponse1 = scannerMembres.nextLine();
            //le membre veut exit
            if (reponse1.equalsIgnoreCase("exit")) {
                break;
            }
            // en cas de réponse positive retour d'un ID valide  try/catch des idées en dehors du scope ou des idées invalides.
            int id = Integer.parseInt(reponse1);
            try {

                Livres livre = bibliotheque.get(id - 1);
                // check de la dispo du livre
                if (!livre.isDisponible()) {
                    System.out.println("Ce livre n'est pas disponible veuillez en choisir un autre");
                    break;
                } else {
                    System.out.println("Détails du livre:");
                    System.out.println(livre.toString());
                    System.out.println("Voulez vous l'emprunter ? : Y/n ");
                    String reponse3 = scannerMembres.nextLine();
                    if (reponse3.toUpperCase().equals("Y")) {
                        livre.emprunter();
                        System.out.println("Voici la liste des livres : " + bibliotheque);
                        //break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Aucun livre trouvé avec l'id: " + id + "Veuillez entrer un id valide.");
                break;
            }finally{ break;
            }

        }
        scannerMembres.close();

        }
    }



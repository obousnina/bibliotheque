

import  classes.Membres;
import java.util.Random;
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("----Nous allons creer votre compte maintenant ---");
        Scanner scannerMembres = new Scanner(System.in);  // setup du scannert

        //initialise le nom
        System.out.print("Quel est votre Nom ?");
        // nextLine() va récupérer ce que l'on a saisi en 'string'
        String nom = scannerMembres.nextLine();
        System.out.println("Nom : "+ nom);

        // initialise le prenom
        System.out.print("Quel est votre Prenom ?");
        String prenom = scannerMembres.nextLine();
        System.out.println("Prenom : "+ prenom);

        //initialise l'email
        System.out.print("Quel est votre Email ?");
        String email = scannerMembres.nextLine();
        System.out.println("Email : "+ email);
        // initialise l'id
        Random R = new Random();
        int id = R.nextInt(10000);

        //création du membres
        Membres membres1 = new Membres (nom,prenom,email, id);


    }
}
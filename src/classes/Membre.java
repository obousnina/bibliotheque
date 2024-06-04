package classes;

import enumerations.Categorie;

import java.util.ArrayList;
import java.util.Scanner;

public class Membre {
    private String nom;
    private String prenom;

    public Membre(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    //getter
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    //methode
    public ArrayList <Livre> creerCatalogue(Integer nombreLivre){
        ArrayList <Livre> Catalogue = new ArrayList<>();
        for (int nombre = 1; nombre < nombreLivre+1; nombre++){
            //demande le titre
            Scanner scanner = new Scanner(System.in);
            System.out.println("Titre du livre : ");
            String titre = scanner.nextLine();
            //demande l'auteur
            System.out.println("Auteur du livre : ");
            String auteur = scanner.nextLine();
            //demande la catégorie
            System.out.println("Catégorie du livre FICTION, NON_FICTION, SCIENTIFIQUE, HISTORIQUE, BIOGRAPHIE :");
            String categorie = scanner.nextLine();
            //demande l'idBook
            System.out.println("idBook du livre : ");
            int idBook = scanner.nextInt();
            //demande la disponibilité
            System.out.println("Disponibilité du livre true/false :");
            Boolean disponible = scanner.nextBoolean();

            //creer livre
            Livre livre = new Livre(titre, auteur, idBook, disponible, categorie);
            Catalogue.add(livre);
        }
        System.out.println("Les livres du catalogue :");
        for (Livre livre : Catalogue) {
            System.out.println(livre.toString());
        }
        return Catalogue;
    }
    public void reserver(Livre leLivre){
        if (leLivre.isDisponible()){
            System.out.println("le livre "+ leLivre.toString()+ "\n" + " est disponible");
            leLivre.setDisponible(false);
            System.out.println("Vous l'avez reservé");
        }
    }
}

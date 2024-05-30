package Classes;
//classes livres
public class Livre {
    private String titre;
    private String auteur;
    private String idbook;
    private Categorie categorie;
    private boolean disponible;

//getters
    public String getTitre() {
        return titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public String getIdbook() {
        return idbook;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public Categorie getCategorie() {
        return categorie;
    }
//setters
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public void setIdbook(String idbook) {
        this.idbook = idbook;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
//constructor
    public Livre(String titre, String auteur, String idbook, String categorie,boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.idbook = idbook;
        this.categorie = Categorie.valueOf(categorie);
        this.disponible = disponible;


//ajout d'un enum puis ajout de catégorie dans la class livre
    }
    public enum Categorie{
        a,FICTION,NON_FICTION,SCIENTIFIQUE,HISTOIRE,BIOGRAPHIE}

//interface "Empruntable" avec méthode emprunter() et rendre()
    public interface Empruntable{
        void emprunter();
        void rendre();}

//methode emprunter
    public void emprunter() throws Exception{
        boolean LivreNonDisponibleException=true;
        if(!disponible){throw new Exception("Livre indisponible");}
    };
//methode rendre
    public void rendre(){
        disponible=true;
    };
    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", idbook='" + idbook + '\'' +
                ", disponible=" + (disponible ? "Disponible" : "Indisponible") +
                ", categorie=" + categorie +
                "}\n";

        // "\n" pour le retour à la ligne a mettre dans une double quote

}
}





public class Livre {
    private String titre;
    private String auteur;
    private String idbook;
    private boolean disponible;

    // Constructeur
    public Livre(String titre, String auteur, String idbook, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.idbook = idbook;
        this.disponible = disponible;
    }

    // Getters and Setters
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String get
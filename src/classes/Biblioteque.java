package classes;

import enums.Categorie;
import exceptions.LivreNonDisponibleException;
import java.util.ArrayList;
import java.util.List;
import utils.DataMangerFile;

public class Biblioteque {
    private List<Livre> livreList;

    private DataMangerFile dataMangerFile = new DataMangerFile();

    public Biblioteque(List<Livre> livre) {
        if(livre != null || livre.isEmpty()){
            this.livreList = new ArrayList<>();
        }else {
            this.livreList = livre;
        }

    }

    public Biblioteque() {
        List<String> lines = dataMangerFile.lireData("catalogue.txt");
        livreList = new ArrayList<>();
        for(String line: lines){
            String[] parts = line.split(";");
            livreList.add(new Livre(parts[1],
                    parts[2],
                    parts[0],
                    Boolean.parseBoolean(parts[3]),
                    Categorie.valueOf(parts[4])));

        }
    }

   public String afficherLivres(){
        return livreList.toString();
    }

    List<Livre> getLivres() {
        return livreList;
    }
    public void addLivre(Livre livre){
        livreList.add(livre);
        dataMangerFile.stockerData(livre.toString(),"catalogue.txt");
    }

    public Livre getLivreById(String id) throws LivreNonDisponibleException {

        for(Livre livre1 : livreList){
            if(livre1.getIdbook().equals(id)){
                return livre1;
            }
        }
        throw new LivreNonDisponibleException("livre introuvable");
    }

    void emprunterUnLivre(String id){

        try {
            Livre livre = getLivreById(id);
            livre.emprunter();
        } catch (LivreNonDisponibleException e) {
            System.out.println(e.getMessage());
        }


    }

    void rendreUnLivre(String id) {

        try {
            Livre livre = getLivreById(id);
            livre.rendre();
        } catch (LivreNonDisponibleException e) {
            System.out.println(e.getMessage());
        }

    }
}

package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataMangerFile implements DataMangerInterface{
    @Override

    public void stockerData(String data ,String fileName) {
        try(FileWriter writer = new FileWriter(fileName);)  {
            writer.write(data + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> lireData(String fileName) {
        List<String> lineList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineList;
    }
    /***
     *  try (FileWriter writer = new FileWriter("catalogue.txt")) {
     *             for (Livre livre : listeLivres) {
     *                 writer.write(livre.toString() + "\n");
     *             }
     *         } catch (IOException e) {
     *             e.printStackTrace();
     *         }
     *
     *          try (BufferedReader reader = new BufferedReader(new FileReader("catalogue.txt"))) {
     *             String line;
     *             while ((line = reader.readLine()) != null) {
     *                 String[] parts = line.split(";");
     *                 Livre livre = new Livre(parts[1], parts[2], parts[0], Boolean.parseBoolean(parts[3]), Categorie.valueOf(parts[4]));
     *                 catalogue.add(livre);
     *             }
     *         } catch (IOException e) {
     *             e.printStackTrace();
     *         }
     */
}

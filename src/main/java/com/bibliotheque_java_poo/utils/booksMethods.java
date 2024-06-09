package com.bibliotheque_java_poo.utils;

import com.bibliotheque_java_poo.classes.Livre;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.lang.model.type.ArrayType;

import static com.bibliotheque_java_poo.classes.Livre.Categorie;

public class booksMethods {
    public static void getBooksList () {
        String userDir = System.getProperty("user.dir");
        File fileToReadFrom = new File(userDir +"/src/main/java/com/bibliotheque_java_poo/data/booksDatabase.json");
        Charset charsetOfTheFileToReadFrom = Charset.defaultCharset();

        try(BufferedReader reader = Files.newBufferedReader(Paths.get(userDir + "/src/main/java/com/bibliotheque_java_poo/data/booksDatabase.json"), charsetOfTheFileToReadFrom);) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                Livre[] booksList[0] = new Livre("","","",Categorie.FICTION);
                booksList.add(line);
            }

            System.out.println(booksList);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

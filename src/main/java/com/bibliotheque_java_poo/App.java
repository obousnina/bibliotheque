package com.bibliotheque_java_poo;
import com.bibliotheque_java_poo.utils.bibliothequeMethods;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;


public class App {
    public static void main(String[] args) {
        String parentPackagePath = bibliothequeMethods.returnParentPackagePath("./App.java");
        Charset charsetOfTheFileToReadFrom = Charset.defaultCharset();

        try(BufferedReader reader = Files.newBufferedReader(Paths.get(parentPackagePath + "data/booksDatabase.json"), charsetOfTheFileToReadFrom);) {
            String line = null;
                System.out.println("No");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
       catch (Exception e) {
            System.out.println(e.getMessage());
       }

    }

}
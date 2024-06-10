package com.bibliotheque_java_poo.utils;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import  com.bibliotheque_java_poo.classes.Livre;

public class booksMethods {
    public static void getBooksList () {
        String userDir = System.getProperty("user.dir");
        File fileToReadFrom = new File(userDir +"/src/main/java/com/bibliotheque_java_poo/data/booksDatabase.json");
        Charset charsetOfTheFileToReadFrom = Charset.defaultCharset();
        String booksSerialization= "";
        String line = null;

        try(BufferedReader reader = Files.newBufferedReader(Paths.get(userDir + "/src/main/java/com/bibliotheque_java_poo/data/booksDatabase.json"), charsetOfTheFileToReadFrom);) {

            while ((line = reader.readLine()) != null) {
                booksSerialization +=line;
            }
            Gson gson = new Gson();
            Livre[] booksList = gson.fromJson(booksSerialization, Livre[].class);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

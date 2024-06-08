package com.bibliotheque_java_poo.exceptions;
import java.lang.Exception;

public class LivreNonDisponibleException extends Exception {

   public LivreNonDisponibleException(String message ) {
    
      super(message);
   }
}
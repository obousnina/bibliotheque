package exceptions;
import java.lang.Exception;

public class LivreNonDisponibleException extends Exception {

   public LivreNonDisponibleException(String message ) {
    
      super(message);
   }
}
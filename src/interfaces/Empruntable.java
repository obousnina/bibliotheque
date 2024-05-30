package interfaces;

import exceptions.LivreNonDisponibleException;

public interface Empruntable {
    void emprunter() throws LivreNonDisponibleException;
    void rendre();

}

package interfaces;

import exeption.LivreNonDisponibleException;

public interface Empruntable {
    public void emprunter() throws LivreNonDisponibleException;
    public void rendre();
}

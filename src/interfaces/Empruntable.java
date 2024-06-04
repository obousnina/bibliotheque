package interfaces;

import classes.Livre;
import exceptions.LivreNonDisponibleException;

public interface Empruntable {

    public abstract void emprunter() throws LivreNonDisponibleException;
    public abstract void rendre();
}


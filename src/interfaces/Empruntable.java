package interfaces;

import classes.Livre;

public interface Empruntable {

    public abstract void emprunter(Livre livreEmprunte);
    public abstract void rendre(Livre livreRendu);
}


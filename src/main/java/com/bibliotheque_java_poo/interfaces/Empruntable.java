package com.bibliotheque_java_poo.interfaces;

import com.bibliotheque_java_poo.classes.Livre;
import com.bibliotheque_java_poo.exceptions.LivreNonDisponibleException;

public interface Empruntable {

    public abstract void emprunter() throws LivreNonDisponibleException;
    public abstract void rendre();
}


package classes;

interface Empruntable {
  void emprunter() throws LivreNonDisponibleExeption;
  void rendre();
}

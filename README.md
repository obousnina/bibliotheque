# Bibliotheque

## Contexte

Développer une application simple pour gérer une bibliothèque. Cette application doit permettre de suivre les livres, les membres de la bibliothèque et les prêts de livres.

## Objectifs

- Utiliser des types primitifs et des objets.
- Implémenter l'héritage.
- Utiliser des interfaces.
- Gérer les exceptions.

## Consignes

### Classes et Types Primitifs

Créez une classe `Livre` avec les attributs suivants :
- `titre` (String)
- `auteur` (String)
- `idbook` (String)
- `disponible` (boolean)

### Héritage

Créez une classe `Membre` avec les attributs :
- `nom` (String)
- `prenom` (String)
- `id` (int)

Créez une classe `Etudiant` qui hérite de `Membre` et ajoute l'attribut :
- `niveau` (String)

Créez une classe `Professeur` qui hérite de `Membre` et ajoute l'attribut :
- `departement` (String)

### Interface

Créez une interface `Empruntable` avec les méthodes suivantes :
- `emprunter()`: cette méthode doit permettre de marquer un livre comme emprunté.
- `rendre()`: cette méthode doit permettre de marquer un livre comme disponible.

Implémentez cette interface dans la classe `Livre`.

### Enum

Créez une énumération `Categorie` avec les valeurs suivantes :
- FICTION
- NON_FICTION
- SCIENTIFIQUE
- HISTOIRE
- BIOGRAPHIE

Ajoutez l'attribut `categorie` à la classe `Livre`.

### Exception

Créez une exception personnalisée `LivreNonDisponibleException` qui sera lancée lorsque quelqu'un essaie d'emprunter un livre déjà emprunté. Modifiez la méthode `emprunter()` dans la classe `Livre` pour lancer cette exception si le livre est déjà emprunté.

### Programme Principal

1. Créez un programme `main` qui demande à un gestionnaire de construire un catalogue de 10 livres pour la bibliothèque.

2. Ajoutez une deuxième partie où un élève peut réserver un livre de la bibliothèque.
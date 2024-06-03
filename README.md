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

1. Créez un programme `main` qui demande à un gestionnaire de construire un catalogue de 10 livres pour la bibliothèque. Utilisez la classe `Scanner` pour la saisie des informations.

2. Ajoutez une deuxième partie où un élève ou un professeur peut réserver un livre de la bibliothèque.

3. Ajoutez une troisième partie où le catalogue des livres est créé et stocké dans un fichier `catalogue.txt`. L'élève ou le professeur pourra réserver un livre à partir de ce fichier.

### Programme Principal

1. Créez un programme `main` qui demande à un gestionnaire de construire un catalogue de 10 livres pour la bibliothèque. Utilisez la classe `Scanner` pour la saisie des informations.

2. Ajoutez une deuxième partie où un élève ou un professeur peut réserver un livre de la bibliothèque.

3. Ajoutez une troisième partie où le catalogue des livres est créé et stocké dans un fichier `catalogue.txt`. L'élève ou le professeur pourra réserver un livre à partir de ce fichier.

#### Détails des Consignes pour le Point 3:

1. **Création du fichier catalogue.txt**:
    - Utilisez la classe `FileWriter` pour ouvrir un flux de sortie pour écrire dans un fichier nommé `catalogue.txt`.
    - Parcourez la liste des livres (par exemple, une `ArrayList<Livre>`) et écrivez chaque livre dans le fichier au format suivant:
      ```
      idbook;titre;auteur;disponible;categorie
      ```
      Utilisez des points-virgules (`;`) pour séparer les attributs.
    - Exemple:
      ```java
      FileWriter writer = new FileWriter("catalogue.txt");
      for (Livre livre : listeLivres) {
          writer.write(livre.getIdbook() + ";" + livre.getTitre() + ";" + livre.getAuteur() + ";" + livre.isDisponible() + ";" + livre.getCategorie() + "\n");
      }
      writer.close();
      ```

2. **Lecture du fichier catalogue.txt**:
    - Utilisez la classe `FileReader` et `BufferedReader` pour ouvrir un flux d'entrée pour lire à partir du fichier `catalogue.txt`.
    - Lisez chaque ligne du fichier avec `BufferedReader.readLine()` et créez des instances de `Livre` à partir des données lues.
    - Exemple:
      ```java
      BufferedReader reader = new BufferedReader(new FileReader("catalogue.txt"));
      String line;
      List<Livre> listeLivres = new ArrayList<>();
      while ((line = reader.readLine()) != null) {
          String[] parts = line.split(";");
          Livre livre = new Livre(parts[0], parts[1], parts[2], Boolean.parseBoolean(parts[3]), Categorie.valueOf(parts[4]));
          listeLivres.add(livre);
      }
      reader.close();
      ```

3. **Réservation d'un livre**:
    - Affichez la liste des livres disponibles à partir de la collection créée (par exemple, une `ArrayList<Livre>`).
    - Utilisez la classe `Scanner` pour demander à l'utilisateur (élève ou professeur) de saisir l'`idbook` du livre qu'il souhaite réserver.
    - Cherchez le livre correspondant dans la collection.
    - Utilisez la méthode `emprunter()` pour marquer le livre comme emprunté, en gérant l'exception `LivreNonDisponibleException` si le livre est déjà emprunté.
    - Exemple:
      ```java
      Scanner scanner = new Scanner(System.in);
      System.out.println("Entrez l'ID du livre à réserver :");
      String idbook = scanner.nextLine();
      for (Livre livre : listeLivres) {
          if (livre.getIdbook().equals(idbook)) {
              try {
                  livre.emprunter();
                  System.out.println("Le livre " + livre.getTitre() + " a été réservé.");
              } catch (LivreNonDisponibleException e) {
                  System.out.println("Le livre est déjà emprunté.");
              }
              break;
          }
      }
      ```
    - Mettez à jour le fichier `catalogue.txt` pour refléter les changements dans la disponibilité des livres en répétant l'étape de création du fichier.



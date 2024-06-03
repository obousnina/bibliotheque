# Installation de Maven

## Sous Windows

1. **Télécharger Maven :**
   - Rendez-vous sur le site officiel d'Apache Maven : [Apache Maven Download](https://maven.apache.org/download.cgi)
   - Téléchargez le fichier binaire (Binary zip archive) de la dernière version stable.

2. **Extraire l'archive :**
   - Extrayez le contenu de l'archive téléchargée dans un répertoire de votre choix (par exemple, `C:\Program Files\Apache\Maven`).

3. **Configurer les variables d'environnement :**
   - Ouvrez le Panneau de configuration.
   - Allez dans Système et sécurité > Système > Paramètres système avancés.
   - Cliquez sur le bouton "Variables d'environnement".
   - Sous "Variables système", cliquez sur "Nouveau" pour ajouter une nouvelle variable.
     - Nom de la variable : `MAVEN_HOME`
     - Valeur de la variable : le chemin où Maven a été extrait (par exemple, `C:\Program Files\Apache\Maven\apache-maven-3.x.x`).
   - Recherchez la variable `Path` dans la liste des variables système, sélectionnez-la et cliquez sur "Modifier".
   - Ajoutez le chemin `%MAVEN_HOME%\bin` à la liste des chemins existants.
   - Cliquez sur OK pour fermer toutes les fenêtres.

4. **Vérifier l'installation :**
   - Ouvrez une nouvelle fenêtre de commande (Cmd) et tapez `mvn -v`.
   - Vous devriez voir les informations de la version de Maven installée ainsi que les informations sur Java.

## Sous Linux

1. **Installer Maven à partir des dépôts de votre distribution :**
   - Pour Debian/Ubuntu, exécutez les commandes suivantes dans le Terminal :
     ```sh
     sudo apt update
     sudo apt install maven
     ```
   - Pour Fedora, exécutez les commandes suivantes :
     ```sh
     sudo dnf install maven
     ```
   - Pour Arch Linux, exécutez la commande suivante :
     ```sh
     sudo pacman -S maven
     ```

2. **Vérifier l'installation :**
   - Tapez `mvn -v` dans le Terminal.
   - Vous devriez voir les informations de la version de Maven installée ainsi que les informations sur Java.

## Vérification

Après avoir suivi les étapes ci-dessus pour votre système d'exploitation, ouvrez une nouvelle fenêtre de terminal ou d'invite de commande et exécutez :

```sh
mvn -v

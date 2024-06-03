# Installation du JDK 21 et de Maven

Ce guide vous explique comment installer le JDK 21 (Java Development Kit) et Maven sur votre machine.

## Prérequis

- Système d'exploitation : Windows, macOS, ou Linux
- Droits administratifs pour installer des logiciels

## Installation du JDK 21

### Windows

1. Téléchargez le JDK 21 à partir de la page officielle de [Oracle](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html).
2. Exécutez le fichier d'installation téléchargé et suivez les instructions à l'écran.
3. Une fois l'installation terminée, configurez les variables d'environnement :
    - Ouvrez le Panneau de configuration -> Système et sécurité -> Système -> Paramètres système avancés.
    - Cliquez sur "Variables d'environnement".
    - Sous "Variables système", cliquez sur "Nouvelle..." et ajoutez `JAVA_HOME` avec la valeur du chemin d'installation du JDK (par exemple, `C:\Program Files\Java\jdk-21`).
    - Modifiez la variable `Path` et ajoutez `%JAVA_HOME%\bin`.

### macOS

1. Téléchargez le JDK 21 à partir de la page officielle de [Oracle](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html) ou utilisez Homebrew :
    ```sh
    brew install openjdk@21
    ```
2. Configurez les variables d'environnement :
    - Ajoutez les lignes suivantes à votre fichier `~/.bash_profile` ou `~/.zshrc` :
      ```sh
      export JAVA_HOME=$(/usr/libexec/java_home -v 21)
      export PATH=$JAVA_HOME/bin:$PATH
      ```
    - Rechargez le fichier de profil :
      ```sh
      source ~/.bash_profile
      ```
      ou
      ```sh
      source ~/.zshrc
      ```

### Linux

1. Installez le JDK 21 en utilisant le gestionnaire de paquets de votre distribution. Par exemple, pour Ubuntu :
    ```sh
    sudo apt update
    sudo apt install openjdk-21-jdk
    ```
2. Configurez les variables d'environnement :
    - Ajoutez les lignes suivantes à votre fichier `~/.bashrc` ou `~/.profile` :
      ```sh
      export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
      export PATH=$JAVA_HOME/bin:$PATH
      ```
    - Rechargez le fichier de profil :
      ```sh
      source ~/.bashrc
      ```
      ou
      ```sh
      source ~/.profile
      ```

## Vérification de l'installation du JDK 21

Pour vérifier que le JDK 21 est correctement installé, ouvrez un terminal (ou une invite de commandes sur Windows) et exécutez la commande suivante :
```sh
java -version

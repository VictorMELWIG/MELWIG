Melwig Victor - AlwaysData - 03/02/2025

# Mission Alwaysdata

## Étape 0 : Création d'un espace sur Alwaysdata

### Services offerts par Alwaysdata
Alwaysdata propose plusieurs services, notamment :
- Hébergement web (HTML, CSS, JS, PHP, Python, Ruby...)
- Base de données (MySQL, PostgreSQL, SQLite...)
- Accès SSH et SFTP
- Gestion de domaines et sous-domaines
- Certificats SSL gratuits

### Services nécessaires pour déployer un site web
Pour héberger un site web en HTML, CSS, JS et PHP, nous aurons besoin des services suivants :
- Hébergement web avec support PHP
- Accès SSH pour le transfert et la gestion des fichiers
- Gestion de bases de données (si nécessaire)
- Certificat SSL pour sécuriser l'accès

### Nom de domaine choisi
victormelwig.alwaysdata.net

---

## Étape 1 : Activation de SSH

### Intérêt du protocole SSH
SSH (Secure Shell) est un protocole sécurisé permettant de se connecter à un serveur distant en ligne de commande, d'exécuter des commandes et de transférer des fichiers de manière cryptée. Il fonctionne par défaut sur le port **22**.

### Protocole alternatif et différence avec SSH
Le protocole FTP permet aussi le transfert de fichiers, mais il n'est pas sécurisé (données en clair). SSH utilise le chiffrement pour sécuriser les échanges.

### Activation de SSH sur Alwaysdata
1. Se connecter à Alwaysdata.
2. Aller dans **Administration > Accès SSH**.
3. Activer SSH et noter les identifiants de connexion.

### Connexion SSH au serveur
Commande pour se connecter :
```sh
ssh victormelwig@ssh-victormelwig.alwaysdata.net 
```

![Image](https://github.com/user-attachments/assets/b70cb61f-6e9c-4793-9da0-40befc80fe38)

### Répertoire où déposer les fichiers du site
Les fichiers doivent être placés dans :
```
/home/victormelwig/www/
```

![Image](https://github.com/user-attachments/assets/0270a8ed-dffa-4085-a0cb-0ec819927c3d)
---

## Étape 2 : Copier le contenu sur Alwaysdata

### Chemins absolus
- Chemin local : `/c:/Users/melwi/desktop/CoursHecten/HTML/portfolio`
- Chemin distant : `/home/victormelwig/www/`

### Utilisation de `scp` et `rsync`
Ces commandes permettent de transférer des fichiers via SSH.
- `scp` : transfert simple de fichiers.
- `rsync` : synchronisation optimisée en ne transférant que les fichiers modifiés.

### Commande `scp` pour envoyer les fichiers :
```sh
scp -r c:/Users/melwi/desktop/CoursHecten/HTML/portfolio/ victormelwig@ssh-victormelwig.alwaysdata.net:/home/victormelwig/www/
```

![Image](https://github.com/user-attachments/assets/0280a17d-6faa-4d07-a579-718e3a8a3041)

### Vérification de l'ajout
1. Se connecter en SSH :
   ```sh
   ssh victormelwig@ssh-victormelwig.alwaysdata.net
   ```
   ![Image](https://github.com/user-attachments/assets/dfd9aef7-05f4-4819-9966-cb2be988e58b)
2. Vérifier les fichiers :
   ```sh
   ls -l /home/victormelwig/www/
   ```
   ![Image](https://github.com/user-attachments/assets/1a3fef04-9d81-4004-af73-26e324dc2dcb)

### URL pour accéder au site
```
https://monportfolio.alwaysdata.net](https://victormelwig.alwaysdata.net/portfolio/
```

---

## Étape 3 : Gestion des accès à un dossier privé

### Méthode via `.htaccess`
1. Créer un fichier `.htaccess` dans le dossier à protéger :
   ```sh
   nano /home/victormelwig/www/protected/.htaccess
   ```
   ![Image](https://github.com/user-attachments/assets/b5b78767-42aa-46c7-af7b-b7a379dfa58c)
2. Ajouter les lignes suivantes :
   ```apache
   AuthType Basic
   AuthName "Accès restreint"
   AuthUserFile /home/utilisateur/.htpasswd
   Require valid-user
   ```
3. Créer un fichier `.htpasswd` :
   ```sh
   htpasswd -c /home/victormelwig/.htpasswd victormelwig
   ```

Secret de connexion :
- Nom d'utilisateur : `professeur`
- Mot de passe : `$apr1$LDFBtQJZ$nLiMB9yhEPx5zmgo9zOes/`

---

## Étape 4 : Gestion de paires de clés privée et publique

### Principe d'authentification
L'authentification par clé SSH repose sur une paire de clés :
- **Clé privée** (conservée sur le client, jamais partagée).
- **Clé publique** (déposée sur le serveur dans `~/.ssh/authorized_keys`).

Cela remplace le mot de passe et sécurise la connexion.

### Avantages de cette méthode
- Sécurité accrue (pas d'échange de mots de passe).
- Protection contre les attaques par force brute.
- Automatisation possible des connexions.

### Étapes pour configurer les clés SSH
1. Générer une paire de clés sur le client :
   ```sh
   ssh-keygen -t rsa -b 4096 -C "monemail@example.com"
   ```
2. Copier la clé publique sur Alwaysdata :
   ```sh
   ssh-copy-id victormelwig@ssh-victormelwig.alwaysdata.net
   ```
3. Vérifier la connexion sans mot de passe :
   ```sh
   ssh victormelwig@ssh-victormelwig.alwaysdata.net

package fr.hecten;

public class Easyline3 {
    public static void main(String[] args) {
        // Création des objets AdressePostale
        AdressePostale adresse1 = new AdressePostale("10 rue du caca", "Tanaland", 666);
        AdressePostale adresse2 = new AdressePostale("5 avenue de la Reine des tanas", "Tanaland", 666);
        AdressePostale adresse3 = new AdressePostale("12 rue Grossetimp", "Tanaland", 666);

        // 🔹 Affichage des adresses initiales
        System.out.println("📌 Adresses initiales :");
        adresse1.afficher();
        adresse2.afficher();
        adresse3.afficher();

        // 🔹 Création du voyageur
        Voyageur voyageur = new Voyageur("Dupont", "Pierre", adresse1); // Ajout de l'adresse initiale

        // 🔹 Affichage des informations du voyageur
        System.out.println("\n📌 Informations sur le voyageur :");
        voyageur.afficher();

        // 🔹 Modification de l'adresse du voyageur (partie b)
        adresse1.setNumeroVoie("25 avenue des Champs-Élysées");
        adresse1.setVille("Lyon");
        adresse1.setCodePostal(69008);

        // 🔹 Réaffichage du voyageur avec la nouvelle adresse
        System.out.println("\n📌 Voyageur après modification de l'adresse :");
        voyageur.afficher();

        // 🔹 Modification de la ville du voyageur (partie c)
        voyageur.setVille("Paris");

        // 🔹 Réaffichage du voyageur après modification de la ville
        System.out.println("\n📌 Voyageur après modification de la ville :");
        voyageur.afficher();

        // 🔹 Modification de l'adresse 2
        adresse2.setNumeroVoie("100 rue Saint-Ferréol");
        adresse2.setVille("Bordeaux");
        adresse2.setCodePostal(33000);

        // 🔹 Modification de l'adresse 3
        adresse3.setNumeroVoie("100 rue StHilaire");
        adresse3.setVille("Lille");
        adresse3.setCodePostal(59000);

        // 🔹 Affichage après modification des autres adresses
        System.out.println("\n📌 Adresses après modification :");
        adresse1.afficher();
        adresse2.afficher();
        adresse3.afficher(); // Pas modifiée, reste la même
    }

    // Classe AdressePostale
    static class AdressePostale {
        private String numeroVoie;
        private String ville;
        private int codePostal;

        // Constructeur
        public AdressePostale(String numeroVoie, String ville, int codePostal) {
            this.numeroVoie = numeroVoie;
            this.ville = ville;
            this.codePostal = codePostal;
        }

        // Méthodes GET
        public String getNumeroVoie() {
            return numeroVoie;
        }

        public String getVille() {
            return ville;
        }

        public int getCodePostal() {
            return codePostal;
        }

        // Méthodes SET
        public void setNumeroVoie(String numeroVoie) {
            this.numeroVoie = numeroVoie;
        }

        public void setVille(String ville) {
            this.ville = ville;
        }

        public void setCodePostal(int codePostal) {
            this.codePostal = codePostal;
        }

        // Méthode pour afficher l'adresse
        public void afficher() {
            System.out.println(numeroVoie + ", " + codePostal + " " + ville);
        }
    }

    // Classe Voyageur
    static class Voyageur {
        private String nom;
        private String prenom;
        private AdressePostale adressePostale;

        // Constructeur
        public Voyageur(String nom, String prenom, AdressePostale adressePostale) {
            this.nom = nom;
            this.prenom = prenom;
            this.adressePostale = adressePostale;
        }

        // Méthode pour afficher les informations du voyageur
        public void afficher() {
            System.out.println("Voyageur : " + prenom + " " + nom);
            System.out.print("Adresse : ");
            adressePostale.afficher();  // Affiche l'adresse associée au voyageur
        }

        // Méthode pour modifier la ville du voyageur
        public void setVille(String ville) {
            this.adressePostale.setVille(ville);  // Modifie la ville de l'adresse du voyageur
        }
    }
}


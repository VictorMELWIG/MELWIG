package fr.hecten.easyline2;

import java.util.Scanner;

public class Compagnie {
    public String nom;
    public int code;
    public double ca;
    public String couleurPrincipaleLogo;
    public String couleurSecondaireLogo;

    public Compagnie() {}

    public Compagnie(String nomCompagnie) {
        this.nom = nomCompagnie;
    }

    public Compagnie(String nomCompagnie, String couleurPrincipale, String couleurSecondaire) {
        this.nom = nomCompagnie;
        this.couleurPrincipaleLogo = couleurPrincipale;
        this.couleurSecondaireLogo = couleurSecondaire;
    }

    public Compagnie(String nomCompagnie, String couleurPrincipale, String couleurSecondaire, int code) {
        this.nom = nomCompagnie;
        this.couleurPrincipaleLogo = couleurPrincipale;
        this.couleurSecondaireLogo = couleurSecondaire;
        this.code = code;
    }

    public void afficher() {
        System.out.println("Nom: " + this.nom);
        System.out.println("Code: " + this.code);
        System.out.println("CA: " + this.ca);
        System.out.println("Couleur Principale: " + this.couleurPrincipaleLogo);
        System.out.println("Couleur Secondaire: " + this.couleurSecondaireLogo);
        System.out.println("-------------------------------");
    }

    public int getCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le mot de passe pour obtenir le code: ");
        String mdp = scanner.nextLine();
        if ("1234".equals(mdp)) {
            return this.code;
        } else {
            System.out.println("Mot de passe incorrect.");
            return -1;
        }
    }

    public String getNom() {
        return this.nom;
    }

    public double getCA() {
        return this.ca;
    }

    public String getCouleurPrincipaleLogo() {
        return this.couleurPrincipaleLogo;
    }

    public String getCouleurSecondaire() {
        return this.couleurSecondaireLogo + " second";
    }

    public void setCode(int newCode) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le mot de passe pour modifier le code: ");
        String mdp = scanner.nextLine();
        if ("1234".equals(mdp)) {
            this.code = newCode;
        } else {
            System.out.println("Mot de passe incorrect.");
        }
    }

    public void setNom(String newNom) {
        this.nom = newNom;
    }

    public void setCA(double newCA) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le mot de passe pour modifier le CA: ");
        String mdp = scanner.nextLine();
        if ("0000".equals(mdp)) {
            this.ca = newCA * 1.3; // Augmente de 30%
        } else {
            System.out.println("Mot de passe incorrect.");
        }
    }

    public void setCouleurPrincipaleLogo(String couleur) {
        this.couleurPrincipaleLogo = couleur;
    }

    public void setCouleurSecondaire(String couleur) {
        this.couleurSecondaireLogo = couleur;
    }

    public static void main(String[] args) {
        Compagnie maCompagnie1 = new Compagnie("zaza", "Orange", "Vert", 101);
        maCompagnie1.afficher();
        Compagnie maCompagnie2 = new Compagnie("zozo", "Rouge", "Noir", 202);
        System.out.println("Code de maCompagnie2: " + maCompagnie2.getCode());
        maCompagnie2.afficher();
        Compagnie maCompagnie3 = new Compagnie("easyJune", "Bleu", "Blanc", 303);
        maCompagnie3.afficher();
        Compagnie maCompagnie4 = new Compagnie("zuzu", "Gris", "Noir", 404);
        maCompagnie4.afficher();
        Compagnie maCompagnie5 = new Compagnie("papa", "Jaune", "Marron", 505);
        maCompagnie5.afficher();
        Compagnie maCompagnie6 = new Compagnie("popo", "Violet", "Rose");
        maCompagnie6.afficher();
        Compagnie maCompagnie7 = new Compagnie("pupu", "Noir", "Cyan", 707);
        maCompagnie7.afficher();
        System.out.println("Code de maCompagnie6: " + maCompagnie6.getCode());
    }
}
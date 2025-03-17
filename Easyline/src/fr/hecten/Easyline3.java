package fr.hecten;

import fr.hecten.easyline3.AdressePostale;
import fr.hecten.easyline1.Voyageur;

public class Easyline3 {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale("10 rue du caca", "Tanaland", 666);
        AdressePostale adresse2 = new AdressePostale("5 avenue de la Reine des tanas", "Tanaland", 666);
        AdressePostale adresse3 = new AdressePostale("12 rue Grossetimp", "Tanaland", 666);

        System.out.println(" Adresses initiales :");
        adresse1.afficher();
        adresse2.afficher();
        adresse3.afficher();

        // 🔹 Création du voyageur
        Voyageur voyageur = new Voyageur("Dupont", "Pierre");

        // 🔹 Affichage des informations du voyageur
        System.out.println("\n📌 Informations sur le voyageur :");
        voyageur.afficher();

        adresse1.setNumeroVoie("25 avenue des Champs-Élysées");
        adresse1.setVille("Lyon");
        adresse1.setCodePostal(69008);

        adresse2.setNumeroVoie("100 rue Saint-Ferréol");
        adresse2.setVille("Bordeaux");
        adresse2.setCodePostal(33000);

        adresse3.setNumeroVoie("100 rue StHilaire");
        adresse3.setVille("Lille");
        adresse3.setCodePostal(59000);

        System.out.println("\n Adresses après modification :");
        adresse1.afficher();
        adresse2.afficher();
        adresse3.afficher();
    }
}




package fr.hecten.easyline4;

import java.util.ArrayList;
import java.util.List;

public class AgenceVoyage {
    private String nom;
    private String adresse;
    private List<Voyageur> voyageurs;

    public AgenceVoyage(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
        this.voyageurs = new ArrayList<>();
        // Initialisation avec au moins cinq voyageurs
        voyageurs.add(new Voyageur("Alice"));
        voyageurs.add(new Voyageur("Bob"));
        voyageurs.add(new Voyageur("Charlie"));
        voyageurs.add(new Voyageur("David"));
        voyageurs.add(new Voyageur("Eve"));
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void ajouterVoyageur(Voyageur voyageur) {
        this.voyageurs.add(voyageur);
    }

    public Voyageur recupererVoyageur(String nom) {
        for (Voyageur voyageur : voyageurs) {
            if (voyageur.getNom().equalsIgnoreCase(nom)) {
                return voyageur;
            }
        }
        return null; // Retourne null si le voyageur n'est pas trouvé
    }

    public void supprimerVoyageur(String nom) {
        voyageurs.removeIf(voyageur -> voyageur.getNom().equalsIgnoreCase(nom));
    }

    public void afficherInformations() {
        System.out.println("Agence : " + nom);
        System.out.println("Adresse : " + adresse);
        System.out.println("Voyageurs : " + voyageurs);
    }
}
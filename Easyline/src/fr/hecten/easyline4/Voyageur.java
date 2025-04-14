package fr.hecten.easyline4;

public class Voyageur {
    private String nom;

    public Voyageur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public String toString() {
        return "Voyageur{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
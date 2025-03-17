package fr.hecten.easyline1;

public class Voyageur {
    // liste des attributs ou propriétés privées
    private String nom;
    private int anneeNaissance;
    private String categorie;

    public Voyageur(String n, int a) {//constructeur
        this.setNom(n);// appel de notre propre fonction setNom pour rester cohérent
        this.setAnneeNaissance(a);
        this.setCategorie();
    }

    public String getNom() {
        return this.nom; //retourner mon propre nom
    }

    public void setNom(String n) {
        if (n.length()<=2) { // fonction pour déterminer le nombre de caractères
            System.err.println("Le nom doit avoir au moins 2 caractère.");
        } else {
            this.nom = n;
        }
    }

    public void affiche() {
        System.out.println(nom + " ; " + anneeNaissance);
    }

    public int getAge() {
        int age = 2025 - this.anneeNaissance;
        return age;
    }

    public int getAnneeNaissance() {
        return this.anneeNaissance;
    }

    public void setAnneeNaissance(int a) {
        if (a > 2025) {
            System.err.println("L'année de naissance doit être antérieure à 2025.");
        } else {
            this.anneeNaissance = a;
        }
    }

    public String getCategorie() {
        return this.categorie;
    }

    public void setCategorie() {
        if (getAge()<1){
            categorie = "nourisson";
        } else if (getAge()<18) {
            categorie = "enfant";
        } else if (getAge()<60) {
            categorie = "adulte";
        }else {
            categorie = "senior";
        }
    }
}
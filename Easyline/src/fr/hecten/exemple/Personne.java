package fr.hecten.exemple;

public class Personne {
    // liste des attributs ou propriétés privées
    public String nom;
    public int anneeNaissance;
    public double salaire;

    //constructeur avec 3 arguments en entrée
    public Personne(String n, int a, double s) {
        this.setNom(n);// appel de notre propre fonction setNom pour rester cohérent
        this.setAnneeNaissance(a);
        this.setSalaire(s);
    }

    public void affiche() {
        System.out.println(nom + " ; " + anneeNaissance + " ; " + salaire);
    }

    public int getAge() {
        int age = 2025 - this.anneeNaissance;
        return age;
    }
    public String getNom() {
        return this.nom; //retourner mon propre nom
    }

    public void setNom(String n) {
        if (n.isEmpty()) {
            System.err.println("Le nom doit avoir au moins 1 caractère.");
        }else {
            this.nom = n;
        }
    }

    public int getAnneeNaissance() {
        return this.anneeNaissance;
    }

    public void setAnneeNaissance(int a) {
        if (a>2025) {
            System.err.println("L'année de naissance doit être antérieure à 2025.");
        }else {
            this.anneeNaissance = a;
        }
    }

    public double getSalaire() {
        return this.salaire;
    }

    public void setSalaire(double s) {
        if (s<0) {
            System.err.println("Le salaire doit être positif.");
        }else {
            this.salaire = s;
        }
    }
}
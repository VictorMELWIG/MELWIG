package fr.hecten;

import fr.hecten.exemple.Personne;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hello, World! --- test de l'exemple");
        Personne p1 = new Personne("Wu", 1950, 1300);
        Personne p2 = new Personne("mercier", 1962, 3000);
        System.out.println("Nom de p1 " + p1.getNom());
        //p1.nom="";
        //p1.setSalaire();
        p1.affiche();
        p2.affiche();
        System.out.println("Age de p1 :" + p1.getAge());
        System.out.println("Age de p2 :" + p2.getAge());
    }
}
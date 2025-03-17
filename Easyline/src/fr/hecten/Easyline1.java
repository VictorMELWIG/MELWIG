package fr.hecten;

import fr.hecten.easyline1.Voyageur;

public class Easyline1 { //propriété
    public static void main(String[] args) {
        System.out.println("test");
        Voyageur v1 = new Voyageur("Feur", 2008);
        System.out.println("Nom de v1 " + v1.getNom() + v1.getCategorie());
        System.out.println("Age de v1 :" + v1.getAge());
        Voyageur v2 = new Voyageur("Coubeh", 1962);
        System.out.println("Nom de v2 " + v2.getNom() + v2.getCategorie());
        System.out.println("Age de v2 :" + v2.getAge());

        //p1.nom="";
        v1.affiche();
        v2.affiche();

// TODO à faire
    }
}

package fr.hecten;

import fr.hecten.easyline2.Compagnie;

public class Easyline2 {
    public static void main(String[] args){
        Compagnie maCompagnie1= new Compagnie();
        maCompagnie1.nom="zaza";
        maCompagnie1.afficher();
        Compagnie maCompagnie2= new Compagnie("zozo");
        Compagnie maCompagnie3= new Compagnie("easyJune");
        maCompagnie3.afficher();
        Compagnie maCompagnie4= new Compagnie("C4");
        Compagnie maCompagnie5= new Compagnie();
        maCompagnie5.nom="C5";


    }
}

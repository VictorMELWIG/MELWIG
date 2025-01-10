package fr.hecten.tinycar5;
import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Combien d'items voulez-vous ajouter ? : ");
        int taille = scanner.nextInt();
        String[] noms = new String[taille];
        double[] prixHT = new double[taille];
        double[] prixTTC = new double[taille];
        for (int i = 0; i < taille; i++) {
            System.out.print("Nom de l'item " + (i + 1) + " : ");
            noms[i] = scanner.next();
            System.out.print("Prix HT de " + noms[i] + " : ");
            prixHT[i] = scanner.nextDouble();
        }
        for (int i = 0; i < taille; i++) {
            prixTTC[i] = calculerPrixTTC(prixHT[i]);
        }
        afficherTableaux(noms, prixHT, prixTTC);
        double moyenne = calculerMoyennePrix(prixHT);
        double min = trouverPrixMin(prixHT);
        double max = trouverPrixMax(prixHT);
        System.out.println("\nStatistiques des prix HT :");
        System.out.println("Prix moyen : " + moyenne + " €");
        System.out.println("Prix minimum : " + min + " €");
        System.out.println("Prix maximum : " + max + " €");
        scanner.close();
    }
    public static void afficherTableaux(String[] noms, double[] prixHT, double[] prixTTC) {
        System.out.println("\nListe des accessoires, leurs prix HT et TTC :");
        for (int i = 0; i < noms.length; i++) {
            System.out.println(noms[i] + " - Prix HT : " + prixHT[i] + " € - Prix TTC : " + prixTTC[i] + " €");
        }
    }
    public static double calculerPrixTTC(double prixHT) {
        return prixHT * 1.20; // Application de la TVA (20%)
    }
    public static double calculerMoyennePrix(double[] prixHT) {
        double somme = 0;
        for (double prix : prixHT) {
            somme += prix;
        }
        return somme / prixHT.length;
    }
    public static double trouverPrixMin(double[] prixHT) {
        double min = prixHT[0];
        for (double prix : prixHT) {
            if (prix < min) {
                min = prix;
            }
        }
        return min;
    }
    public static double trouverPrixMax(double[] prixHT) {
        double max = prixHT[0];
        for (double prix : prixHT) {
            if (prix > max) {
                max = prix;
            }
        }
        return max;
    }
}

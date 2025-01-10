package fr.hecten.tinycar5;
import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Combien d'items voulez-vous ajouter ? : ");
        int taille = scanner.nextInt();
        String[] noms = new String[taille];
        double[] prixHT = new double[taille];
        double[] prixTTC = new double[taille]; // Nouveau tableau pour les prix TTC
        for (int i = 0; i < taille; i++) {
            System.out.print("Nom de l'item " + (i + 1) + " : ");
            noms[i] = scanner.next();
            System.out.print("Prix HT de " + noms[i] + " : ");
            prixHT[i] = scanner.nextDouble();
        }
        for (int i = 0; i < taille; i++) {
            prixTTC[i] = calculerPrixTTC(prixHT[i]); // Utilisation de la fonction
        }
        System.out.println("\nListe des items, leurs prix HT et TTC :");
        for (int i = 0; i < taille; i++) {
            System.out.println(noms[i] + " - Prix HT : " + prixHT[i] + " € - Prix TTC : " + prixTTC[i] + " €");
        }
        scanner.close();
    }
    public static void afficherDescription(String nom, double prixHT) {
        System.out.println("Accessoire : " + nom + " - Prix HT : " + prixHT + " €");
    }
    public static double calculerPrixTTC(double prixHT) {
        return prixHT * 1.20; // Application de la TVA (20%)
    }
}

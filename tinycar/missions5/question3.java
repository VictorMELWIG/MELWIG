package fr.hecten.tinycar5;
import java.util.Scanner;
public class question3 {
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
        scanner.close();
    }
    public static void afficherTableaux(String[] noms, double[] prixHT, double[] prixTTC) {
        System.out.println("\nListe des accessoires, leurs prix HT et TTC :");
        for (int i = 0; i < noms.length; i++) {
            System.out.println(noms[i] + " - Prix HT : " + prixHT[i] + " € - Prix TTC : " + prixTTC[i] + " €");
        }
    }
    public static double calculerPrixTTC(double prixHT) {
        return prixHT * 1.20;
    }
}

package fr.hecten.tinycar5;
import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        // Code principal pour gérer les entrées utilisateur et les calculs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Combien d'items voulez-vous ajouter ? : ");
        int taille = scanner.nextInt();
        String[] noms = new String[taille];
        double[] prix = new double[taille];
        for (int i = 0; i < taille; i++) {
            System.out.print("Nom de l'item " + (i + 1) + " : ");
            noms[i] = scanner.next();
            System.out.print("Prix HT de " + noms[i] + " : ");
            prix[i] = scanner.nextDouble();
        }
        double total = 0;
        double prixMin = prix[0];
        double prixMax = prix[0];
        String itemMin = noms[0];
        String itemMax = noms[0];
        System.out.println("\nListe des items et leurs prix HT :");
        for (int i = 0; i < taille; i++) {
            // Utilisation de la procédure
            afficherDescription(noms[i], prix[i]);
            total += prix[i];
            if (prix[i] < prixMin) {
                prixMin = prix[i];
                itemMin = noms[i];
            }
            if (prix[i] > prixMax) {
                prixMax = prix[i];
                itemMax = noms[i];
            }
        }
        double prixMoyen = total / taille;

        System.out.println("\nTotal : " + total + " €");
        System.out.println("Item le moins cher : " + itemMin + " (" + prixMin + " €)");
        System.out.println("Item le plus cher : " + itemMax + " (" + prixMax + " €)");
        System.out.println("Prix moyen des items : " + prixMoyen + " €");
        scanner.close();
    }
    public static void afficherDescription(String nom, double prixHT) {
        System.out.println("Accessoire : " + nom + " - Prix HT : " + prixHT + " €");
    }
}

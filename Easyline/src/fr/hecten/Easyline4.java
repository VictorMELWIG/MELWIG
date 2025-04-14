package fr.hecten;

import fr.hecten.easyline4.Voyageur;
import fr.hecten.easyline4.AgenceVoyage;
import java.util.Scanner;

public class Easyline4 {
    public static void main(String[] args) {
        AgenceVoyage agence = new AgenceVoyage("Easyline", "123 rue des crottes");
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\nChoisissez une fonctionnalité :");
            System.out.println("1. Ajouter un voyageur");
            System.out.println("2. Rechercher un voyageur");
            System.out.println("3. Supprimer un voyageur");
            System.out.println("4. Afficher les informations de l'agence");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Nom du nouveau voyageur : ");
                    String nomNouveauVoyageur = scanner.nextLine();
                    agence.ajouterVoyageur(new Voyageur(nomNouveauVoyageur));
                    break;
                case 2:
                    System.out.print("Nom du voyageur à rechercher : ");
                    String nomRecherche = scanner.nextLine();
                    Voyageur voyageurTrouve = agence.recupererVoyageur(nomRecherche);
                    if (voyageurTrouve != null) {
                        System.out.println("Voyageur trouvé : " + voyageurTrouve);
                    } else {
                        System.out.println("Voyageur non trouvé.");
                    }
                    break;
                case 3:
                    System.out.print("Nom du voyageur à supprimer : ");
                    String nomSuppression = scanner.nextLine();
                    Voyageur voyageurASupprimer = agence.recupererVoyageur(nomSuppression);
                    if (voyageurASupprimer != null) {
                        System.out.println("Voyageur à supprimer : " + voyageurASupprimer);
                        agence.supprimerVoyageur(nomSuppression);
                        System.out.println("Voyageur supprimé.");
                    } else {
                        System.out.println("Voyageur non trouvé.");
                    }
                    break;
                case 4:
                    agence.afficherInformations();
                    break;
                case 5:
                    System.out.println("Application terminée.");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        } while (choix != 5);

        scanner.close();
    }
}
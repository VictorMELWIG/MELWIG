import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //fct principlae pour executer une appli
        Scanner aspi = new Scanner(System.in);
        System.out.println("Quel est votre Prenom?");
        String prenom = aspi.nextLine();
        System.out.println("hello " + prenom);
        System.out.println("Est ce que vous etes majeur? (true or false)");
        boolean majeur = aspi.nextBoolean();
        if (majeur) {
            System.out.println("Tu es majeur");
        } else {
            System.out.println("Tu es mineur");
        }

    }
}

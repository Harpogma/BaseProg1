package serie3;

import java.util.Scanner;

public class Exercice08 {
    public static void main(String[] args) {
        System.out.println("Ce programme calcule la factorielle jusqu'au nombre entré par l'utilisateur.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un nombre entier : ");
        int number = scanner.nextInt();
        scanner.nextLine();

        int compteur = 1;
        for (int i = 1; i <= number; i++) {
            compteur *= i;
        }
        System.out.println("Le total est de : " + compteur);
    }
}

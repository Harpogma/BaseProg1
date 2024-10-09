package serie3;

import java.util.Scanner;

public class Exercice07 {
    public static void main(String[] args) {
        System.out.println("Ce programme additionne tous les nombres entre 1 et votre nombre.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un nombre entier : ");
        int number = scanner.nextInt();
        scanner.nextLine();

        int compteur = 0;
        for (int i = 1; i <= number; i++) {
            compteur += i;
        }
        System.out.println("Le total est de : " + compteur);
    }
}

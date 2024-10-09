package serie3;

import java.util.Scanner;

public class Exercice03 {
    public static void main(String[] args) {
        System.out.println("Ce programme affiche les nombres pairs entre 1 et une limite supérieure saisie par\n" +
                "l'utilisateur.");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Entrez la limite supérieure (>=2) des nombres pairs à afficher");
        int number = userInput.nextInt();

        int borneInferieur = 1;
        System.out.println("Liste des nombres pairs entre 1 et " + number + " est :");

        for (int i = 1; i <= number; i++) {
            if(i % 2== 0) {
                System.out.println(i);
            }
        }
    }
}

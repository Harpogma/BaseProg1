package serie5;

import java.util.Scanner;

public class Exercice10 {

    public static int randomNumber(int min, int max) {
        return (int)(Math.random() * (((max - min) + 1) + min));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la borne inférieure : ");
        int min = scanner.nextInt();

        System.out.println("Entrez la borne supérieure : ");
        int max = scanner.nextInt();

        int finalRandomNumber = randomNumber(min, max);
        System.out.println("Votre nombre aléatoire est : " + finalRandomNumber);
    }
}

package serie3_suite;

import java.util.Random;
import java.util.Scanner;

public class Exercice06v1 {
    public static void main(String[] args) {
        //Méthode maison, pas optimale du tout. Voir la v2 pour la méthode optimale et plus logique
        byte min = 30;
        byte max = 90;
        byte userInput;
        byte randomNumber;
        byte numberOfTry = 0;

        Random random = new Random();

        do {
            randomNumber = (byte)(random.nextInt((max - min) + 1) + min);
            System.out.println("L'ordinateur propose le nombre " + randomNumber + ".");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Si le nombre est correct, tapez 0");
            System.out.println("Si le nombre est trop petit, tapez 1");
            System.out.println("Si le nombre est trop grand, tapez 2");
            userInput = scanner.nextByte();
            scanner.nextLine();
            numberOfTry++;

            if (userInput == 1) {
                min = (byte)(randomNumber + 1);
            } else if (userInput == 2) {
                max = (byte)(randomNumber - 1);
            } else {
                System.out.println("L'ordinateur a trouvé votre nombre en " + numberOfTry + " essais !");
            }
        } while (userInput != 0);
    }
}

package serie3_suite;

import java.util.Scanner;

public class Exercice06v2 {
    public static void main(String[] args) {
        //Avec cette méthode le nombre d'essai maximum sera de 6.
        //Selon la formule nbEssai = arrondi supérieur de (log2(taille de la plage)
        //Taille de la plage --> max - min + 1 --> 90 - 30 = 60 + 1 = 61
        //Log2 de 61 = 5.93 --> avec arrondi supérieur = 6. CQFD
        byte min = 30;
        byte max = 90;
        byte userInput;
        byte guessNumber;
        byte numberOfTry = 0;

        do {
            guessNumber = (byte) ((min + max) / 2);
            System.out.println("L'ordinateur propose le nombre " + guessNumber + ".");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Si le nombre est correct, tapez 0");
            System.out.println("Si le nombre est trop petit, tapez 1");
            System.out.println("Si le nombre est trop grand, tapez 2");
            userInput = scanner.nextByte();
            scanner.nextLine();
            numberOfTry++;

            if (userInput == 1) {
                min = (byte)(guessNumber + 1);
            } else if (userInput == 2) {
                max = (byte)(guessNumber - 1);
            } else {
                System.out.println("L'ordinateur a trouvé votre nombre en " + numberOfTry + " essais !");
            }
        } while (userInput != 0);
    }
}

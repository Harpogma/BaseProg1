package anciensTests;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class testBlanc {

    public static int defineNumberOfPayer () {
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre de joueurs : ");
        int nbJoueurs = input.nextInt();
        input.nextLine();
        return nbJoueurs;
    }

    public static int askForValideAge (int age) {
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Veuillez saisir un âge supérieur ou égal à 4 : ");
            age = input.nextInt();
            input.nextLine();
            if (age < 4) {
                System.out.println("Veuillez saisir un âge supérieur ou égal à 4 : ");
                age = input.nextInt();
                input.nextLine();
            }
        } while (age < 4);
        return age;
    }

    public static int indexOfYoungestPlayer (int[] ages) {
        int youngestPlayerIndex = 100;

        for (int i = 0; i < ages.length - 1; i++) {
            if (ages[i] < ages[i + 1]) {
                youngestPlayerIndex = i;
            }
        }
        return youngestPlayerIndex;
    }


    public static void setPlayerInformation (int numberOfPlayers, String[] names, int[] ages) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numberOfPlayers; i++) {
            if (i == 0) {
                System.out.println("Veuillez saisir le prénom d'un joueur : ");
                names[i] = input.nextLine();
            } else {
                System.out.println("Veuillez saisir le prénom de la personne à droite de " + names[i - 1] + " :");
                names[i] = input.nextLine();

            }

            System.out.println("Veuillez saisir l'âge de " + names[i] + " : ");
            ages[i] = input.nextInt();
            if (ages[i] < 4) {
                ages[i] = askForValideAge(ages[i]);
            }
            input.nextLine();

        }
    }

    public static int[] playerMouvement (int startPosition) {

    }

    public static int generateRandomNumber (int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {
        int numberOfPlayers = defineNumberOfPayer();
        int[] ages = new int[numberOfPlayers];
        String[] names = new String[numberOfPlayers];
        int[] ladderPositions = new int[6];
        int[] snakePositions = new int[10];
        int[][] board = {
                {21, 22, 23, 24, 25},
                {20, 19, 18, 17, 16},
                {11, 12, 13, 14, 15},
                {10, 9, 8, 7, 6},
                {1, 2, 3, 4, 5}
        };

        setPlayerInformation(numberOfPlayers, names, ages);
        int youngestPlayer = indexOfYoungestPlayer(ages);
        System.out.println(youngestPlayer);

    }
}

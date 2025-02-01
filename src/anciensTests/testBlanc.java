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

    public static int indexYoungestPlayer (int[] ages) {
        int youngestPlayerIndex = 0;

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < ages[youngestPlayerIndex]) {
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

    public static int playOneTurn (String input) {
        int playerValue = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println(input);
        playerValue = userInput.nextInt();

        return playerValue;
    }

    public static void setScore (int[] scores, int currentScore, int playerIndex) {
        scores[playerIndex] += currentScore;
    }

    public static int generateRandomNumber (int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }

    public static boolean isAWinner (int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 25) {
                return true;
            }
        }
        return false;
    }

    public static int nextPlayerIndex (int[] ages, int currentPlayerIndex) {
        int nextPlayerIndex = 0;
        if (currentPlayerIndex == ages.length - 1) {
            nextPlayerIndex = 0;
        } else {
            nextPlayerIndex = currentPlayerIndex + 1;
        }
        return nextPlayerIndex;
    }

    public static void main(String[] args) {
        int numberOfPlayers = defineNumberOfPayer();
        int[] ages = new int[numberOfPlayers];
        int[] scores = new int[numberOfPlayers];
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
        int youngestPlayer = indexYoungestPlayer(ages);
        System.out.println("L'index de l'âge le plus jeune est : " + youngestPlayer);
        System.out.println("Le joueur le plus jeune est " + names[youngestPlayer]);
        int currentValue = 0;
        boolean isAWinner = false;
        int currentPlayerIndex = youngestPlayer;

        while (!isAWinner) {

            currentValue = playOneTurn(names[currentPlayerIndex] + ", lance le dé. Quelle est sa valeur : ");
            setScore(scores, currentValue, currentPlayerIndex);
            currentPlayerIndex = nextPlayerIndex(ages, currentPlayerIndex);
            System.out.println("Le prochain joueur à jouer est : " + names[currentPlayerIndex]);
            isAWinner = isAWinner(scores);
        }

    }
}

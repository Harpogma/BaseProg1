package serie4_suite;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice1 {

    /**
     * Function to get a byte input from the user
     * @return a byte entered by the user
     */
    private static byte getByteInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return Byte.parseByte(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid byte value. Try again: ");
            }
        }
    }

    /**
     * Function to get a string input from the user
     * @return a string entered by the user
     */
    private static String getStringInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /**
     * Function to print a welcome message
     */
    public static void welcomeMessage() {
        System.out.println("Bienvenue dans le jeu du minigolf");
        System.out.println("*********************************");
    }

    /**
     * Function to set the number of player
     * @return: the number of players
     */
    public static byte setPlayerNumber() {
        byte numberOfPlayers = 0;
        final byte minPlayerNumber = 1;
        final byte maxPlayerNumber = 5;

        System.out.println("Veuillez saisir le nombre de joueur entre 1 et 5 : ");
        numberOfPlayers = getByteInput();

        do {
            if (numberOfPlayers <= minPlayerNumber || numberOfPlayers > maxPlayerNumber) {
                System.out.println("Il faut saisir un nombre entier entre 1 et 5 !");
                numberOfPlayers = getByteInput();
            }
        } while (numberOfPlayers <= minPlayerNumber || numberOfPlayers > maxPlayerNumber);

        return numberOfPlayers;
    }

    /**
     * Function to set player names
     * @param playerNumber: number of the player in the game
     * @return: an array with all player names
     */
    public static String[] setPlayerName(byte playerNumber) {
        String[] playerName = new String[playerNumber];

        for (int i = 0; i < playerNumber; i++) {
            System.out.println("Veuillez saisir le nom du " + (i + 1) + (i == 0 ? "er" : "ème") + " joueur");
            playerName[i] = getStringInput();
        }
        return playerName;
    }

    /**
     * Function to choose between different actions
     * @return: the choice of the user
     */
    public static byte possibleGameAction() {
        System.out.println();
        System.out.println("Que voulez-vous faire ?");
        System.out.println("Tapez 1 pour saisir un nombre d'essai pour un trou");
        System.out.println("Tapez 2 pour connaitre le gagnant de la partie");
        System.out.println("Tapez 3 pour imprimer le tableau des scores");
        System.out.println("Tapez 0 pour quitter");
        return getByteInput();
    }

    /**
     * Function that select a player name
     * @param playerName: array with all player names
     * @return: the index of the selected player
     */
    public static byte getPlayerIndex(String[] playerName) {
        byte userSelectName;
        System.out.println("Quel joueur voulez-vous sélectionner ?");

        for (int i = 0; i < playerName.length; i++) {
            System.out.println("Tapez " + (i + 1) + " pour " + playerName[i]);
        }
        userSelectName = (byte)(getByteInput() - 1);
        if (userSelectName < 0 || userSelectName > playerName.length) {
            do {
                System.out.println("Il n'y a que " + (playerName.length) + " joueur. Veuillez faire un choix parmis les propositions ci-dessous. ");
                for (int i = 0; i < playerName.length; i++) {
                    System.out.println("Tapez " + (i + 1) + " pour " + playerName[i]);
                }
                userSelectName = (byte)(getByteInput() - 1);
            } while (userSelectName < 0 || userSelectName > playerName.length);
        }
        System.out.println(playerName[userSelectName] + " est sélectionné.");
        return userSelectName;
    }

    /**
     * Function that select the index of the array of holes to set points to
     * @param numberOfHole: the number of holes in a golf game is 18
     * @return: the index of the array of holes
     */
    public static byte getHoleIndex(byte numberOfHole) {
        byte userSelectHole;
        System.out.println("Pour quel trou voulez-vous entrer un score ? Sélectionnez un nombre entre 1 et 18.");
        userSelectHole = getByteInput();
        System.out.println("The index of the hole is : " + userSelectHole);

        if (userSelectHole < 1 || userSelectHole > numberOfHole) {
            do {
                System.out.println("Il n'y a que 18 trous possibles. Veuillez entrer un nombre entre 1 et 18.");
                userSelectHole = getByteInput();
            } while (userSelectHole < 1 || userSelectHole > numberOfHole);
        }
        return (byte)(userSelectHole - 1);
    }

    /**
     * Function to set point for a certain player for a certain hole
     * @param playerName: name of the player
     * @param pointsTab: array of all points for all players
     * @param numberOfHole: the number of holes in a golf game is 18
     */
    public static void setPoint(String[] playerName, byte[] pointsTab, byte numberOfHole) {
        byte playerIndexToSetPointTo = getPlayerIndex(playerName);
        byte holeToSetPointTo = getHoleIndex(numberOfHole);

        System.out.println("Veuillez saisir le score pour ce trou");

        byte holeScore = getByteInput();
        pointsTab[(playerIndexToSetPointTo * (numberOfHole - 1)) + holeToSetPointTo] = holeScore;

        if (holeScore < 0 || holeScore > 7) {
            do {
                System.out.println("Le score maximum est de 0 et le score minimum est de 8. Veuillez saisir un score valide.");
                holeScore = getByteInput();
                pointsTab[(playerIndexToSetPointTo * (numberOfHole - 1)) + holeToSetPointTo] = holeScore;
            } while (holeScore < 0 || holeScore > 7);
        }
        System.out.println("Le joueur " + playerName[playerIndexToSetPointTo] + " a fait un score de " + holeScore + " pour le trou n° " + holeToSetPointTo);
    }

    /**
     * Function to display all scores of all players
     * @param numberOfPlayer: number of the player in the game
     * @param playerName: name of the player
     * @param pointsTab: array of all points for all players
     * @param numberOfHole: the number of holes in a golf game is 18
     */
    public static void displayWinner(byte numberOfPlayer, String[] playerName, byte[] pointsTab, byte numberOfHole) {
        String winner = "";
        String loser = "";
        byte totalScore = 0;
        byte maxScore = 0;
        byte minScore = (7*18); //starts at 7 points per 18 holes and the score decrease
        String tempPlayerName;

        for (int i = 1; i <= numberOfPlayer; i++) {
            tempPlayerName = playerName[i - 1];
            for (int j = 0; j < numberOfHole; j++) {
                totalScore += pointsTab[(numberOfHole * (numberOfPlayer - 1)) + j];
            }

            if (totalScore > maxScore) {
                maxScore = totalScore;
                loser = playerName[i - 1];
            }

            if (totalScore < minScore) {
                minScore = totalScore;
                winner = playerName[i - 1];
            }
            System.out.println("Le score de " + tempPlayerName + " est : " + totalScore);
        }
        System.out.println();
        System.out.println("Le gagnant est " + winner + " avec un score de " + minScore);
        System.out.println("Le perdant est " + loser + " avec un score de " + maxScore);
    }

    /**
     * Function to print a table with all scores for all players
     * @param numberOfPlayer: number of the player in the game
     * @param playerName: name of the player
     * @param pointsTab: array of all points for all players
     * @param numberOfHole: the number of holes in a golf game is 18
     */
    public static void printScores(byte numberOfPlayer, String[] playerName, byte[] pointsTab, byte numberOfHole) {
        System.out.println("***** Tableau des scores *****");
        System.out.print("Trou | ");
        for (int i = 0; i < numberOfHole; i++) {
            System.out.printf("%-3d |", (i + 1));
        }
        System.out.println();
        System.out.print("=======");
        for (int i = 0; i < numberOfHole; i++) {
            System.out.print("=====");
        }

        for (int i = 0; i < numberOfPlayer; i++) {
            System.out.println();
            System.out.print(playerName[i] + " | ");
            byte indexRangeForCurrentPlayer = (byte)(Arrays.asList(playerName).indexOf(playerName[i])); //this is to find the index of playerName[i]
            for (int j = 0; j < numberOfHole; j++) {
                System.out.printf("%-3d |", pointsTab[((numberOfHole - 1) * indexRangeForCurrentPlayer) + j]);
            }
            System.out.println();
            System.out.print("=======");
            for (int j = 0; j < numberOfHole; j++) {
                System.out.print("=====");
            }
        }
    }

    public static void main(String[] args) {
        final byte numberOfHole = 18;

        welcomeMessage();

        byte numberOfPlayer = setPlayerNumber();
        byte[] pointsTab = new byte[numberOfPlayer * numberOfHole];

        System.out.println("Point tab size: " + pointsTab.length);
        final String[] playerName = setPlayerName(numberOfPlayer);

        System.out.println();
        System.out.print("Vous êtes " + numberOfPlayer + " joueurs et les noms sont ");
        for (int i = 0; i < playerName.length; i++) {
            System.out.print(playerName[i]);
            if (i == playerName.length - 1) {
                System.out.print(".");
            } else if (i == playerName.length - 2) {
                System.out.print(" et ");
            } else {
                System.out.print(", ");
            }
        }

        byte userChoice = possibleGameAction();

        while (userChoice != 0) {
            if (userChoice == 1) {
                setPoint(playerName, pointsTab, numberOfHole);
            } else if (userChoice == 2) {
                displayWinner(numberOfPlayer, playerName, pointsTab, numberOfHole);
            } else if (userChoice == 3) {
                printScores(numberOfPlayer, playerName, pointsTab, numberOfHole);
            }

            userChoice = possibleGameAction();
        }
        System.out.println("Merci d'avoir joué au minigolf!");
        System.exit(0);
    }
}

package serie4_suite;

import java.util.Scanner;

public class Exercice1 {

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre de joueur : ");
        return scanner.nextByte();
    }

    /**
     * Function to set player names
     * @param playerNumber: number of the player in the game
     * @return: an array with all player names
     */
    public static String[] setPlayerName(byte playerNumber) {
        Scanner scanner = new Scanner(System.in);
        String[] playerName = new String[playerNumber];

        for (int i = 0; i < playerNumber; i++) {
            System.out.println("Veuillez saisir le nom du " + (i + 1) + (i == 0 ? "er" : "ème") + " joueur");
            playerName[i] = scanner.nextLine();
        }
        return playerName;
    }

    /**
     * Function to choose between different actions
     * @return: the choice of the user
     */
    public static byte gameAction() {
        System.out.println();
        System.out.println("Que voulez-vous faire ?");
        System.out.println("Tapez 1 pour saisir un nombre d'essai pour un trou");
        System.out.println("Tapez 2 pour connaitre le gagnant de la partie");
        System.out.println("Tapez 0 pour quitter");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextByte();
    }

    /**
     * Function that select a player name
     * @param playerName: array with all player names
     * @return: the index of the selected player
     */
    public static byte selectPlayerName(String[] playerName) {
        byte userSelectName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel joueur voulez-vous sélectionner ?");

        for (int i = 0; i < playerName.length; i++) {
            System.out.println("Tapez " + (i + 1) + " pour " + playerName[i]);
        }
        userSelectName = (byte)(scanner.nextByte() - 1);
        if (userSelectName < 0 || userSelectName > playerName.length) {
            do {
                System.out.println("Il n'y a que " + (playerName.length) + " joueur. Veuillez faire un choix parmis les propositions ci-dessous. ");
                for (int i = 0; i < playerName.length; i++) {
                    System.out.println("Tapez " + (i + 1) + " pour " + playerName[i]);
                }
                userSelectName = (byte)(scanner.nextByte() - 1);
            } while (userSelectName < 0 || userSelectName > playerName.length);
        }

        System.out.println(playerName[userSelectName] + " est sélectionné.");
        return userSelectName;
    }

    /**
     * Function that select the index of the array of holes to set points to
     * @param pointsTab: array of all points for all players
     * @param numberOfHole: the number of holes in a golf game is 18
     * @return: the index of the array of holes
     */
    public static byte selectIndexHole(byte[] pointsTab, byte numberOfHole) {
        byte userSelectHole;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pour quel trou voulez-vous entrer un score ? Sélectionnez un nombre entre 1 et 18.");
        userSelectHole = scanner.nextByte();

        if (userSelectHole < 1 || userSelectHole > numberOfHole) {
            do {
                System.out.println("Il n'y a que 18 trous possibles. Veuillez entrer un nombre entre 1 et 18.");
                userSelectHole = scanner.nextByte();
            } while (userSelectHole < 1 || userSelectHole > numberOfHole);
        }
        return userSelectHole;
    }

    /**
     * Function to set point for a certain player for a certain hole
     * @param playerName: name of the player
     * @param pointsTab: array of all points for all players
     * @param numberOfHole: the number of holes in a golf game is 18
     */
    public static void setPoint(String[] playerName, byte[] pointsTab, byte numberOfHole) {
        byte playerIndexToSetPointTo = selectPlayerName(playerName);
        byte holeToSetPointTo = selectIndexHole(pointsTab, numberOfHole);

        System.out.println("Veuillez saisir le score pour ce trou");

        Scanner scanner = new Scanner(System.in);
        byte holeScore = scanner.nextByte();
        pointsTab[(playerIndexToSetPointTo * numberOfHole) + holeToSetPointTo] = holeScore;

        if (holeScore < 0 || holeScore > 7) {
            do {
                System.out.println("Le score maximum est de 0 et le score minimum est de 8. Veuillez saisir un score valide.");
                holeScore = scanner.nextByte();
                pointsTab[(playerIndexToSetPointTo * numberOfHole) + holeToSetPointTo] = holeScore;
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
    public static void displayScores(byte numberOfPlayer, String[] playerName, byte[] pointsTab, byte numberOfHole) {
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

    public static void main(String[] args) {
        final byte numberOfHole = 18;

        welcomeMessage();

        byte numberOfPlayer = setPlayerNumber();
        byte[] pointsTab = new byte[numberOfPlayer * 18];

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

        byte userChoice = gameAction();

        while (userChoice != 0) {
            if (userChoice == 1) {
                setPoint(playerName, pointsTab, numberOfHole);
            } else if (userChoice == 2) {
                displayScores(numberOfPlayer, playerName, pointsTab, numberOfHole);
            }

            userChoice = gameAction();
        }
        System.out.println("Merci d'avoir joué au minigolf!");
        System.exit(0);
    }
}

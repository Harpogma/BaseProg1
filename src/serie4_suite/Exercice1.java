package serie4_suite;

import java.util.Scanner;

public class Exercice1 {
    public static void welcomeMessage() {
        System.out.println("Bienvenue dans le jeu du minigolf");
    }

    public static byte setPlayerNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre de joueur : ");
        return scanner.nextByte();
    }

    public static String[] setPlayerName(byte playerNumber) {
        Scanner scanner = new Scanner(System.in);
        String[] playerName = new String[playerNumber];

        for (int i = 0; i < playerNumber; i++) {
            System.out.println("Veuillez saisir le nom du " + (i + 1) + (i == 0 ? "er" : "ème") + " joueur");
            playerName[i] = scanner.nextLine();
        }
        return playerName;
    }

    public static byte gameAction() {
        System.out.println("Que voulez-vous faire ?");
        System.out.println("Tapez 1 pour saisir un nombre d'essais pour un trou");
        System.out.println("Tapez 2 pour connaitre le gagnant de la partie");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextByte();
    }



    public static void main(String[] args) {
        welcomeMessage();

        final byte pointTabDivider = 18;

        byte playerNumber = setPlayerNumber();

        byte[] pointsTab = new byte[playerNumber * 18];
        System.out.println("Point tab size: " + pointsTab.length);
        final String[] playerName = setPlayerName(playerNumber);

        System.out.print("Vous êtes " + playerNumber + " joueurs et les noms sont ");
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


    }
}

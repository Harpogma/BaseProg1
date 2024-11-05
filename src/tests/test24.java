package tests;

import java.util.Scanner;

public class test24 {
    public static void main(String[] args) {
        System.out.println("Bienvenue dans le jeu de fléchettes!");
        System.out.println("Votre score au départ est de 301, le but est d'arriver à 0 sans passer en dessous");
        short totalScore = 301;
        byte userShot;
        byte userMultiplier;
        byte scorePerRound = 0;

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Quelle case avez-vous touchée ?");
            userShot = scanner.nextByte();

            // gestion des shots inférieurs à 0 et supérieurs à 20
            if ((userShot < 0 || userShot > 20) && userShot != 25 && userShot != 50) {
                do {
                    System.out.println("Vous devez entrer un nombre entre 0 et 20 ou 25 ou 50");
                    userShot = scanner.nextByte();
                } while ((userShot < 0 || userShot > 20) && userShot != 25 && userShot != 50);
            }

            // gestion des multiplicateurs de score et des erreurs
            if (userShot > 0 && userShot <= 20) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Avez-vous touché le x1, x2 ou le x3 ?");
                userMultiplier = scanner1.nextByte();
                if (userMultiplier != 1 &&userMultiplier != 2 && userMultiplier != 3) {
                    do {
                        System.out.println("Erreur, vous ne pouvez avoir un multiplicateur que de x1, x2 ou x3");
                        userMultiplier = scanner1.nextByte();
                    } while (userMultiplier != 1 &&userMultiplier != 2 && userMultiplier != 3);
                }

                scorePerRound = (byte)(userShot * userMultiplier);
                System.out.println("Votre score de tour est de " + scorePerRound);
            } else if (userShot == 25 || userShot == 50) {
                scorePerRound = userShot;
                System.out.println("Votre score de tour est de " + scorePerRound);
            }

            // vérification que l'on ne passe pas en dessous de 0
            if ((totalScore - scorePerRound) >= 0) {
                totalScore -= scorePerRound;
                System.out.println("Votre score est de " + totalScore);
            } else {
                System.out.println("Vous avez fait un score plus haut que le nombre de point restants");
                System.out.println("Votre score est de " + totalScore);
            }
        } while (totalScore > 0);
        System.out.println("Félicitations !");
    }
}

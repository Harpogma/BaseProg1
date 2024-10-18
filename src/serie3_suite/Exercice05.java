package serie3_suite;

import java.util.Scanner;

public class Exercice05 {
    public static void main(String[] args) {
        int randomNumber = (int) ((Math.random() + 1)* 1000);
        System.out.println(randomNumber);
        System.out.println("Vous devez trouver l'altitude du Dahu. Son altitude est entre 1000 et 2000 mètres.");

        short guessUser;
        byte nombreEssai = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quelle est l'altitude du Dahu ?");
            guessUser = scanner.nextShort();
            scanner.nextLine();
            nombreEssai++;
            while (guessUser < 1000 || guessUser > 2000) {
                System.out.println("L'altitude se trouve entre 1000 et 2000, ne cherchez pas à aller au delà de ces limites :)");
                System.out.println("Quelle est l'altitude du Dahu ?");
                guessUser = scanner.nextShort();
                scanner.nextLine();
                nombreEssai++;
            }
            if (guessUser < randomNumber) {
                System.out.println("Vous devez chercher plus haut !");
            } else if (guessUser > randomNumber) {
                System.out.println("Vous devez chercher plus bas !");
            } else {
                System.out.println("Bravo, vous l'avez trouvé en " + nombreEssai + " essais ! Faites attention à ce qu'il ne se retourne pas...");
            }
        } while (guessUser != randomNumber);

    }
}

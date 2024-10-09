package serie3;

import java.util.Scanner;

public class Exercice06 {
    public static void main(String[] args) {
        byte compteur = 0;

        for (int i = 1; i <= 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entrer le " + i + "e nombre");
            int number = scanner.nextInt();

            if (number <= 15) {
                compteur++;
            }
            scanner.nextLine();
        }
        System.out.println("Il y a " + compteur + " nombre" + (compteur > 1 ? "s" : "") + " <= 15");
    }
}

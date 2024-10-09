package serie3;

import java.util.Scanner;

public class Exercice02 {
    public static void main(String[] args) {
        int number;
        do {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Veuillez saisir un nombre strictement positif");
            number = userInput.nextInt();
        } while (number <= 0);

        for(int i = number; i >=0; i--) {
            System.out.println(i);
        }
    }
}

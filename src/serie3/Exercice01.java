package serie3;

import java.util.Scanner;

public class Exercice01 {
    public static void main(String[] args) {
        int userInput = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Veuillez saisir un nombre dans l'intervale [1;3]");
            userInput = scanner.nextInt();
        } while (userInput < 1 || userInput > 3);
        System.out.println(userInput);
    }
}

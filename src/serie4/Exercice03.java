package serie4;

import java.util.Scanner;

public class Exercice03 {
    public static void main(String[] args) {
        String[] fileAttente = {"Aline","Roger","Julia","Steven","Jules"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un prénom : ");
        String userInput = scanner.nextLine();

        boolean isInQueue = false;
        byte positionInQueue = 0;
        for (int i = 0; i <= fileAttente.length - 1; i++) {
            if (userInput.equals(fileAttente[i])) {
                isInQueue = true;
                positionInQueue = (byte)i;

            }
        }
        if (isInQueue) {
            System.out.println(userInput + " se trouve en " + (positionInQueue + 1) + "e position dans la file");
        } else {
            System.out.println(userInput + " ne se trouve pas dans la file");

        }
    }
}

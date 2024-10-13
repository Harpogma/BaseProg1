package serie3;

import java.util.Scanner;

public class Exercice11 {
    public static void main(String[] args) {
        System.out.println("Ce programme calcule la suite de Fibonacci jusqu'au chiffre entré par l'utilisateur.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'ordre du nombre de Fibonacci à calculer ? (>=0)");
        short ordre = scanner.nextShort();
        scanner.nextLine();

        short firstNumber = 0, secondNumber = 1, currentNumber;

        if (ordre == 0) {
            currentNumber = 0;
            System.out.println("F(0) = " + currentNumber);
        } else {
            for (int i = 0; i < ordre; i++) {
                if (i == 0) {
                    currentNumber = 0;
                } else {
                    currentNumber = (short)(firstNumber + secondNumber);
                }
                System.out.println("F(" + i + ") = " + currentNumber);

                firstNumber = secondNumber;
                secondNumber = currentNumber;
            }
        }
    }
}

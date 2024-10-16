package serie3_suite;

import java.util.Scanner;

public class Exercice02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un livret : ");
        byte number = scanner.nextByte();

        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " x " + number + " = " + (i * number));
        }
    }
}

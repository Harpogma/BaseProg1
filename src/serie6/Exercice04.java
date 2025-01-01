package serie6;

import java.util.Scanner;

public class Exercice04 {

    public static void insertValues(int number) {

    }
    public static void main(String[] args) {

        final int size = 20;

        for (int i = 0; i < size; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insertion de : ");
            int number = scanner.nextInt();

            insertValues(number);
        }

    }
}

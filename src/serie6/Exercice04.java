package serie6;

import java.util.Scanner;

public class Exercice04 {

    private static void leftShift(int[] tab, int index) {
       for (int i = index; i > 0; i--) {
           tab[i] = tab[i - 1];
       }
    }

    public static void insertValues(int[] tab, int number, int index) {

        boolean numberPlaced = false;

        for (int i = index - 1; i < index; i++) {
            while (!numberPlaced) {
                if (number < tab[i]) {
                    leftShift(tab, index);
                    tab[i] = number;
                    numberPlaced = true;
                } else if (number > tab[i] && tab[i + 1] == 0) {
                    tab[i + 1] = number;
                    numberPlaced = true;
                } else if (number == tab[i]) {
                    leftShift(tab, index);
                    tab[i] = number;
                    numberPlaced = true;
                }
            }
        }

    }

    public static void printArray(int[] tab, int size) {
        for (int number : tab) {
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {

        final int size = 4;
        int[] values = new int[size];

        for (int i = 0; i < size; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insertion de : ");
            int number = scanner.nextInt();

            if (i == 0) {
                values[0] = number;
            } else {
                insertValues(values, number, i);
            }
        }

        printArray(values, size);

    }
}

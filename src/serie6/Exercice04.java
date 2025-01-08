package serie6;

import java.util.Scanner;

public class Exercice04 {

    private static void leftShift(int[] tab,int index, int lastNumberIndex) {


        for (int i = lastNumberIndex; i > index; i--) {
            if (i > index) {
                int temp = tab[i + 1];
                tab[i + 1] = tab[i];
                tab[i] = temp;
            } else {
                tab[i + 1] = tab[i];
            }
       }
    }

    private static int lastNumberIndex(int[] tab, int index) {
        int lastNumberIndex = 0;
        for (int i = 1; i <= index; i++) {
            if (tab[i] == 0) {
                lastNumberIndex = i - 1;
            } else {
                System.out.println("The end of the array is reached!");
            }
        }

        return lastNumberIndex;
    }

    public static void insertValues(int[] tab, int number, int index) {

        boolean numberPlaced = false;

        for (int i = index - 1; i < index; i++) {
            while (!numberPlaced) {
                int lastNumberIndex = lastNumberIndex(tab, index);
                if (number < tab[i]) {
                    System.out.println(lastNumberIndex);
                    leftShift(tab, index, lastNumberIndex);
                    tab[i] = number;
                    numberPlaced = true;
                } else if (number > tab[i] && tab[i + 1] == 0) {
                    tab[i + 1] = number;
                    numberPlaced = true;
                } else if (number == tab[i]) {
                    leftShift(tab, index, lastNumberIndex);
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

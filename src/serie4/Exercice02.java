package serie4;

public class Exercice02 {
    public static void main(String[] args) {
        int[] arrayToReverse = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrayReversed = new int[arrayToReverse.length];

        int j = arrayToReverse.length - 1;

        for (int i = 0; i < arrayToReverse.length; i++) {
            arrayReversed[j] = arrayToReverse[i];
            j--;
        }

        for (int i = 0; i < arrayToReverse.length; i++) {
            System.out.print(
                    (i == 0 ? "Avant : [" : "") + arrayToReverse[i] + (i == arrayToReverse.length - 1 ? "]" : ","));
        }

        System.out.println();

        for (int i = 0; i < arrayReversed.length; i++) {
            System.out.print((i == 0 ? "Après : [" : "") + arrayReversed[i] + (i == arrayReversed.length - 1 ? "]" : ","));
        }
    }
}

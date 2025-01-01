package serie6;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

// Cette classe met en œuvre différents algorithmes de tri
public class ProgrammeTris {

    // Juste pour régler l'affichage des accents sur certaines machines ;-)
    static {
        try {
            System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true, "UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            System.out.println("VM dont support UTF-8");
        }
    }

    public static int[] generateTabWithRandomNumber() {
        final int min = 1;
        final int max = 100000;
        final int tabSize = 50000;
        final int[] finalTab = new int[tabSize];

        int random;

        for (int i = 0; i < tabSize; i++) {
            random = (int) ((Math.random() * ((max - min) + 1)) + min);
            finalTab[i] = random;
        }

        return finalTab;
    }

    public static void executeSort(String algo) {
        Instant startTime = Instant.now();
        Instant endTime = Instant.now();
        Duration timeElapsed;

        for (int i = 0; i < 10; i++) {
            int[] finalTab = generateTabWithRandomNumber();
            startTime = Instant.now();
            System.out.println(finalTab.length);
            switch (algo) {
                case "DualPivotQuicksort": DualPivotQuickSort.sort(finalTab);
                break;
                case "MergeSort": MergeSort.sort(finalTab);
                break;
                case "HeapSort": HeapSort.sort(finalTab);
                break;
                case "InsertionSort": InsertionSort.sort(finalTab);
                break;
                case "SelectionSort": SelectionSort.sort(finalTab);
                break;
                case "BubbleSort": BubbleSort.sort(finalTab);
                break;
            }
            endTime = Instant.now();
            timeElapsed = Duration.between(startTime, endTime);
            System.out.println("Le temps d'exécution est de " + timeElapsed.toMillis() + " millisecondes");
        }
    }

    public static void main(String[] args) {

        System.out.println("Dual Pivot Quicksort - Tri rapide");
        executeSort("DualPivotQuicksort");
        System.out.println();

        System.out.println("Merge Sort - Tri par fusion");
        executeSort("MergeSort");
        System.out.println();

        System.out.println("Heap Sort - Tri par tas");
        executeSort("HeapSort");
        System.out.println();

        System.out.println("Insertion Sort - Tri par insertion");
        executeSort("InsertionSort");
        System.out.println();

        System.out.println("Selection Sort - Tri par séléction");
        executeSort("SelectionSort");
        System.out.println();

        System.out.println("Bubble Sort - Tri à bulles");
        executeSort("BubbleSort");
        System.out.println();
    }
}
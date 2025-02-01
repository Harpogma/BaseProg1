package serie6;

import java.util.Arrays;
import java.util.Scanner;


public class Exercice06 {
    public static void ageSort(int[] ages) {
        Arrays.sort(ages);
    }

    public static void nameSort(String[] names) {

    }

    public static void ageSwap() {

    }

    public static void nameSwap() {

    }

    public static void main(String[] args) {
        String[] names = {"Paul", "Simone", "Louis", "Anaïs"};
        int[] ages = {23, 45, 24, 16};


        Scanner sc = new Scanner(System.in);
        System.out.println("Tapez 1 pour trier par noms et 2 pour trier par âge :");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            nameSort(names);
        } else if (choice == 2) {
            ageSort(ages);
        }

    }
}

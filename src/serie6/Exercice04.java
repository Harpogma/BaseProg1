package serie6;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice04 {

    public static int indexOfAge (int[] ages, int ageToFind) {
        return Arrays.binarySearch(ages, ageToFind);
    }

    public static void swap(int[] ages, int binarySearchResult, int lastIndex) {
        for (int i = lastIndex; i >= binarySearchResult; i--) {
            ages[i + 1] = ages[i];
        }
    }

    public static void main(String[] args) {
        String[] names = {"Paul", "Simone", "Louis", "Anaïs"};
        int[] ages = new int[10];

        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Entrez un âge : ");
            ages[i] = sc.nextInt();
            sc.nextLine();
        }


        for(int age: ages) {
            System.out.println(age);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Quel âge veux-tu chercher ?");
        int age = sc.nextInt();

        int indexOfAge = indexOfAge(ages, age);
        System.out.println(indexOfAge);
        int indexNumberToInsert = Math.abs(indexOfAge) - 1;

        int lastIndex = 4;

        if(indexOfAge < 0) {
            swap(ages, indexNumberToInsert, lastIndex);
            ages[indexNumberToInsert] = age;
        } else {
            System.out.println("L'âge que tu cherches est à l'index : " + indexOfAge);
        }

        for(int j: ages) {
            System.out.println(j);
        }
    }
}

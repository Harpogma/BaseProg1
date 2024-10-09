package serie3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exercice05 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Entrer le 1er nombre entier");
        int a = scanner1.nextInt();
        scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Entrer le 1er nombre entier");
        int b = scanner2.nextInt();
        scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Entrer le 1er nombre entier");
        int c = scanner3.nextInt();
        scanner3.nextLine();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Entrer le 1er nombre entier");
        int d = scanner4.nextInt();
        scanner4.nextLine();

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Entrer le 1er nombre entier");
        int e = scanner5.nextInt();
        scanner5.nextLine();

        // version à l'arrache
        int petitNombre1 = 0, grandNombre1 = 0;

        petitNombre1 = Math.min(a, b);
        petitNombre1 = Math.min(petitNombre1, c);
        petitNombre1 = Math.min(petitNombre1, d);
        petitNombre1 = Math.min(petitNombre1, e);

        grandNombre1 = Math.max(b, c);
        grandNombre1 = Math.max(grandNombre1, c);
        grandNombre1 = Math.max(grandNombre1, c);
        grandNombre1 = Math.max(grandNombre1, e);

        System.out.println("#### Version à l'arrache ####");
        System.out.println("Le plus petit nombre saisi est : " + petitNombre1);
        System.out.println("Le plus grand nombre saisi est : " + grandNombre1);

        // version avec Array et sort
        int[] nombre = {a, b, c, d, e};
        Arrays.sort(nombre);
        int petitNombre2 = 0, grandNombre2 = 0;
        petitNombre2 = nombre[0];
        grandNombre2 = nombre[nombre.length - 1];

        System.out.println("#### Version avec Array et méthode sort ####");
        System.out.println("Le plus petit nombre saisi est : " + petitNombre2);
        System.out.println("Le plus grand nombre saisi est : " + grandNombre2);

        // version avec bubble sort
        System.out.println("#### Version avec Array et bubble sort ####");
        int[] nombre2 = {a, b, c, d, e};
        int temp;

        for (int i = 0; i < nombre2.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < nombre2.length - i - 1; j++) {
                if (nombre2[j] > nombre2[j + 1]) {
                    temp = nombre2[j];
                    nombre2[j] = nombre2[j + 1];
                    nombre2[j + 1] = temp;
                    swapped = true;
                }
            }
        }
        int petitNombre3 = nombre2[0];
        int grandNombre3 = nombre2[nombre2.length - 1];
        System.out.println("Le plus petit nombre saisi est : " + petitNombre3);
        System.out.println("Le plus grand nombre saisi est : " + grandNombre3);
    }
}

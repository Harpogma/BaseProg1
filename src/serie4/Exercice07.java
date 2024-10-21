package serie4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercice07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir une phrase puis appuyez la touche entrer");
        String input = scanner.nextLine();

        String[] arrayOfStrings = input.split(" ");
        for (int i = 0; i < arrayOfStrings.length; i++) {
            System.out.print((i == 0 ? "[" : "") + "\"" + arrayOfStrings[i] + "\"" + (i == arrayOfStrings.length - 1 ? "]" : ","));
        }
    }
}

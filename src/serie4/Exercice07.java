package serie4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercice07 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir une phrase puis appuyez la touche entrer");

        byte compteur = 0;
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            myList.add(input);
        }
        scanner.close();

        for (int i = 0; i < myList.size(); i++) {
            System.out.print((i == 0 ? "[" : "") + "\"" + myList.get(i) + "\"" + (i == myList.size() - 1 ? "]" : ","));
        }

    }
}

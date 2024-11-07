package serie2;

import java.util.Scanner;

public class Exercice12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir la somme à décomposer : ");
        int somme = scanner.nextInt();

        byte piece5 = 5;
        byte piece2 = 2;
        byte piece1 = 1;

        byte nombrePiece5 = 0;
        byte nombrePiece2 = 0;
        byte nombrePiece1 = 0;

        while (somme > 0) {
            if (somme - 5 >= 0) {
                somme -= piece5;
                nombrePiece5 += 1;
            } else if ((somme - 2 >= 0)) {
                somme -= piece2;
                nombrePiece2 += 1;
            } else {
                somme -= piece1;
                nombrePiece1 += 1;
            }
        }

        System.out.println(nombrePiece5 + " pièces de 5.-");
        System.out.println(nombrePiece2 + " pièces de 2.-");
        System.out.println(nombrePiece1 + " pièces de 1.-");

    }
}

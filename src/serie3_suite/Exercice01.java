package serie3_suite;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Exercice01 {
    public static void main(String[] args) {
        System.out.println("Affiche les nombres entiers pairs compris entre 0 et 10");
        for (int i = 0; i <= 10; i+=2) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("Afficher les nombres entiers pairs et multiples de 7 compris entre 0 et 100");
        for (int i = 0; i <= 100; i+=2) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();

        System.out.println("Afficher les nombres entiers pairs et multiples de 3 et de 7 compris entre 0 et 100");
        for (int i = 0; i <= 100; i+=2) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();

        System.out.println("Afficher les nombres entiers pairs et multiples de 3, mais non multiples de 7 compris entre 0 et 100");
        for (int i = 0; i <= 100; i+=2) {
            if (i % 3 == 0 && i % 7 == 1) {
                System.out.println(i);
            }
        }
    }
}

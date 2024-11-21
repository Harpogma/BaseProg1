package serie5_Robin;

import java.util.Scanner;

public class Exercice09 {

    public static double round(double value, int precision) {
        double decimalPrecision = Math.pow(10, precision);
        return Math.round(value * decimalPrecision) / decimalPrecision;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre réel : ");
        double number = scanner.nextDouble();

        System.out.println("À combien de chiffre après la virgule voulez-vous l'arrondir ?");
        byte precision = scanner.nextByte();

        System.out.println("Votre nombre est " + number + ". Arrondi à " + precision + " chiffres à après la virgule, il devient " + round(number, precision) + ".");
    }
}

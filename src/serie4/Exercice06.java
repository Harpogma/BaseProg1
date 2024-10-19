package serie4;

import java.util.Random;

public class Exercice06 {
    public static void main(String[] args) {
        Random rand = new Random();
        byte[] myArray = new byte[100];

        for (int i = 0; i < 100; i++) {
            myArray[i] = (byte)rand.nextInt(10);
        }

        byte[] nombreOccurences = new byte[10];

        for (int i = 0; i < myArray.length; i++) {
            nombreOccurences[myArray[i]]++;
        }

        for (int i = 0; i < nombreOccurences.length; i++) {
            System.out.println(i + " => " + nombreOccurences[i]);
        }
    }
}

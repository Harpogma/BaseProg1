package serie3_suite;

import java.util.Random;

public class Exercice04 {
    public static void main(String[] args) {
        short pile = 0;
        short face = 0;
        int lancePrecedent = 2;
        short nombreDeSuite = 1;
        short nombreDeSuiteFaceMax = 0;
        short nombreDeSuitePileMax = 0;
        Random random = new Random();

        for (int i = 1; i <= 1000 ; i++) {
            int rand = random.nextInt(2);
            System.out.println(rand);
            if (rand == 0) {
                pile++;
                if (lancePrecedent == 0) {
                    nombreDeSuite++;
                } else {
                    if (nombreDeSuite > nombreDeSuiteFaceMax) {
                        nombreDeSuiteFaceMax = nombreDeSuite;
                        nombreDeSuite = 1;
                    }

                }
                lancePrecedent = rand;
            } else {
                face++;
                if (lancePrecedent == 1) {
                    nombreDeSuite++;
                } else {
                    if (nombreDeSuite > nombreDeSuitePileMax) {
                        nombreDeSuitePileMax = nombreDeSuite;
                        nombreDeSuite = 1;
                    }
                }
                lancePrecedent = rand;
            }
        }
        System.out.println("Pile : " + pile + " - " + nombreDeSuitePileMax + " fois de suite au maximum");
        System.out.println("Face : " + face + " - " + nombreDeSuiteFaceMax + " fois de suite au maximum");
    }
}

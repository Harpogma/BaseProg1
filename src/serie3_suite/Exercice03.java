package serie3_suite;

import java.util.Random;

public class Exercice03 {
    public static void main(String[] args) {
        short pile = 0;
        short face = 0;
        Random random = new Random();

        for (int i = 1; i <= 1000 ; i++) {
            int rand = random.nextInt(2);
            System.out.println(rand);
            if (rand == 0) {
                pile++;
            } else {
                face++;
            }
        }
        System.out.println("Pile : " + pile);
        System.out.println("Face : " + face);
    }
}

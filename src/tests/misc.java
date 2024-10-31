package tests;

import java.lang.reflect.Array;

public class misc {
    public static void main(String[] args) {
        //génère un nombre aléatoire entre min et max
        int min = 20;
        int max = 50;
        int randomNumber = (int) ((Math.random() * ((max - min) + 1)) + min);
        System.out.println(randomNumber);

        int nombreAlea = (int) (Math.random() * ((6 - 1) + 1) + 1);
        System.out.println(nombreAlea);

        double temperatureAlea = Math.round(Math.random() * ((41.5 - (-41.8)) + 1) - 41.8);
        System.out.println(temperatureAlea);

        char caractereAlea = (char)(Math.random() * (('z' - 'a') + 1) + 'a');
        System.out.println(caractereAlea);

        //arrondi d'un nombre
        double reel = 14.68865763;
        double precision = 0.05;
        double arrondi = Math.round(reel / precision) * precision;
        System.out.println("Valeur Arrondi : " + String.format("%.2f", arrondi));

    }
}

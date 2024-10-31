package tests;

public class random {
    public static void main(String[] args) {
        //génère un nombre aléatoire entre min et max
        int min = 20;
        int max = 50;
        int randomNumber = (int) ((Math.random() * ((max - min) + 1)) + min);
        System.out.println(randomNumber);

        
    }
}

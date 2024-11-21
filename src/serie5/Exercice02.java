package serie5_Robin;

public class Exercice02 {

    public static double additionne(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        double premierNombre = 4.5;
        double deuxiemeNombre = 5.2;
        double troisiemeNombre = 6.4;

        double resultat = additionne(premierNombre, deuxiemeNombre, troisiemeNombre);

        System.out.println(premierNombre + " + " + deuxiemeNombre + " + " + troisiemeNombre + " = " + resultat);
    }
}

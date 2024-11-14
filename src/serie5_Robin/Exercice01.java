package serie5_Robin;

public class Exercice01 {

    public static void additionne(double a, double b, double c) {
        double resultat = a + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + resultat);
    }
    public static void main(String[] args) {
        double premierNombre = 4.5;
        double deuxiemeNombre = 5.2;
        double troisiemeNombre = 6.4;

        additionne(premierNombre, deuxiemeNombre, troisiemeNombre);
    }
}

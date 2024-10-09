package serie3;

import java.util.Scanner;

public class Exercice04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le capital (>0) de départ");
        double capital = scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Entrez le taux d'intérêt en %");
        double interet = scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Entrez le nombre de périodes (>0)");
        double nombrePeriode = scanner2.nextDouble();

        double calculInteret = (capital * interet / 100);
        capital += calculInteret;

        System.out.println("après 1 période(s) : " + capital);

        for (int i = 2; i <= nombrePeriode; i++) {
            capital += (capital * interet / 100);
            System.out.println("après " + i + " période(s) : " + capital);
        }
    }
}

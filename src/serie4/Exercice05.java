package serie4;

import java.util.Scanner;

public class Exercice05 {
    public static void main(String[] args) {
        float[] temperatures = new float[12];

        System.out.println("Veuillez entrer 12 temperatures : ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print((i + 1) + (i == 0 ? "ère": "ème") + " temperature : ");
            temperatures[i] = scanner.nextFloat();
            scanner.nextLine();
        }
        System.out.println();

        float minTemperature = temperatures[0];
        float maxTemperature = temperatures[0];
        float totalTemperature = 0f;

        for (int i = 0; i < temperatures.length; i++) {
            totalTemperature += temperatures[i];
            if (minTemperature > temperatures[i]) {
                minTemperature = temperatures[i];
            } else if (maxTemperature < temperatures[i]) {
                maxTemperature = temperatures[i];
            }
        }

        float etendueTemperature = maxTemperature - minTemperature;
        float moyenneTemperature = totalTemperature / temperatures.length;
        float totalDeviation = 0f;

        for (int i = 0; i < temperatures.length; i++) {
            totalDeviation += Math.abs(temperatures[i] - moyenneTemperature);
        }

        float moyenneDeviation = totalDeviation / temperatures.length;

        System.out.println("Max : " + maxTemperature);
        System.out.println("Min : " + minTemperature);
        System.out.println("Etendue : " + etendueTemperature);
        System.out.println("Moyenne des températures : " + String.format("%.2f", moyenneTemperature));
        System.out.println("Déviation moyenne : " + String.format("%.2f", moyenneDeviation));
    }
}

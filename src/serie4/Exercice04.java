package serie4;

public class Exercice04 {
    public static void main(String[] args) {
        String[] arrayToBeShift = {"Aline","Roger","Julia","Steven","Jules"};

        for (int i = 0; i < arrayToBeShift.length; i++) {
            System.out.print((i == 0 ? "Avant : [\"" : "\"") + arrayToBeShift[i] + "\"" + (i == arrayToBeShift.length - 1 ? "]" : ","));
        }

        String temp  = arrayToBeShift[0];
        for (int i = 0; i < arrayToBeShift.length; i++) {
            if (i == arrayToBeShift.length - 1) {
                arrayToBeShift[arrayToBeShift.length - 1] = temp;
            } else {
                arrayToBeShift[i] = arrayToBeShift[i + 1];
            }
        }

        System.out.println();
        for (int i = 0; i < arrayToBeShift.length; i++) {
            System.out.print((i == 0 ? "Après : [\"" : "\"") + arrayToBeShift[i] + "\"" + (i == arrayToBeShift.length - 1 ? "]" : ","));
        }
    }
}

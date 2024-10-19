package serie4;

public class Exercice04 {
    public static void main(String[] args) {
        String[] arrayToBeShift = {"Aline","Roger","Julia","Steven","Jules"};
        String[] shiftedArray = new String[arrayToBeShift.length];
        byte shifter = 0;

        for (int i = 0; i < arrayToBeShift.length; i++) {
            if (i == arrayToBeShift.length - 1) {
                shiftedArray[shifter] = arrayToBeShift[0];
            } else {
                shiftedArray[shifter] = arrayToBeShift[i + 1];
                shifter++;
            }
        }

        for (int i = 0; i < arrayToBeShift.length; i++) {
            System.out.print((i == 0 ? "Avant : [\"" : "\"") + arrayToBeShift[i] + "\"" + (i == arrayToBeShift.length - 1 ? "]" : ","));
        }

        System.out.println();

        for (int i = 0; i < shiftedArray.length; i++) {
            System.out.print((i == 0 ? "Après : [\"" : "\"") + shiftedArray[i] + "\"" + (i == arrayToBeShift.length - 1 ? "]" : ","));
        }
    }
}

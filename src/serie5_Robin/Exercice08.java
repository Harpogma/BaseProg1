package serie5;

public class Exercice08 {

    public static boolean checkIfNumberExists(double number, double[] tab) {
        double epsilon = 0.000001;
        boolean found = false;
        for (int i = 0; i < tab.length; i++) {
            if ((Math.abs(number - tab[i]) < epsilon)) {
                found = true;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        double number = 4.78;
        double[] tabNumber = {5.3, 7.37, 4.78, 8.15, 1.72, 3.92};
        boolean result = checkIfNumberExists(number, tabNumber);
        System.out.println(result);
    }
}

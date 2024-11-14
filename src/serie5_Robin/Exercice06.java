package serie5_Robin;

public class Exercice06 {

    public static String implode (char c, double[] tab) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < tab.length; i++) {

            if (i == tab.length - 1) {
                result.append(tab[i]).append(' ');
            } else {
                result.append(tab[i]).append(c).append(' ');
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        char separateur = ',';
        double[] tabReel = {5.5, 7.6, 3.1, 9.2, 56.4};

        String finalString = implode(separateur, tabReel);
        System.out.println(finalString);
    }
}

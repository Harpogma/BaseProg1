package serie3;

public class Exercice12 {
    public static void main(String[] args) {
        char caseBlanche = 'o';
        char caseNoire = '#';
        boolean parite = true;

        for (int i = 0; i < 8; i++) {
            if (parite) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(caseBlanche + " " + caseNoire + " ");
                }
                parite = false;
            } else {
                for (int j = 0; j < 4; j++) {
                    System.out.print(caseNoire + " " + caseBlanche + " ");
                }
                parite = true;
            }
            System.out.println();
        }
    }
}
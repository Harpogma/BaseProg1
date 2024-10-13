package tests;

public class geometrie {
    public static void main(String[] args) {
        //triangle pointe en haut
        char etoile = '*';
        char espace = ' ';
        byte nombreEspace = 8;
        byte nombreEtoile = 1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < nombreEspace; j++) {
                System.out.print(espace);
            }
            for (int j = 0; j < nombreEtoile; j++) {
                System.out.print(etoile);
            }
            System.out.println();
            nombreEspace--;
            nombreEtoile += 2;
        }
        System.out.println();
        System.out.println();

        //triangle pointe en bas
        char diese = '#';
        char espace1 = ' ';
        byte nombreEspace1 = 1;
        byte nombreDiese = 15;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < nombreEspace1; j++) {
                System.out.print(espace1);
            }
            for (int j = nombreDiese; j > 0; j--) {
                System.out.print(diese);
            }
            System.out.println();
            nombreEspace1++;
            nombreDiese -= 2;
        }
        System.out.println();
        System.out.println();

        //losange
        char plus = '+';
        char espace2 = ' ';
        byte nombreEspace2 = 8;
        byte nombrePlus = 1;
        //partie du haut
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < nombreEspace2; j++) {
                System.out.print(espace2);
            }
            for (int j = 0; j < nombrePlus; j++) {
                System.out.print(plus);
            }
            System.out.println();
            nombreEspace2--;
            nombrePlus += 2;
        }
        //partie du bas
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j < nombreEspace2; j++) {
                System.out.print(espace2);
            }
            for (int j = nombrePlus; j > 0; j--) {
                System.out.print(plus);
            }
            System.out.println();
            nombreEspace2++;
            nombrePlus -= 2;
        }
    }
}

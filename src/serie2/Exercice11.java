package serie2;

import java.util.Scanner;

public class Exercice11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le jour :");
        byte jour = scanner.nextByte();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Veuillez saisir le mois :");
        byte mois = scanner1.nextByte();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Veuillez saisir l'année :");
        short annee = scanner2.nextShort();

        boolean anneeBissectile = false;
        if ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0) {
            anneeBissectile = true;
        }

        boolean jourValide = false;
        if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
            if (jour >= 1 && jour <= 30) {
                jourValide = true;
            }
        } else if (mois == 2) {
            if (jour == 29 && anneeBissectile == true) {
                jourValide = true;
            } else if (jour >= 1 && jour <= 28) {
                jourValide = true;
            }
        } else if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
            if (jour >= 1 && jour <= 31) {
                jourValide = true;
            }
        } else {
            jourValide = false;
        }

        boolean moisValide = false;
        if (mois >= 1 || mois <= 12) {
            moisValide = true;
        } else {
            moisValide = false;
        }

        boolean dateValide = false;
        if (jourValide && moisValide) {
            dateValide = true;
            System.out.println("La date " + jour + "." + mois + "." + annee + " est valide");
        } else {
            dateValide = false;
            System.out.println("La date " + jour + "." + mois + "." + annee + " n'est pas valide");
        }
    }
}

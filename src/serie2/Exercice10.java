package serie2;

import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Combien de pièce voulez-vous acheter ?");
        int nombrePiece = scanner1.nextInt();

        byte rabais = 0;

        if (nombrePiece >= 1000) {
            rabais = 10;
        } else if (nombrePiece >= 100) {
            rabais = 5;
        } else {
            rabais = 3;
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Quel est le prix unitaire de la pièce ?");
        double prixUnitaire = scanner2.nextDouble();

        double tva = 0.;

        if (nombrePiece <= 250) {
            tva = 8.2;
        } else if (nombrePiece <= 500) {
            tva = 6.3;
        } else {
            tva = 4.5;
        }

        double prixTotalHT = (double)(prixUnitaire * nombrePiece);
        System.out.println("Prix total HT : " + prixTotalHT);
        double prixTotalTTC = Math.round((prixTotalHT + (prixTotalHT * tva / 100)) * 10) / 10.0;
        System.out.println("Prix total TTC: " + prixTotalTTC);
        double prixTotal = Math.round((prixTotalTTC - (prixTotalTTC * rabais / 100)) * 10) / 10.0;
        System.out.println("Prix total : " + prixTotal);

        System.out.println("Le prix TTC pour " + nombrePiece + " pièces à " + prixUnitaire + ".- avec un rabais de " + rabais + "% et un taux de TVA à " + tva + "% sera de : " + String.format("%.2f", prixTotal));
    }
}

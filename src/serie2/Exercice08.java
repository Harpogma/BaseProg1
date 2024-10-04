/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serie2;

import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 *
 * @author greg
 */
public class Exercice08 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in)
                .useLocale(new java.util.Locale.Builder()
                        .setLanguage("CH")
                        .setRegion("fr")
                        .build());
        System.out.println("Entrer le prix du billet : ");
        double prixBillet = scanner.nextDouble();
        
        java.util.Scanner scanner1 = new java.util.Scanner(System.in)
                .useLocale(new java.util.Locale.Builder()
                        .setLanguage("CH")
                        .setRegion("fr")
                        .build());
        System.out.println("Tapez 1 si vous êtes un client normal");
        System.out.println("Tapez 2 si vous êtes un employé de la compagnie");
        System.out.println("Tapez 3 si vous êtes membre du club CIGOGNE");
        int categorieEmploye = scanner1.nextInt();
        
        int rabais = 0;
        
        switch (categorieEmploye) {
            case 1: rabais = 0;
                break;
            case 2: rabais = 20;
                break;
            default: rabais = 10;
        }
        
        java.util.Scanner scanner2 = new java.util.Scanner(System.in)
                .useLocale(new java.util.Locale.Builder()
                        .setLanguage("CH")
                        .setRegion("fr")
                        .build());
        System.out.println("Entrez le nombre de vols effectués avec notre compagnie : ");
        double nombreDeVols = scanner2.nextInt();
        
        
        if (nombreDeVols == 1) {
            rabais += 10;
        } else if (nombreDeVols >= 2 && nombreDeVols <= 5) {
            rabais += 15;
        } else {
            rabais += 20;
        }
        
        double prixFinal = (prixBillet - (prixBillet * rabais / 100));
        System.out.println("Prix final avant arrondi : " + prixFinal);
        prixFinal = Math.round(prixFinal * 100) / 100;
        System.out.println("Prix final : " + prixFinal);
       
        
        
        
//        System.out.println("Prix de base : " + prixBillet + ".-");
//        System.out.println("   Votre rabais : " + rabais + '%');
        
    }
}

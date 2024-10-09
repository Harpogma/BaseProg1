/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serie2;

import java.util.Scanner;

/**
 *
 * @author greg
 */
public class Exercice09 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in)
                .useLocale(new java.util.Locale.Builder()
                        .setLanguage("CH")
                        .setRegion("fr")
                        .build());
        System.out.println("Saisissez l'âge de la personne : ");
        byte age = scanner.nextByte();
        
        byte prixBillet = 0;
        if (age <= 7) {
            prixBillet = 5;
        } else if (age <= 18) {
            prixBillet = 10;
        } else {
            prixBillet = 15;
        }
        
        java.util.Scanner scanner1 = new java.util.Scanner(System.in)
                .useLocale(new java.util.Locale.Builder()
                        .setLanguage("CH")
                        .setRegion("fr")
                        .build());
        System.out.println("Veuillez entrer le nom du jour en minuscule (ex: lundi) : ");
        String jour = scanner1.nextLine();


        byte rabais = 0;
        
        if (jour.equals("lundi")) {
            rabais = 20;
        } else if (jour.equals("mardi") || jour.equals("jeudi")) {
            rabais = 10;
        }

        double prixFinal = Math.round((prixBillet - (prixBillet * rabais / 100.0)) * 2) / 2.0;

        System.out.println("Prix de base : " + prixBillet + ".-");
        System.out.println("Votre rabais : " + rabais + "%");
        System.out.printf("Votre prix : " + String.format("%.2f", prixFinal) + ".-");
    }
}

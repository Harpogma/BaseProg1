/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serie1;

/**
 *
 * @author greg
 */
public class Exercice06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double pi = 3.14159265359;
        
        java.util.Scanner scanner = new java.util.Scanner(System.in)
            .useLocale(new java.util.Locale.Builder()
            .setLanguage("CH")
            .setRegion("fr")
            .build());
       
        System.out.println("Veuillez saisir la valeur du rayon du cercle :"); 
        double rayon = scanner.nextDouble();
        scanner.close();
        
        double surface = rayon * rayon * pi;
        System.out.println("La surface du cercle est de : " + surface);
        
        double circonference = rayon * 2 * pi;
        System.out.println("La circonférence est de : " + circonference);
    }
    
}

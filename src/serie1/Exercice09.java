/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serie1;
import java.util.Scanner;
/**
 *
 * @author greg
 */
public class Exercice09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nombrePhotoInput = new Scanner(System.in);
        System.out.println("Combien de phot avez-vous :");
        int nombrePhoto = nombrePhotoInput.nextInt();
        
        Scanner nombrePhotoLigneInput = new Scanner(System.in);
        System.out.println("Combien de photo par ligne : ");
        int nombrePhotoLigne = nombrePhotoLigneInput.nextInt();
        
        int nombreLignePleine = nombrePhoto / nombrePhotoLigne;
        System.out.println("Il y aura " + nombreLignePleine + " ligne(s) constituées de " + nombrePhotoLigne + "photos");
        
        int restePhoto = nombrePhoto % nombrePhotoLigne;
        System.out.println("Il y aura " + restePhoto + " photo(s) sur la dernière ligne.");
    }
    
}

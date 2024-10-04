/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serie1;

/**
 *
 * @author greg
 */
public class Exercice02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nombreDeTours = 3;
        double tempsEnMiniParTour = 1.5;
        
        nombreDeTours += 1;
        
        double tempsTotalEnMin = nombreDeTours * tempsEnMiniParTour;
        
        System.out.println("Le temps effectué pour les " + nombreDeTours + " tours est de " + tempsTotalEnMin + " min.");
    }
    
}

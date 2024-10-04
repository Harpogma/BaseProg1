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
public class Exercice08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int coef2 = 2;
        final int coef3 = 3;
        
        Scanner noteInterInput = new Scanner(System.in);
        System.out.println("Veuillez saisir la note d'examen intermédiaire : ");
        double noteInter = noteInterInput.nextDouble();
        
        Scanner noteProjetInput = new Scanner(System.in);
        System.out.println("Veuillez saisir la note de projet : ");
        double noteProjet = noteProjetInput.nextDouble();
        
        Scanner noteExamenFinalInput = new Scanner(System.in);
        System.out.println("Veuillez saisir la note d'examen final");
        double noteExamenFinal = noteExamenFinalInput.nextDouble();
        
        double moyenne = ((noteInter * coef2) + noteProjet + (noteExamenFinal * coef3)) / 6;
        System.out.println("La moyenne final du cours est de : " + moyenne);
        
    }
    
}

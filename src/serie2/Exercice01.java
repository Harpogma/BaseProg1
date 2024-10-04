/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serie2;
import java.util.Scanner;
        
/**
 *
 * @author greg
 */
public class Exercice01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        int number = userInput.nextInt();
        
        int valeurAbsolue;
        
        if (number > 0) {
            valeurAbsolue = -number;
        } else {
            valeurAbsolue = Math.abs(number);
        }
        
        System.out.println("La valeur absolue de " + number + " est " + valeurAbsolue);
    }    
}

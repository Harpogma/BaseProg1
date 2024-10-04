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
public class Exercice11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner premierNombreInput = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre : ");
        int premierNombre = premierNombreInput.nextInt();
        
        Scanner secondNombreInput = new Scanner(System.in);
        System.out.println("Veuillez saisir un diviseur : ");
        int secondNombre = secondNombreInput.nextInt();
        
        boolean reponse = ((premierNombre % secondNombre) == 0) ? true : false;
        
        System.out.println(premierNombre + " est-il divisible par " + secondNombre + " ? : " + reponse);
    }
    
}

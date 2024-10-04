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
public class Exercice04 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        int number = userInput.nextInt();
        
        if (number >= 0) {
            System.out.println("Le nombre est positif");
        } else {
            System.out.println("Le nombre est négatif");
        }
    }
    
}

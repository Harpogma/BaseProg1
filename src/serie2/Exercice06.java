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
public class Exercice06 {
    public static void main(String[] args) {
        Scanner userInput1 = new Scanner(System.in);
        System.out.println("Veuillez saisir un premier nombre réel");
        double number1 = userInput1.nextDouble();
        
        Scanner userInput2 = new Scanner(System.in);
        System.out.println("Veuillez saisir un deuxième nombre réel");
        double number2 = userInput2.nextDouble();
        
        double equation = (number2 * -1) / number1;
        
        System.out.println("L'équation " + number1 + "*x + " + number2 + ", a comme solution x=" + equation);
    }
}

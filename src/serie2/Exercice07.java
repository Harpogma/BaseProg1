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
public class Exercice07 {
    public static void main(String[] args) {
        Scanner userInput1 = new Scanner(System.in);
        System.out.println("Veuillez saisir un premier nombre réel");
        double number1 = userInput1.nextDouble();
        
        Scanner userInput2 = new Scanner(System.in);
        System.out.println("Veuillez saisir un deuxième nombre réel");
        double number2 = userInput2.nextDouble();
        
        Scanner userInput3 = new Scanner(System.in);
        System.out.println("Veuillez saisir un deuxième nombre réel");
        double number3 = userInput3.nextDouble();
        
        double firstNumber = 0, secondNumber = 0, thirdNumber = 0;
        
        if (number1 < number2 && number1 < number3) {
            firstNumber = number1;
            if (number2 < number3) {
            secondNumber = number2;
            thirdNumber = number3;
            }
        } else if (number2 < number1 && number2 < number3) {
            firstNumber = number2;
            if (number3 < number1) {
                secondNumber = number3;
                thirdNumber = number1;
            }
        } else {
            firstNumber = number3;
            if (number1 < number2) {
                secondNumber = number1;
                thirdNumber = number2;
            } else {
                secondNumber = number2;
                thirdNumber = number1;
            }
        }
        
        System.out.println("Vous avez saisi les valeurs suivantes : " + firstNumber + " " + secondNumber + " " + thirdNumber);
    }
}

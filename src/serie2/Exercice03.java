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
public class Exercice03 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Veuillez saisir un caractère");
        char userChar = userInput.next().charAt(0);
        userChar = Character.toLowerCase(userChar);
        
        String reponse;
        
        switch (userChar) {
            case 'a': reponse = "Le charactère est une voyelle!";
                break;
            case 'e': reponse = "Le charactère est une voyelle!";
                break;
            case 'i': reponse = "Le charactère est une voyelle!";
                break;
            case 'o': reponse = "Le charactère est une voyelle!";
                break;
            case 'u': reponse = "Le charactère est une voyelle!";
                break;
            default: reponse = "Le charactère est une consonne!";
        }
        System.out.println(reponse);
    }
}

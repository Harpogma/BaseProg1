/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serie1;

/**
 *
 * @author greg
 */
public class Exercice04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.println("Avant :");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        int z = x;
        x = y;
        y = z;
        
        System.out.println("Maintenant :");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    
}

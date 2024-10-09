package serie3;

import java.util.Scanner;

public class Exercice09 {
    public static void main(String[] args) {
        System.out.println("Ce programme vous demande un nombre de notes, et calcule la moyenne de toutes les notes entrées.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez combien de notes vous voulez entrer : ");
        byte nombreNotesTotal = scanner.nextByte();
        scanner.nextLine();

        float plusHauteNote = 0f;
        float totalNotes = 0f;
        for (int i = 1; i <= nombreNotesTotal; i++) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Entrez la " + i + "e note [1;6] : ");
            float note = userInput.nextFloat();
            userInput.nextLine();
            while (note < 1 || note > 6) {
                System.out.println("Note hors des bornes, veuillez saisir une note dans l'interval [1;6] : ");
                note = userInput.nextFloat();
                userInput.nextLine();
            }
            if (note > plusHauteNote) {
                plusHauteNote = note;
            }
            totalNotes += note;
        }
        float moyenne = totalNotes / nombreNotesTotal;
        System.out.println("La moyenne des " + nombreNotesTotal + " notes est : " + String.format("%.2f ", moyenne));
    }
}

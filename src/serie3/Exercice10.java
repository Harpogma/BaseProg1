package serie3;

import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
        System.out.println("Ce programme vous laisse saisir des notes et arrête la saisie dès qu'une note sort de l'interval demandé, puis calcule la moyenne de toutes les notes entrées.");

        float note = 0f;
        float plusHauteNote = 0f;
        float totalNotes = 0f;
        byte nombreNotesTotal = 0;
        float moyenne = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Saisissez une note dans l'intervale [1;6] : ");
            note = scanner.nextFloat();
            scanner.nextLine();

            if (note > 1 && note < 6) {
                if (note > plusHauteNote) {
                    plusHauteNote = note;
                }
                totalNotes += note;
                nombreNotesTotal++;
            } else {
                System.out.println("La note " + note + " n'a pas été prise en compte !");
            }

        } while (note >= 1 && note <= 6);

        if (nombreNotesTotal == 0) {
            moyenne = 0;
        } else {
            moyenne = totalNotes / nombreNotesTotal;

        }

        System.out.println("La moyenne des " + nombreNotesTotal + " notes est : " + String.format("%.2f ", moyenne));
    }
}

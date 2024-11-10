package anciensTests;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class test23_exo2 {
    public static void main(String[] args) {
        String[] guestsList = {"Arthur", "Perceval", "Karadoc", "Guenièvre", "Merlin", "Lancelot"};
        ArrayList<String> absentGuests = new ArrayList<>();
        ArrayList<String> presentGuests = new ArrayList<>();
        boolean firstLetterUppercase = false;
        boolean isGuest = false;
        byte length = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nom d'une personne : ");
            String guest = scanner.nextLine();

            //go to the end of the loop if guest is empty. Meaning the user pressed "return"
            if (guest.isEmpty()) {
                break;
            }
            //handle the first letter to be upper case
            do {
                for (char c : guest.toCharArray()) {
                    if (isUpperCase(c)) {
                        firstLetterUppercase = true;
                        break;
                    }
                }
                if (!firstLetterUppercase) {
                    System.out.println("Le nom doit commencer par une majuscule et contenir au moins deux lettres...");
                    guest = scanner.nextLine();
                }
            } while (!firstLetterUppercase);

            //handle that the name has minimum 2 letters
            do {
                for (int i = 0; i < guest.length(); i++) {
                    length++;
                    if (length == 2) {
                        break;
                    }
                }

                if (length < 2) {
                    System.out.println("Le nom doit commencer par une majuscule et contenir au moins deux lettres...");
                    guest = scanner.nextLine();
                }
            } while (length < 2);

            //check if the person is on the guestsList
            for (int i = 0; i < guestsList.length; i++) {
                if (guestsList[i].equals(guest)) {
                    isGuest = true;
                    break;
                } else {
                    isGuest = false;
                }
            }

            if (isGuest) {
                presentGuests.add(guest);
                System.out.println("Bienvenue " + guest + " vous pouvez entrer !");
            } else {
                System.out.println("Cette personne n'a pas été invitée...");
                absentGuests.add(guest);
            }

        } while(true);

        System.out.print("Liste des personnes invitées présentes : ");
        for (String presents : presentGuests) {
            System.out.print(presents + ", ");
        }

        System.out.println();

        System.out.print("Liste des personnes invitées absentes : ");
        for (String absents : absentGuests) {
            System.out.print(absents + ", ");
        }
    }
}

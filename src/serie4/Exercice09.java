package serie4;

public class Exercice09 {
    public static void main(String[] args) {
        byte[] notes = {2, 3, 4, 5, 1, 6, 2, 3, 3, 4, 5, 6, 6, 3, 2, 5, 4, 3, 4, 4, 5};
        byte[] nombresNotes = new byte[7];

        //fait un array avec le nombres de chacune des notes
        for (int i = 0; i <= notes.length - 1; i++) {
            nombresNotes[notes[i]]++;
        }

        byte indexPusHauteNote = 0;
        for (int i = 1; i <= nombresNotes.length - 1; i++) {
            if (nombresNotes[i] > indexPusHauteNote) {
                indexPusHauteNote = nombresNotes[i];
            }
        }

        for (int i = indexPusHauteNote; i > 0; i--) {
            for (int j = 1; j <= nombresNotes.length - 1; j++) {
                if (nombresNotes[j] >= i) {
                    System.out.print(" X ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();

            if (i == 1) {
                for (int j = 1; j <= nombresNotes.length - 1; j++) {
                    System.out.print(" " + j + " ");
                }
                System.out.println();
            }
        }
    }
}

package serie4;

public class Exercice08 {
    public static void main(String[] args) {
        byte[] notes = {2, 3, 4, 5, 1, 6, 2, 3, 3, 4, 5, 6, 6, 3, 2, 5, 4, 3, 4, 4, 5};
        byte[] nombresNotes = new byte[7];

        //fait un array avec le nombres de chacune des notes
        for (int i = 0; i <= notes.length - 1; i++) {
            nombresNotes[notes[i]]++;
        }

        for (int i = 1; i <= nombresNotes.length - 1; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= nombresNotes[i]; j++) {
                System.out.print('X');
            }
            System.out.println(" (" + nombresNotes[i] + " occurence" + (nombresNotes[i] == 0 || nombresNotes[i] == 1 ? "" : "s") + " de la note " + i + ")");
        }
    }
}

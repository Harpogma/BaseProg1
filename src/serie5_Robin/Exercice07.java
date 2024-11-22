package serie5;

public class Exercice07 {

    public static void sortByteArray(byte[] byteArray) {

        for (int i = byteArray.length - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (byteArray[j - 1] > byteArray[j]) {
                    byte temp = byteArray[j - 1];
                    byteArray[j - 1] = byteArray[j];
                    byteArray[j] = temp;
                }
            }
        }

        for (int i : byteArray) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        byte[] tab = {5, 6, 3, 8, 2, 7, 9, 4, 1};
        sortByteArray(tab);
    }
}

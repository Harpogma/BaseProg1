package serie7_Robin;

public class Exercice01 {

    public static int indexOf(int[] tab, int number) {
        int result = 0;
        int indexInf = 0;
        int indexSup = tab.length - 1;
        int indexRech = (indexInf + indexSup) / 2;

        do {
            if (number == tab[indexRech]) {
                result = indexRech;
                break;
            } else {
                if (number < tab[indexRech]) {
                    indexSup = indexRech;
                    indexRech = (indexInf + indexSup) / 2;
                } else if (number > tab[indexRech]) {
                    indexInf = indexRech;
                    indexRech = (indexInf + indexSup) / 2;
                }
            }

        } while (true);


        return result;
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numberToSearch = 8;

        int isNumberIn = indexOf(tab, numberToSearch);
        System.out.println(isNumberIn);


    }
}

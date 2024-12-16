package serie6;

public class Exercice01 {

    public static int indexOf(int[] tab, int number) {
        int result = 0;
        int indexInf = 0;
        int indexSup = tab.length - 1;
        int indexRech = (indexInf + indexSup) / 2;

        do {
            if (number == tab[indexRech]) {
                result = indexRech;
            } else {
                if (number < tab[indexRech] && number > tab[indexRech + 1]) {
                    indexSup = indexRech;
                    indexRech = (indexInf + indexSup) / 2;
                    result = indexRech;
                } else if (number > tab[indexRech] && number < tab[tab.length - 1]) {
                    indexInf = indexRech;
                    indexRech = (indexInf + indexSup) / 2;
                    result = indexRech;
                } else {
                    result = -1;
                }
            }
        } while (number != tab[indexRech] && result != -1);

        return result;
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numberToSearch = 6;

        int isNumberIn = indexOf(tab, numberToSearch);
        System.out.println(isNumberIn);
    }
}

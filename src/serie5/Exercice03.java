package serie5;

public class Exercice03 {

    public static char charToUpperCase(char ch) {
        return Character.toUpperCase(ch);
    }

    public static void main(String[] args) {
        char caractere = 'c';

        char resultat = charToUpperCase(caractere);
        System.out.println("\"" + caractere + "\"" + " => " +resultat);
    }
}

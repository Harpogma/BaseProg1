package serie5_Robin;

public class Exercice04 {
    public static char charToLowerCase(char ch) {
        return Character.toLowerCase(ch);
    }

    public static void main(String[] args) {
        char caractere = 'G';

        char resultat = charToLowerCase(caractere);
        System.out.println("\"" + caractere + "\"" + " => " +resultat);
    }
}

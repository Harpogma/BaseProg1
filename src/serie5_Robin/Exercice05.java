package serie5;

public class Exercice05 {

    public static String ucfirst(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == s.charAt(0)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(Character.toLowerCase(c));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String mot = "simone";

        String finalString = ucfirst(mot);
        System.out.println("\"" + mot + "\" => " + finalString);
    }
}

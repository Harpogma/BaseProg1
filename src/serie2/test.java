package serie2;

public class test {
    public static void main(String[] args) {
        String a = "hello";
        String b = a;

        a = "world";

        if (b == "hello") {
            System.out.println("C'est vrai");
        } else {
            System.out.println("C'est faux");
        }


        String c = new String("hello");
        String d = c;

        c = "world";

        if (d == "hello") {
            System.out.println("C'est encore vrai");
        } else {
            System.out.println("C'est encore faux");
        }
    }
}

package tests;

public class string {
    public static void main(String[] args) {
        String a = "hello";
        String b = a;
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));

        a = "world";
        System.out.println(System.identityHashCode(a));

        if (b == "hello") {
            System.out.println("C'est vrai");
        } else {
            System.out.println("C'est faux");
        }


        String c = new String("hello");
        String d = c;
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));
        c = "world";
        System.out.println(System.identityHashCode(c));

        if (d == "hello") {
            System.out.println("C'est encore vrai");
        } else {
            System.out.println("C'est encore faux");
        }
    }
}

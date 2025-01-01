package serie6_Robin;

public class testLogique {
    public static void main(String[] args) {
        boolean isSquareEmpty = true;
        boolean isSquareValid = false;

        if ((isSquareEmpty || isSquareValid) || !(isSquareEmpty && isSquareValid)) {
            System.out.println("youpi");
        } else {
            System.out.println("pas youpi");
        }
    }
}

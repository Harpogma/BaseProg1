package serie6_Robin;

import java.util.Scanner;

public class ToutEnUnFichier {

    public static char[][] createChessBoard() {
        char whiteSquare = '#';
        char blackSquare = '0';
        char[][] board = new char[8][8];

        boolean switchChar = false;

        for (int i = board[0].length - 1; i >= 0; i--) {
            for (int j = 0; j < board[0].length; j++) {
                if (switchChar) {
                    board[j][i] = whiteSquare;
                    switchChar = false;
                } else {
                    board[j][i] = blackSquare;
                    switchChar = true;
                }
            }
            switchChar = !switchChar;
        }
        return board;
    }

    public static void printChessBoard(char[][] board) {
        byte[] rows = {1, 2, 3, 4, 5, 6, 7, 8};
        char[] columns = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

        for (int i = 0; i < columns.length; i++) {
            System.out.print((i == 0 ? "      " : ""));
            System.out.printf("%-5c", columns[i]);
        }
        System.out.println();
        System.out.println();

        for (int i = board[0].length - 1; i >= 0; i--) {
            System.out.printf("%-6d", rows[i]);
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[j][i] + "    ");
            }
            System.out.print(rows[i]);
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < columns.length; i++) {
            System.out.print((i == 0 ? "      " : ""));
            System.out.printf("%-5c", columns[i]);
        }

        System.out.println();
    }

    public static void placeAPawn(String input) {
        char[][] board = createChessBoard();
        char column = input.charAt(0);
        String row = input.substring(1);
        int test = Integer.parseInt(input.substring(1));

    }

    public static boolean isUserInputValid(String input) {
        char column = input.charAt(0);
        int row = Integer.parseInt(input.substring(1));

        System.out.println("Colonne : " + column);
        System.out.println("Ligne : " + row);

        if (column < 'A' || column > 'H' || row < 1 || row > 8) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println("Voici l'échiquier");
        char[][] board = createChessBoard();
        printChessBoard(board);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sur quelle case voulez-vous placer un pion ?");
        String pawnToPlace = scanner.nextLine();

        boolean isSquareValid = isUserInputValid(pawnToPlace);

        if (isSquareValid) {
            placeAPawn(pawnToPlace);
        } else {
            System.out.println("La case saisie est incorrect!");
        }
    }
}

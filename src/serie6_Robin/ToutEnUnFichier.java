package serie6_Robin;

import java.util.Scanner;

public class ToutEnUnFichier {

    public static char[][] createChessBoard() {
        char whiteSquare = '0';
        char blackSquare = '#';
        char[][] board = new char[8][8];

        boolean switchChar = false;

        for (int i = 0; i < board[0].length; i++) {
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

    public static char[][] placeAPawn(String input) {
        char[][] board = createChessBoard();
        char column = input.charAt(0);
        int columnIndex = 0;
        int row = Integer.parseInt(input.substring(1));

        switch (column) {
            case 'B': columnIndex = 1;
                break;
            case 'C': columnIndex = 2;
                break;
            case 'D': columnIndex = 3;
                break;
            case 'E': columnIndex = 4;
                break;
            case 'F': columnIndex = 5;
                break;
            case 'G': columnIndex = 6;
                break;
            case 'H': columnIndex = 7;
                break;
        }

        board[columnIndex][(row - 1)] = 'P';
        return board;
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
            board = placeAPawn(pawnToPlace);
        } else {
            System.out.println("La case saisie est incorrect!");
        }

        printChessBoard(board);
    }
}

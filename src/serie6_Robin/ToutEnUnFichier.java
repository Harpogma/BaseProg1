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

    public static char pieceChoice() {
        final char pawn = 'P';
        final char knight = 'K';

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle pièce voulez-vous placer ? ");
        System.out.println("Tapez " + pawn + " pour un pion, ou " + knight + " pour un cavalier :");
        char piece = scanner.nextLine().charAt(0);

        return piece;
    }

    public static char[][] placeAPiece(String input) {
        char[][] board = createChessBoard();
        byte column = parseSquareChar(input);
        //int columnIndex = 0;
        byte row = parseSquareByte(input);

       /* switch (column) {
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
        }*/

        //board[columnIndex][(row - 1)] = pieceChoice();
        board[column][(row - 1)] = pieceChoice();
        return board;
    }

    public static boolean isUserInputValid(String input) {
        byte column = parseSquareChar(input);
        byte row = parseSquareByte(input);

        System.out.println("Colonne : " + column);
        System.out.println("Ligne : " + row);

        if (column < 0 || column > 7 || row < 1 || row > 8) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isSquareEmpty(String input, char[][] board) {
        byte column = parseSquareChar(input);
        byte row = parseSquareByte(input);

        if (board[column][row] == 'P' || board[column][row] == 'K') {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isKnightMoveValid(String input, char[][] board) {
        byte column = parseSquareChar(input);
        byte row = parseSquareByte(input);

        byte[][] knightMoves = {
                {2, 1}, {2, -1},
                {-2, 1}, {-2, -1},
                {1, 2}, {1, -2},
                {-1, 2}, {-1, -2}
        };

        //TODO complete this part to check if a knight's move is possible

        return true;
    }

    public static byte parseSquareChar(String input) {
        char column = input.charAt(0);
        byte columnIndex = 0;
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

        return columnIndex;
    }

    public static byte parseSquareByte(String input) {
        return (byte)Integer.parseInt(input.substring(1));
    }

    //TODO create a function to handle the user input and ask for a valid one until it's correct

    public static void main(String[] args) {
        System.out.println("Voici l'échiquier");
        char[][] board = createChessBoard();
        printChessBoard(board);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sur quelle case voulez-vous placer une pièce ?");
        String pawnToBePlaced = scanner.nextLine();

        boolean isSquareValid = isUserInputValid(pawnToBePlaced);

        if (isSquareValid) {
            board = placeAPiece(pawnToBePlaced);
        } else {
            System.out.println("La case saisie est incorrecte !");
        }

        printChessBoard(board);

        System.out.println("Sur quelle case voulez-vous placer un cavalier ?");
        String knightToBePlaced = scanner.nextLine();
        isSquareValid = isUserInputValid(knightToBePlaced);

        boolean isSquareEmpty = isSquareEmpty(knightToBePlaced, board);

        if (isSquareValid) {
            if (isSquareEmpty) {
                placeAPiece(knightToBePlaced);
            } else {
                System.out.println("Cette case n'est pas vide, veuillez déplacer votre pièce sur une autre case.");
            }
        } else {
            System.out.println("La case saisie est incorrecte !");
        }

        System.out.println("Sur quelle case voulez-vous déplacer votre cavalier ?");
        String knightMove = scanner.nextLine();

        boolean knightToMove = isKnightMoveValid(knightMove, board);

        if (knightToMove) {
            System.out.println("Le mouvement du cavalier est possible !");
        } else {
            System.out.println("Le mouvement du cavalier n'est pas possible !");
        }


    }
}

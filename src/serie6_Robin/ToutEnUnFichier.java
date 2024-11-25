package serie6_Robin;

import java.util.Scanner;

public class ToutEnUnFichier {

    /**
     * Function that creates the chess board
     * @return a 2D array that represents the chess board
     */
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

    /**
     * Function that prints the chess board
     * @param board         the chess board
     */
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

    /**
     * Function that allows the user to choose the piece to be placed
     * @return a char with the piece representation in unicode
     */
    public static char pieceChoice() {
        final char pawn = '\u265F';
        final char knight = '\u265E';

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle pièce voulez-vous placer ? ");
        System.out.println("Tapez P pour un pion, ou K pour un cavalier :");
        char piece = scanner.nextLine().charAt(0);

        if (piece == 'P') {
            piece = pawn;
        } else if (piece == 'K') {
            piece = knight;
        }

        return piece;
    }

    /**
     * Function that handles the placement of a piece on the board
     * @param input         the user's input
     * @param board         the chess board
     * @return return a 2D array which represents the chess board with pieces placed on it
     */
    public static char[][] placeAPiece(String input, char[][] board) {
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

    /**
     * Function that checks if the user's input is an existing board square
     * @param input         the user's input
     * @return return true if the square exists, false otherwise
     */
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

    /**
     * Function that checks if the square is not occupied by another piece
     * @param input     the user's input
     * @param board     the chess board
     * @return true if the square is empty, false otherwise
     */
    public static boolean isSquareEmpty(String input, char[][] board) {
        byte column = parseSquareChar(input);
        byte row = parseSquareByte(input);

        if (board[column][row] == 'P' || board[column][row] == 'K') {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Function that checks if the move entered by the user for the knight is possible and not out of the board
     * @param input     the user's input
     * @param board     the chess board
     * @return true if the move is valid, false otherwise
     */
    public static boolean isKnightMoveValid(String input, char[][] board) {
        byte column = parseSquareChar(input);
        byte row = parseSquareByte(input);

        byte[][] knightMoves = {
                {2, 1}, {2, -1},
                {-2, 1}, {-2, -1},
                {1, 2}, {1, -2},
                {-1, 2}, {-1, -2}
        };

        for (int i = 0; i < knightMoves.length; i++) {
            for (int j = 0; j < knightMoves[i].length; j++) {
                if (column + knightMoves[i][j] < board[0].length) {
                    if (row + knightMoves[i][j] < board[0].length) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return false;
    }

    /**
     * Function that takes the user input's string, extract the letter and return the column's index
     * @param input     the user's input
     * @return the column's index
     */
    public static byte parseSquareChar(String input) {
        char column = input.charAt(0);
        byte columnIndex = 0;
        switch (column) {
            case 'B':
                columnIndex = 1;
                break;
            case 'C':
                columnIndex = 2;
                break;
            case 'D':
                columnIndex = 3;
                break;
            case 'E':
                columnIndex = 4;
                break;
            case 'F':
                columnIndex = 5;
                break;
            case 'G':
                columnIndex = 6;
                break;
            case 'H':
                columnIndex = 7;
                break;
        }

        return columnIndex;
    }

    /**
     * Function that takes the user input's string a extract the number into a byte
     * @param input     the user's input
     * @return a byte
     */
    public static byte parseSquareByte(String input) {
        return (byte) Integer.parseInt(input.substring(1));
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
            board = placeAPiece(pawnToBePlaced, board);
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
                board = placeAPiece(knightToBePlaced, board);
            } else {
                System.out.println("Cette case n'est pas vide, veuillez déplacer votre pièce sur une autre case.");
            }
        } else {
            System.out.println("La case saisie est incorrecte !");
        }

        printChessBoard(board);


        System.out.println("Sur quelle case voulez-vous déplacer votre cavalier ?");
        String knightMove = scanner.nextLine();

        boolean knightToMove = isKnightMoveValid(knightMove, board);

        if (knightToMove) {
            System.out.println("Le mouvement du cavalier est possible !");
            board = placeAPiece(knightMove, board);
        } else {
            System.out.println("Le mouvement du cavalier n'est pas possible !");
        }

        printChessBoard(board);
    }
}

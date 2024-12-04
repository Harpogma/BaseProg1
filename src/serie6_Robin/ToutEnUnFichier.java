package serie6_Robin;

import color.Color;

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
        String emptySpacesx2 = "  ";
        String emptySpacesx4 = "    ";
        String emptySpacesx5 = "     ";
        String emptySpacesx6 = "      ";

        for (int i = 0; i < columns.length; i++) {
            System.out.print((i == 0 ? "     " : ""));
            System.out.print(emptySpacesx4 + columns[i]);
        }
        System.out.println();

        boolean even = true;

        for (int i = board[0].length - 1; i >= 0; i--) {
            System.out.print(emptySpacesx6 + rows[i] + " ");
            for (int j = 0; j < board[0].length; j++) {
                if (even) {
                    System.out.print(Color.GREEN_BACKGROUND_BRIGHT + Color.BLACK_BOLD);
                    System.out.print(emptySpacesx2 + board[j][i] + emptySpacesx2);
                    System.out.print(Color.RESET);
                    even = false;
                } else {
                    System.out.print(Color.YELLOW_BACKGROUND_BRIGHT + Color.BLACK_BOLD);
                    System.out.print(emptySpacesx2 + board[j][i] + emptySpacesx2);
                    System.out.print(Color.RESET);
                    even = true;
                }
            }
            even = !even;
            System.out.print(" " + rows[i]);

            System.out.println();
        }

        for (int i = 0; i < columns.length; i++) {
            System.out.print((i == 0 ? "     " : ""));
            System.out.print(emptySpacesx4 + columns[i]);
        }

        System.out.println();
    }

    /**
     * Function that allows the user to choose the piece to be placed
     * @return a char with the piece representation in Unicode
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
        byte row = parseSquareByte(input);

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

        if ((column < 0 || column > 7) && (row < 1 || row > 8)) {
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

        if (board[column][row - 1] == '\u265F' || board[column][row - 1] == '\u265E') {
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
                if (column + knightMoves[i][j] < board[0].length - 1) {
                    if (row + knightMoves[i][j] < board[0].length - 1) {
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
     * Function that takes the user input's string and extract the number into a byte
     * @param input     the user's input
     * @return a byte
     */
    public static byte parseSquareByte(String input) {
        return (byte) Integer.parseInt(input.substring(1));
    }

    public static String getUserInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String input = scanner.nextLine();

        boolean isUserInputValid = isUserInputValid(input);

        if (!isUserInputValid) {
            do {
                System.out.println("La case entrée n'est pas valide. Veuillez saisir une case valide.");
                input = scanner.nextLine();
                isUserInputValid = isUserInputValid(input);
            } while (!isUserInputValid);
        }

        return input;
    }

    public static void main(String[] args) {
        System.out.println("Voici l'échiquier");
        char[][] board = createChessBoard();

        printChessBoard(board);

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Sur quelle case voulez-vous placer une pièce ?");
        String pieceToPlace = getUserInput("Sur quelle case voulez-vous placer votre pièce ?");
        System.out.println(pieceToPlace);
        boolean isSquareValid = isUserInputValid(pieceToPlace);

        if (isSquareValid) {
            board = placeAPiece(pieceToPlace, board);
        } else {
            System.out.println("La case saisie est incorrecte !");
        }

        printChessBoard(board);

        boolean isSquareEmpty;

        System.out.println("Sur quelle case voulez-vous placer votre pièce ?");
        pieceToPlace = scanner.nextLine();
        isSquareValid = isUserInputValid(pieceToPlace);
        isSquareEmpty = isSquareEmpty(pieceToPlace, board);

        if (!(isSquareValid && isSquareEmpty) && (isSquareEmpty || isSquareValid)) {
            while (!(isSquareEmpty && isSquareValid)) {
                System.out.println("La case est déjà occupée par une autre pièce, veuillez en choisir une autre.");
                pieceToPlace = scanner.nextLine();
                isSquareValid = isUserInputValid(pieceToPlace);
                isSquareEmpty = isSquareEmpty(pieceToPlace, board);
            }
            board = placeAPiece(pieceToPlace, board);
        } else {
            board = placeAPiece(pieceToPlace, board);
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

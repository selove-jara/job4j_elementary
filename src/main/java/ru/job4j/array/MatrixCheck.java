package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[row][cell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int diagonal = 0; diagonal < board.length; diagonal++) {
            rsl[diagonal] = board[diagonal][diagonal];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int diagonal = 0; diagonal < board.length; diagonal++) {
            if (monoHorizontal(board, diagonal) || monoVertical(board, diagonal)) {
                result = true;
                break;
            }
        }
        return result;
    }
}

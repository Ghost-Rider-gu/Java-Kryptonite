package corp.siendev.com;

import java.util.Arrays;

public class NonAttackingQueens {
    private static final int boardSize = 4;

    public static void main(String[] args)
    {
        nQueensSolution();
    }

    private static void nQueensSolution() {
        int[][] chessBoard = new int[boardSize][boardSize];
        initBoard(chessBoard);

        if (solutionIsPresent(chessBoard, 0)) {
            showSolution(chessBoard);
        } else {
            System.out.println("The is no solutions");
        }
    }

    private static void initBoard(int[][] chessBoard) {
        for (int i = 0; i < boardSize; i++) {
            Arrays.fill(chessBoard[i], 0);
        }
    }

    private static void showSolution(int[][] chessBoard) {
        for (int[] row : chessBoard) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static boolean isSafe(int[][] chessBoard, int row, int col) {
        for (int i = 0; i < col; i++) {
            if (chessBoard[row][i] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (chessBoard[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i < boardSize && j >= 0; i++, j--) {
            if (chessBoard[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static boolean solutionIsPresent(int[][] chessBoard, int col) {
        if (col >= boardSize) {
            return true;
        }

        for (int i = 0; i < boardSize; i++) {
            if (isSafe(chessBoard, i, col)) {
                chessBoard[i][col] = 1;

                if (solutionIsPresent(chessBoard, col + 1)) {
                    return true;
                } else {
                    chessBoard[i][col] = 0;
                }
            }
        }

        return false;
    }
}

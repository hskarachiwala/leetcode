package leetcode;

public class Nqueen {

    public static boolean nqueen(boolean[][] board, int row) {
        if(row==board.length) {
            return true;
        }
        for(int col=0; col<board[0].length; col++) {
            board[row][col] = true;
            if(isValid(board, row, col) && nqueen(board,row+1)) {
                return true;
            }
            board[row][col] = false;
        }
        return false;
    }

    private static boolean isValid(boolean[][] board, int row, int col) {
        for(int i = row-1; i>=0; i--) {
            if(board[i][col]) {
                return false;
            }
        }
        row--;
        col--;
        while(col>=0 && row>=0) {
            if(board[row][col]) {
                return false;
            }
            row--;
            col--;
        }
        return true;
    }
}

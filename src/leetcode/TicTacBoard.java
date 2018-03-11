package leetcode;

public class TicTacBoard {

    public Character[][] board;

    public TicTacBoard() {
        board = new Character[3][3];
    }

    public void playTurn(){

    }

    public boolean checkBoardFull() {
        for(int row=0; row<board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public void addToken(int row, int col, char token) {
        board[row][col] = token;
    }

    public void printBoard(){
        for(int row=0; row<board.length; row++) {
            for(int col=0;col<board[0].length; col++) {
                if(board[row][col]==null) {
                    System.out.print("-");
                } else {
                    System.out.print(board[row][col]);
                }
                if(col<board[0].length-1) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }

}

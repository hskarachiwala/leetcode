package leetcode;

public class TicTacComputer {

    private TicTacBoard ticTacBoard;

    public TicTacComputer(TicTacBoard ticTacBoard) {
        this.ticTacBoard = ticTacBoard;
    }

    public void play() throws Exception {
        if(ticTacBoard.checkBoardFull()) {
            throw new Exception();
        }
        for(int row=0; row<ticTacBoard.board.length; row++) {
            for (int col = 0; col < ticTacBoard.board[0].length; col++) {
                if (ticTacBoard.board[row][col] == null) {
                    ticTacBoard.board[row][col] = 'O';
                    return;
                }
            }
        }

    }

}

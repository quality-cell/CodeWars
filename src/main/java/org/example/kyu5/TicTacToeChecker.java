package org.example.kyu5;

public class TicTacToeChecker {
    public static int isSolved(int[][] board) {
        int countZero = 0;

        for (int i = 0; i < 3; i++) {
            if (board[i][0] != 0 && board[i][0] == board[i][1] && board[i][1] == board[i][2])
                return board[i][0];
            else if (board[0][i] != 0 && board[0][i] == board[1][i] && board[1][i] == board[2][i])
                return board[0][i];
            else if (board[0][0] != 0 && board[0][0] == board[1][1] && board[1][1] ==  board[2][2] ||
                    board[0][2] != 0 && board[0][2] == board[1][1] && board[1][1] ==  board[2][0]) {
                return board[1][1];
            } else if (board[0][i] == 0 || board[1][i] == 0 || board[2][i] == 0)
                countZero++;
        }

        return countZero > 0 ? -1 : 0;
    }
}

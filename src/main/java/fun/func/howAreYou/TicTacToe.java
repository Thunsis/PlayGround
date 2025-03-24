package fun.func.howAreYou;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SIZE = 3;
        int[][] board = new int[SIZE][SIZE];
        boolean gotResult = false;
        int numOfX = 0;
        int numOfO = 0;

        // 读入矩阵
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = in.nextInt();
            }
        }

        // 检查行
        for (int i = 0; i < board.length; i++) {
            numOfX = 0;
            numOfO = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    numOfX ++;
                } else {
                    numOfO ++;
                }
            }
            if (numOfX == board.length || numOfO == board.length) {
                gotResult=true;
                break;
            }
        }

        // 检查列
        for (int i = 0; i < board.length; i++) {
            numOfX = 0;
            numOfO = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] == 1) {
                    numOfX ++;
                } else {
                    numOfO ++;
                }
            }
            if (numOfX == board[i].length || numOfO == board[i].length) {
                gotResult=true;
                break;
            }
        }

        // 检查正对角线
        numOfX = 0;
        numOfO = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                numOfX ++;
            } else {
                numOfO ++;
            }
        }
        if (numOfX == board.length || numOfO == board.length) {
            gotResult=true;
        }
        numOfX = 0;
        numOfO = 0;

        // 检查斜对角线
        for (int i = 0; i < board.length; i++) {
            if (board[i][board[i].length-1-i] == 1) {
                numOfX ++;
            } else {
                numOfO ++;
            }
        }
        if (numOfX == board.length || numOfO == board.length) {
            gotResult=true;
        }

        if (gotResult) {
            System.out.println("Game Over!");
        }
    }
}

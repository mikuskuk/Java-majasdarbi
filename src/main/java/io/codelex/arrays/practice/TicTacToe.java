package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';
    private static boolean gameOver = false;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        initBoard();
        displayBoard();

        while (!gameOver) {
            System.out.println(currentPlayer + " choose your location (row, column): ");
            int row = keyboard.nextInt();
            int col = keyboard.nextInt();

            if (isValidMove(row, col)) {
                makeMove(row, col);
                displayBoard();
                if (checkWin()) {
                    System.out.println(currentPlayer + " wins!");
                    gameOver = true;
                } else if (checkTie()) {
                    System.out.println("The game is a tie.");
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move, try again.");
            }
        }

    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static boolean isValidMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            return false;
        }
        if (board[row][col] != ' ') {
            return false;
        }
        return true;
    }

    public static void makeMove(int row, int col) {
        board[row][col] = currentPlayer;
    }

    public static boolean checkWin() {
        for (int r = 0; r < 3; r++) {
            if (board[r][0] == currentPlayer && board[r][1] == currentPlayer && board[r][2] == currentPlayer) {
                return true;
            }
        }

        for (int c = 0; c < 3; c++) {
            if (board[0][c] == currentPlayer && board[1][c] == currentPlayer && board[2][c] == currentPlayer) {
                return true;
            }
        }

        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[2][0] == currentPlayer && board[1][1] == currentPlayer && board[0][2] == currentPlayer) {
            return true;
        }
        return false;
    }

    public static boolean checkTie() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }
}
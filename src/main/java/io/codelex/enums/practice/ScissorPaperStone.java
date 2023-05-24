package io.codelex.enums.practice;

import java.util.Random;
import java.util.Scanner;

public class ScissorPaperStone {
    enum Move {
        SCISSOR,
        PAPER,
        STONE;

        public static Move getRandomMove() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }

    public static void main(String[] args) {
        gamePlay();
    }

    private static void gamePlay() {
        Scanner input = new Scanner(System.in);
       
        int totalTrials = 0;
        int computerWins = 0;
        int playerWins = 0;

        System.out.println("Let us begin...");
        System.out.println("Scissor-Paper-Stone");

        while (true) {
            System.out.println("Your turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
            String move = input.nextLine().trim().toLowerCase();

            if (move.equals("q")) {
                break;
            }

            if (move.matches("[spt]")) {
                Move playerMove = getPlayerMoves(move);
                Move computerMove = Move.getRandomMove();

                System.out.println("My turn: " + computerMove);

                switch (playerMove) {
                    case SCISSOR -> {
                        if (computerMove == Move.PAPER) {
                            System.out.println("SCISSOR beats PAPER, You won!");
                            playerWins++;
                        } else if (computerMove == Move.STONE) {
                            System.out.println("STONE beats SCISSOR, I won!");
                            computerWins++;
                        } else {
                            System.out.println("Tie!");
                        }
                    }
                    case PAPER -> {
                        if (computerMove == Move.STONE) {
                            System.out.println("PAPER beats STONE, You won!");
                            playerWins++;
                        } else if (computerMove == Move.SCISSOR) {
                            System.out.println("SCISSOR beats PAPER, I won!");
                            computerWins++;
                        } else {
                            System.out.println("Tie!");
                        }
                    }
                    case STONE -> {
                        if (computerMove == Move.SCISSOR) {
                            System.out.println("STONE beats SCISSOR, You won!");
                            playerWins++;
                        } else if (computerMove == Move.PAPER) {
                            System.out.println("PAPER beats STONE, I won!");
                            computerWins++;
                        } else {
                            System.out.println("Tie!");
                        }
                    }
                }

                totalTrials++;
            } else {
                System.out.println("Invalid input, try again...");
            }
        }

        System.out.println("\nNumber of trials: " + totalTrials);
        System.out.println("I won " + computerWins + "(" + getWinPercentage(computerWins, totalTrials) + "%). You won " + playerWins + "(" + getWinPercentage(playerWins, totalTrials) + "%).");
        System.out.println("Bye!");

        input.close();
    }

    private static Move getPlayerMoves(String input) {
        return switch (input) {
            case "s" -> Move.SCISSOR;
            case "p" -> Move.PAPER;
            case "t" -> Move.STONE;
            default -> null;
        };
    }

    private static double getWinPercentage(int wins, int total) {
        return total > 0 ? (double) wins / total * 100 : 0;
    }
}

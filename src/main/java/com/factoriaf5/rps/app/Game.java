package com.factoriaf5.rps.app;

import com.factoriaf5.rps.domain.models.ActionFactory;

public class Game {

    public String startGame(String playerOneAction, String playerTwoAction) {

        ActionFactory actionFactory = new ActionFactory();

        String actionPlayer1 = actionFactory.getAction(playerOneAction).getAction();

        String actionPlayer2 = actionFactory.getAction(playerTwoAction).getAction();

        String winner = checkWinner(actionPlayer1, actionPlayer2);

        return winner;
    }

    public static String checkWinner(String actionPlayer1, String actionPlayer2) {
        if (actionPlayer1 == actionPlayer2) {
            return "Draw!";
        } else if (actionPlayer1 == "r" && actionPlayer2 == "s" || actionPlayer1 == "p" && actionPlayer2 == "r"
                || actionPlayer1 == "s" && actionPlayer2 == "p") {
            return "Player 1 wins!";
        } else {
            return "Player 2 wins!";
        }
    }
}

// if (action1 == action2) {
// return outcome = "Same player";
// }
// action1.toLowerCase();
// action2.toLowerCase();

// if (action1 == action2) {
// return outcome = "Draw!";
// }

// if (action1 == "rock" && action2 == "scissor") {
// return outcome = "Player 1 won!";
// }

// if (action1 == "paper" && action2 == "rock") {
// return outcome = "Player 1 won!";
// }

// if (action1 == "scissor" && action2 == "paper") {
// return outcome = "Player 1 won!";
// }

// return outcome = "Player 2 won!";

// Scanner input = new Scanner(System.in);
// System.out.println("Player 1: write one if these options, Rock(R), Paper(P),
// Scissors(S)");
// String playerOneAction = input.nextLine();

// System.out.println("Player 2: write one if these options, Rock(R), Paper(P),
// Scissors(S)");
// String playerTwoAction = input.nextLine();

// input.close();
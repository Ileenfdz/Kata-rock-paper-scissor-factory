package com.factoriaf5.rps.infrastructure;

public class Game {

    public String startGame(String playerOneAction, String playerTwoAction) {

        String winner = checkWinner(playerOneAction, playerTwoAction);

        return winner;
    }

    public String checkWinner(String player1, String player2){
        if(player1 == player2){
            return "Draw!";
        }
        if(player1 == "r" && player2 == "s" || player1 == "p" && player2 == "r" || player1 == "s" && player2 == "p"){
            return "Player 1 wins!";
        }else{
            return "Player 2 wins!";
        }
    }
}





















// if (action1 == action2) {
//     return outcome = "Same player";
// }
// action1.toLowerCase();
// action2.toLowerCase();

// if (action1 == action2) {
//     return outcome = "Draw!";
// }

// if (action1 == "rock" && action2 == "scissor") {
//     return outcome = "Player 1 won!";
// }

// if (action1 == "paper" && action2 == "rock") {
//     return outcome = "Player 1 won!";
// }

// if (action1 == "scissor" && action2 == "paper") {
//     return outcome = "Player 1 won!";
// }

// return outcome = "Player 2 won!";




// Scanner input = new Scanner(System.in);
        // System.out.println("Player 1: write one if these options, Rock(R), Paper(P), Scissors(S)");
        // String playerOneAction = input.nextLine();

        // System.out.println("Player 2: write one if these options, Rock(R), Paper(P), Scissors(S)");
        // String playerTwoAction = input.nextLine();

        // input.close();
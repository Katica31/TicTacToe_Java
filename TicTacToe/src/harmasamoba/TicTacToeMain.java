package harmasamoba;

import java.io.IOException;

public class TicTacToeMain {
    public static void main(String[] args) {
        

        String[][] board = new String[3][3]; //create a new board
        Board.boardInit(board);  // clean the values of the fields
        

        for (int i = 0; i < 100; i++) {
            System.out.println();
            Board.boardDraw(board); //Draw the board with the actual status of the board
            String nextStep = Player.askForNextStepp(); //Ask for next step
            boolean isValid = Player.injection(i, nextStep, board); // check the validation of the step, and inject it into the board
            if (isValid == false) { 
                i--;
            }

            Boolean result = Board.checkEnd(board); // Checking the actual stance
            Boolean check = true; 
            if (check.equals(result)) {
                System.out.println("END OF GAME");
                break;
            } 
        }
    }
}

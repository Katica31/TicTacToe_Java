package harmasamoba;

import java.io.IOException;
import java.util.Scanner;

public class Player {

        // this method asks for the next step
    public static String askForNextStepp() {
        System.out.println("Please add the next step!");
        Scanner scan = new Scanner(System.in);
        String nextStep = scan.next();
        return nextStep;

    }


    public static void cleanConsole() throws InterruptedException, IOException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }   
    



        // this method checks the validation of the step, and if it is valid injects the step into the board
    public static boolean injection(int numerOfRounds, String nextStep, String[][] board) {
        boolean stepIsValid = true;

        try {
            Player.cleanConsole();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (numerOfRounds % 2 == 0) {
            if (nextStep.toUpperCase().equals("A1") && board[0][0] == " ") {
                board[0][0] = "0";
            } else if (nextStep.toUpperCase().equals("A2") && board[0][1] == " ") {
                board[0][1] = "0";
            } else if (nextStep.toUpperCase().equals("A3") && board[0][2] == " ") {
                board[0][2] = "0";
            } else if (nextStep.toUpperCase().equals("B1") && board[1][0] == " ") {
                board[1][0] = "0";
            } else if (nextStep.toUpperCase().equals("B2") && board[1][1] == " ") {
                board[1][1] = "0";
            } else if (nextStep.toUpperCase().equals("B3") && board[1][2] == " ") {
                board[1][2] = "0";
            } else if (nextStep.toUpperCase().equals("C1") && board[2][0] == " ") {
                board[2][0] = "0";
            } else if (nextStep.toUpperCase().equals("C2") && board[2][1] == " ") {
                board[2][1] = "0";
            } else if (nextStep.toUpperCase().equals("C3") && board[2][2] == " ") {
                board[2][2] = "0";
            }else{System.out.println("invalid move!");
            stepIsValid = false;}

        } else if (numerOfRounds % 2 != 0) {
            if (nextStep.toUpperCase().equals("A1") && board[0][0] == " ") {
                board[0][0] = "X";
            } else if (nextStep.toUpperCase().equals("A2") && board[0][1] == " ") {
                board[0][1] = "X";
            } else if (nextStep.toUpperCase().equals("A3") && board[0][2] == " ") {
                board[0][2] = "X";
            } else if (nextStep.toUpperCase().equals("B1") && board[1][0] == " ") {
                board[1][0] = "X";
            } else if (nextStep.toUpperCase().equals("B2") && board[1][1] == " ") {
                board[1][1] = "X";
            } else if (nextStep.toUpperCase().equals("B3") && board[1][2] == " ") {
                board[1][2] = "X";
            } else if (nextStep.toUpperCase().equals("C1") && board[2][0] == " ") {
                board[2][0] = "X";
            } else if (nextStep.toUpperCase().equals("C2") && board[2][1] == " ") {
                board[2][1] = "X";
            } else if (nextStep.toUpperCase().equals("C3") && board[2][2] == " ") {
                board[2][2] = "X";
            }else{
            stepIsValid = false;}
    }
    Board.boardDraw(board);
    return stepIsValid;
}

   
}

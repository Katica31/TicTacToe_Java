package harmasamoba;

import java.util.Scanner;

public class Player {

        // this method asks for the next step
    public static String askForNextStepp() {
        System.out.println("Please add the next step!");
        Scanner scan = new Scanner(System.in);
        String nextStep = scan.next();
        return nextStep;

    }



        // this method checks the validation of the step, and if it is valid injects the step into the board
    public static boolean injection(int numerOfRounds, String nextStep, String[][] board) {
        boolean stepIsValid = true;
        if (numerOfRounds % 2 == 0) {
            if (nextStep.equals("A1") && board[0][0] == " ") {
                board[0][0] = "0";
            } else if (nextStep.equals("A2") && board[0][1] == " ") {
                board[0][1] = "0";
            } else if (nextStep.equals("A3") && board[0][2] == " ") {
                board[0][2] = "0";
            } else if (nextStep.equals("B1") && board[1][0] == " ") {
                board[1][0] = "0";
            } else if (nextStep.equals("B2") && board[1][1] == " ") {
                board[1][1] = "0";
            } else if (nextStep.equals("B3") && board[1][2] == " ") {
                board[1][2] = "0";
            } else if (nextStep.equals("C1") && board[2][0] == " ") {
                board[2][0] = "0";
            } else if (nextStep.equals("C2") && board[2][1] == " ") {
                board[2][1] = "0";
            } else if (nextStep.equals("C3") && board[2][2] == " ") {
                board[2][2] = "0";
            }else{System.out.println("invalid move!");
            stepIsValid = false;}

        } else if (numerOfRounds % 2 != 0) {
            if (nextStep.equals("A1") && board[0][0] == " ") {
                board[0][0] = "X";
            } else if (nextStep.equals("A2") && board[0][1] == " ") {
                board[0][1] = "X";
            } else if (nextStep.equals("A3") && board[0][2] == " ") {
                board[0][2] = "X";
            } else if (nextStep.equals("B1") && board[1][0] == " ") {
                board[1][0] = "X";
            } else if (nextStep.equals("B2") && board[1][1] == " ") {
                board[1][1] = "X";
            } else if (nextStep.equals("B3") && board[1][2] == " ") {
                board[1][2] = "X";
            } else if (nextStep.equals("C1") && board[2][0] == " ") {
                board[2][0] = "X";
            } else if (nextStep.equals("C2") && board[2][1] == " ") {
                board[2][1] = "X";
            } else if (nextStep.equals("C3") && board[2][2] == " ") {
                board[2][2] = "X";
            }else{System.out.println("invalid move!");
            stepIsValid = false;}
    }
    return stepIsValid;
}

   
}

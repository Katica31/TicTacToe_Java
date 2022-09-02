package harmasamoba;

import java.io.IOException;

public class Board {


    //this method cleans the fields of the board
    public static void boardInit(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = " ";
            }
        }
    }

   
    //This method draws the board on the console
    public static void boardDraw(String[][] board) {
        System.out.println("    1   2   3  ");
        System.out.println("  +---+---+---+");
        System.out.println("A | " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
        System.out.println("  +---+---+---+");
        System.out.println("B | " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
        System.out.println("  +---+---+---+");
        System.out.println("C | " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |");
        System.out.println("  +---+---+---+");
    }



    // This method check if the game ends or not
    public static Boolean checkEnd(String [][] board){
            int count = 0;
            if(board[0][0].equals("0") && board[0][0].equals(board[0][1]) && board[0][0].equals(board[0][2])){
            return(true);
            }else if(board[1][0].equals("0") && board[1][0].equals(board[1][1]) && board[1][0].equals(board[1][2])){
            return(true); 
            }else if(board[2][0].equals("0") && board[2][0].equals(board[2][1]) && board[2][0].equals(board[1][2])){
                return(true);
            }else if(board[0][0].equals("0") && board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])){
                return(true);    
            }else if(board[0][2].equals("0") && board[0][2].equals(board[1][1]) && board[1][1].equals(board[0][0])){
                return(true);
            }else if(board[0][0].equals("0") && board[0][0].equals(board[1][0]) && board[0][0].equals(board[2][0])){
                return(true);
            }else if(board[0][1].equals("0") && board[0][1].equals(board[1][1]) && board[0][1].equals(board[2][1])){
                return(true);
            }else if(board[0][2].equals("0") && board[0][2].equals(board[1][2]) && board[0][0].equals(board[2][2])){
                return(true);

            }else if(board[0][0].equals("X") && board[0][0].equals(board[0][1]) && board[0][0].equals(board[0][2])){
            return(true);
            }else if(board[1][0].equals("X") && board[1][0].equals(board[1][1]) && board[1][0].equals(board[1][2])){
            return(true); 
            }else if(board[2][0].equals("X") && board[2][0].equals(board[2][1]) && board[2][0].equals(board[1][2])){
            return(true);
            }else if(board[0][0].equals("X") && board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])){
            return(true);    
            }else if(board[0][2].equals("X") && board[0][2].equals(board[1][1]) && board[1][1].equals(board[0][0])){
            return(true);
            }else if(board[0][0].equals("X") && board[0][0].equals(board[1][0]) && board[0][0].equals(board[2][0])){
            return(true);
            }else if(board[0][1].equals("X") && board[0][1].equals(board[1][1]) && board[0][1].equals(board[2][1])){
            return(true);
            }else if(board[0][2].equals("X") && board[0][2].equals(board[1][2]) && board[0][0].equals(board[2][2])){
            return(true);

        }else{
            
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
               if(board[i][j] != " "){
                count++;
               }
            }
        }
        if (count == 9) {
            System.out.println("End of game, there is no winner");
            return true;
            
        }else{
            count = 0;
            return false;
        }
    }



    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connectfour;
import connectfour.ConnectFour;
import java.util.Scanner;

/**
 *
 * @author colleen-reynolds
 */
public class test {
    //---Declared outside methods so that the game can restart with same
    //---instance of the game.
     protected static ConnectFour instance = new ConnectFour();
     
     public static void main(String[] args) {
     //---Creates a board and wipes any old values
     instance.wipeBoard();
     playGame(true);
     }

     protected static void playGame(boolean firstGame)
    {
        
        
        Scanner input = new Scanner(System.in);

        if(firstGame)
        {
        
        
        //---Gets player names
        System.out.println("Player 1: What is your name?");
        input = new Scanner(System.in);
        String player1Name = input.nextLine();
        
        System.out.println("Player 2: What is your name?");
        input = new Scanner(System.in);
        String player2Name = input.nextLine();
        
        //---Declares variable for player namse in ConnectFour class
        instance.playerNames(player1Name, player2Name);
        }
        //---Game playing while loop
            while (instance.getWinner().contentEquals("No winner yet"))
        {
             System.out.println("Please choose a column " + instance.getCurrentPlayerName() + ":");
             String output = input.nextLine();
             if (output.contentEquals("exit"))
             {
                 return;
             }
             instance.makeMove(output);
        }
    
         System.out.println(instance.getWinner());
         System.out.println("Would you like to play again?");
     
         
     //---Do they want to play another game
     String output = input.nextLine();
     if (instance.newGame(output))
     {
         //Start new game
         instance.wipeBoard();
         playGame(false);
     }
     else
     {
         System.out.println("Thank you for playing");
     }
         
    }
}

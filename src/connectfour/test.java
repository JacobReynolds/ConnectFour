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
    int answer = 0;
     public static void main(String[] args) {
     playGame();
     ConnectFour instance = new ConnectFour();
     Scanner input = new Scanner(System.in);
     
     }
     
     private static void playGame()
    {
        ConnectFour instance = new ConnectFour();
        instance.wipeBoard();
        
        //---Gets player names
        System.out.println("Player 1: What is your name?");
        Scanner input = new Scanner(System.in);
        String player1Name = input.nextLine();
        
        System.out.println("Player 2: What is your name?");
        input = new Scanner(System.in);
        String player2Name = input.nextLine();
        
        //---Declares variable for player namse in ConnectFour class
        instance.playerNames(player1Name, player2Name);
        //---Game playing while loop
    while (instance.getWinner().contentEquals("No winner yet"))
    {
         
         System.out.println("Please choose a column " + instance.getCurrentPlayerName() + ":");
         String output = input.nextLine();
         instance.makeMove(output);
    }
    
         System.out.println(instance.getWinner());
         System.out.println("Would you like to play again?");
     
     String output = input.nextLine();
     if (instance.newGame(output))
     {
         playGame();
         //Start new game
     }
     else
     {
         System.out.println("Thank you for playing");
     }
         
    }
}

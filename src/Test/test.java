/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;
import connectfour.ConnectFour;
import java.util.Scanner;

/**
 *
 * @author colleen-reynolds
 */
public class test {
    int answer = 0;
     public static void main(String[] args) {
         
         
         ConnectFour instance = new ConnectFour();
         instance.wipeBoard();


    
    while (instance.getWinner().contentEquals("No winner yet"))
    {
         Scanner input = new Scanner(System.in);
         System.out.println("Please choose a column " + instance.getCurrentPlayer() + ":");
         String output = input.nextLine();
         int answer = 0;
       
         instance.makeMove(output);
    }
    
         System.out.println(instance.getWinner());
    
    
    
     }
    
}

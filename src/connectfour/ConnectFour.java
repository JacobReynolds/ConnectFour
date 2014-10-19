/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connectfour;

import java.util.Scanner;
import java.util.ArrayList;

public class ConnectFour {
    int currentplayer = 0;
    int board[][] = new int[7][6];
//    Scanner scan = new Scanner(System.in);
//    String column = scan.nextLine();
//    int newColumn = Integer.parseInt(column);
    
    public void printBoard()
    {
        for (int i = 0; i < board[0].length; i++) 
        {
            for (int j = 0; j < board.length; j++) 
            {
                System.out.print(board[j][i]);
            }
            System.out.println();
           
        }
    }
   
    public void wipeBoard()
    {
        for (int i = 0; i < board.length; i++) 
        {
            for (int j = 0; j < board[i].length; j++) 
            {
                board[i][j] = 2;
            }
        }
    }
    
    public String getCurrentPlayer()
    {
        String answer;
        if (currentplayer == 0)
        {
            return "Red";
        }
        else 
        {
            return "Blue";
        }
                    
        }
    
    public String getWinner()
    {
        String winner = "";
        int countRedh = 0;
        int countBlueh = 0;

        boolean redWins = false;
        boolean blueWins = false;
                
//        
        //---Checking for horizontal winner
        for (int y = 0; y < 6; y++) 
        {
            for (int x = 0; x < 7; x++) 
            {
            if (board[x][y] == 0)
                    {
                      countRedh += 1;  
                      countBlueh = 0;
                    }
            if (board[x][y] == 1)
            {
                countRedh = 0;
                countBlueh += 1;
            }
            if (board[x][y] == 2)
            {
                countRedh = 0;
                countBlueh = 0;
            }
            
            if (countBlueh == 4 && countRedh == 4)
            {
                redWins = true;
                blueWins = true;
            }
            
            if (countBlueh == 4)
            {
                blueWins = true;
            }
            if (countRedh == 4)
            {
                redWins = true;
            }
            }
        }
        
        //---Checking for vertical winner
        for (int x = 0; x < 7; x++) 
        {
            for (int y = 0; y < 6; y++) 
            {
            if (board[x][y] == 0)
                    {
                      countRedh += 1;  
                      countBlueh = 0;
                    }
            if (board[x][y] == 1)
            {
                countRedh = 0;
                countBlueh += 1;
            }
            if (board[x][y] == 2)
            {
                countRedh = 0;
                countBlueh = 0;
            }
            
            if (countBlueh == 4 && countRedh == 4)
            {
                redWins = true;
                blueWins = true;
            }
            
            if (countBlueh == 4)
            {
                blueWins = true;
            }
            if (countRedh == 4)
            {
                redWins = true;
            }
            }
        }
        
        //---Checking for diagonal(Top left) winner
        for (int y = 0; y < 3; y++) 
        {
            for (int x = 0; x < 4; x++) 
            {
            if (board[x][y] == 0 && board[x + 1][y + 1] == 0 && board[x + 2][y + 2] == 0 && board[x + 3][y + 3] == 0)
                    {
                      countRedh += 4;  
                      countBlueh = 0;
                    }
            if (board[x][y] == 1 && board[x + 1][y + 1] == 1 && board[x + 2][y + 2] == 1 && board[x + 3][y + 3] == 1)
            {
                countRedh = 0;
                countBlueh += 4;
            }
            if (board[x][y] == 2)
            {
                countRedh = 0;
                countBlueh = 0;
            }
            
            if (countBlueh == 4 && countRedh == 4)
            {
                redWins = true;
                blueWins = true;
            }
            
            if (countBlueh == 4)
            {
                blueWins = true;
            }
            if (countRedh == 4)
            {
                redWins = true;
            }
            }
        }
        
        //---Checking for diagonal(Top right) winner
        for (int y = 0; y < 3; y++) 
        {
            for (int x = 6; x > 2; x--) 
            {
            if (board[x][y] == 0 && board[x - 1][y + 1] == 0 && board[x - 2][y + 2] == 0 && board[x - 3][y + 3] == 0)
                    {
                      countRedh += 4;  
                      countBlueh = 0;
                    }
            if (board[x][y] == 1 && board[x - 1][y + 1] == 1 && board[x - 2][y + 2] == 1 && board[x - 3][y + 3] == 1)
            {
                countRedh = 0;
                countBlueh += 4;
            }
            if (board[x][y] == 2)
            {
                countRedh = 0;
                countBlueh = 0;
            }
            
            if (countBlueh == 4 && countRedh == 4)
            {
                redWins = true;
                blueWins = true;
            }
            
            if (countBlueh == 4)
            {
                blueWins = true;
            }
            if (countRedh == 4)
            {
                redWins = true;
            }
            }
        }
        
        
        //---Checking for diagonal(Bottom left) winner
         for (int y = 5; y > 2; y--) 
        {
            for (int x = 0; x < 4; x++) 
            {
            if (board[x][y] == 0 && board[x + 1][y - 1] == 0 && board[x + 2][y - 2] == 0 && board[x + 3][y - 3] == 0)
                    {
                      countRedh += 4;  
                      countBlueh = 0;
                    }
            if (board[x][y] == 1 && board[x + 1][y - 1] == 1 && board[x + 2][y - 2] == 1 && board[x + 3][y - 3] == 1)
            {
                countRedh = 0;
                countBlueh += 4;
            }
            if (board[x][y] == 2)
            {
                countRedh = 0;
                countBlueh = 0;
            }
            
            if (countBlueh == 4 && countRedh == 4)
            {
                redWins = true;
                blueWins = true;
            }
            
            if (countBlueh == 4)
            {
                blueWins = true;
            }
            if (countRedh == 4)
            {
                redWins = true;
            }
            }
        }
         
         
        //---Checking for diagonal(Bottom right) winner
         for (int y = 5; y > 2; y--) 
        {
            for (int x = 6; x > 3; x--) 
            {
            if (board[x][y] == 0 && board[x - 1][y - 1] == 0 && board[x - 2][y - 2] == 0 && board[x - 3][y - 3] == 0)
                    {
                      countRedh += 4;  
                      countBlueh = 0;
                    }
            if (board[x][y] == 1 && board[x - 1][y - 1] == 1 && board[x - 2][y - 2] == 1 && board[x - 3][y - 3] == 1)
            {
                countRedh = 0;
                countBlueh += 4;
            }
            if (board[x][y] == 2)
            {
                countRedh = 0;
                countBlueh = 0;
            }
            
            if (countBlueh == 4 && countRedh == 4)
            {
                redWins = true;
                blueWins = true;
            }
            
            if (countBlueh == 4)
            {
                blueWins = true;
            }
            if (countRedh == 4)
            {
                redWins = true;
            }
            }
        }

        
        //---Winner output
        if (redWins && blueWins)
        {
            System.out.println("It's a tie!  What?!");
            return "";
        }
        if (blueWins)
        {
            return "Congratulations Blue you won!";
        }
        if (redWins)
        {
            return "Congratulation Red you won!";
        }
        else 
        {
            return "No winner yet";    
        }
    }
    
    public boolean isFull(int[][] list)
            {
                boolean answer = true;
                for (int i = 0; i < list.length; i++) 
                {
                    for (int j = 0; j < list[0].length; j++) 
                    {
                        int number = list[i][j];
                        if (number == 2)
                        {
                            answer = false;
                        }

                    }
                }
                System.out.println(answer);
                return answer;
 
            }
    public boolean isOver()
    {
        boolean answer = false;
        if (getWinner() != null)
        {
            
        }
        return answer;
    }
            
    public void makeMove(String columnStringIndex)
    {
        //---Assures input is a integer and valid column
         if (!columnStringIndex.contentEquals("0") && !columnStringIndex.contentEquals("1") && 
             !columnStringIndex.contentEquals("2") && !columnStringIndex.contentEquals("3") && 
             !columnStringIndex.contentEquals("4") && !columnStringIndex.contentEquals("5") && 
             !columnStringIndex.contentEquals("6"))
         {
             System.out.println("Invalid input");
         }
         else
         {
        int columnIndex = Integer.parseInt(columnStringIndex);
        
        //---Checks to make sure piece is not already taken
        if (board[columnIndex][0] != 2)
            {
                System.out.println("Invalid entry");
                return;
            }
        //---Places piece on board
        for (int i = 0; i < board[0].length ; i++) 
        {
            
            int row = board[columnIndex][i];
            
            if (row == 0 || row == 1)
            {
                if (this.currentplayer == 0)
                {
                board[columnIndex][i - 1] = 0;
                currentplayer = 1;
                break;
                }
                else
                {
                board[columnIndex][i - 1] = 1;   
                currentplayer = 0;
                break;
                }
            }
            else if (i == board[0].length - 1)
                {
                    if (this.currentplayer == 0)
                {
                board[columnIndex][i] = 0;
                currentplayer = 1;
                break;
                }
                else
                {
                board[columnIndex][i] = 1;  
                currentplayer = 0;
                break;
                }
                }
            
        }
        
        printBoard();
         }
    }
        
        
    }
    
    
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connectfour;


public class ConnectFour {
    protected int currentplayer = 0;
    private final String board[][] = new String[7][6];
    protected String player1Name, player2Name;
    
    //---Prints board for visual output
    private void printBoard()
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
    
    //---Creates player name
    protected void playerNames(String player1, String player2)
    {
        player1Name = player1;
        player2Name = player2;
    }
    
    //---Returns current players name
    protected String getCurrentPlayerName()
    {
        if (currentplayer == 0)
        {
            return player1Name;
        }
        else
        {
            return player2Name;
        }
    }
    
    //---Wipes/Creates the board for a new game
    protected void wipeBoard()
    {
        for (int i = 0; i < board.length; i++) 
        {
            for (int j = 0; j < board[i].length; j++) 
            {
                board[i][j] = "O";
            }
        }
    }
    
    
    protected String getWinner()
    {
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
            if (board[x][y].contentEquals("R"))
                    {
                      countRedh += 1;  
                      countBlueh = 0;
                    }
            if (board[x][y].contentEquals("B"))
            {
                countRedh = 0;
                countBlueh += 1;
            }
            if (board[x][y].contentEquals("O"))
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
            if (board[x][y].contentEquals("R"))
                    {
                      countRedh += 1;  
                      countBlueh = 0;
                    }
            if (board[x][y].contentEquals("B"))
            {
                countRedh = 0;
                countBlueh += 1;
            }
            if (board[x][y].contentEquals("O"))
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
            if (board[x][y].contentEquals("R") && board[x + 1][y + 1].contentEquals("R")
               && board[x + 2][y + 2].contentEquals("R") && board[x + 3][y + 3].contentEquals("R"))
                    {
                      countRedh += 4;  
                      countBlueh = 0;
                    }
            if (board[x][y].contentEquals("B") && board[x + 1][y + 1].contentEquals("B")
               && board[x + 2][y + 2].contentEquals("B") && board[x + 3][y + 3].contentEquals("B"))
            {
                countRedh = 0;
                countBlueh += 4;
            }
            if (board[x][y].contentEquals("O"))
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
            if (board[x][y].contentEquals("R") && board[x - 1][y + 1].contentEquals("R")
               && board[x - 2][y + 2].contentEquals("R") && board[x - 3][y + 3].contentEquals("R"))
                    {
                      countRedh += 4;  
                      countBlueh = 0;
                    }
            if (board[x][y].contentEquals("B") && board[x - 1][y + 1].contentEquals("B")
               && board[x - 2][y + 2].contentEquals("B") && board[x - 3][y + 3].contentEquals("B"))
            {
                countRedh = 0;
                countBlueh += 4;
            }
            if (board[x][y].contentEquals("O"))
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
    
    private boolean isFull(int[][] list)
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
   
            
    protected void makeMove(String columnStringIndex)
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
        if (!board[columnIndex][0].contentEquals("O"))
            {
                System.out.println("Invalid entry");
                return;
            }
        //---Places piece on board
        for (int i = 0; i < board[0].length ; i++) 
        {
            String row = board[columnIndex][i];
            if (row.contentEquals("R") || row.contentEquals("B"))
            {
                if (this.currentplayer == 0)
                {
                board[columnIndex][i - 1] = "R";
                currentplayer = 1;
                break;
                }
                else
                {
                board[columnIndex][i - 1] = "B";   
                currentplayer = 0;
                break;
                }
            }
            else if (i == board[0].length - 1)
                {
                    if (this.currentplayer == 0)
                {
                board[columnIndex][i] = "R";
                currentplayer = 1;
                break;
                }
                else
                {
                board[columnIndex][i] = "B";  
                currentplayer = 0;
                break;
                }
                }
            
        }
        printBoard();
        }
    }   
    //---Will strip a string of anything but letters and make lower case.
    private String clean(String aString)
    {
       String newString = new String();
        for (int i = 0; i < aString.length(); i++) {
            char aCharacter = aString.charAt(i);
            if (Character.isLetter(aCharacter))
            {
             newString += aCharacter;   
            }
            else
            {
            }
            
        }
        return newString.toLowerCase();
        
    }
        
    protected boolean newGame(String response)
    {
        boolean answer = false;
        String cleanedResponse = clean(response);
        if (cleanedResponse.contains("yes")||cleanedResponse.contentEquals("y"))
        {
            answer = true;
        }
        return answer;
    }
    }
    
    
    


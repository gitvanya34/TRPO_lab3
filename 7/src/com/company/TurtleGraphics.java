package com.company;

public class TurtleGraphics {
    private String[][] board = new String[15][15];
    private Position penPosition=new Position(7,7);
    private String cellChar=".";
    private String coloredCellChar="o";
    private String penChar="X";

    public void clearBoard()
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
               board[i][j]=cellChar;
            }
        }
        board[penPosition.getX()][penPosition.getY()] = penChar;
    }
    public void OutBoard()
    {
        for(String[] brd: board)
        {
            System.out.println();
            for(String elem: brd)
            {
                System.out.printf("%-4s",elem);
            }
        }
        System.out.printf("\n============================================\n");
    }
    public void  movePenUp()
    {   if(penPosition.getX()-1>=0)
        {
            board[penPosition.getX()][penPosition.getY()] = coloredCellChar;
            penPosition.Step(-1, 0);
            board[penPosition.getX()][penPosition.getY()] = penChar;
        }
        else{ System.out.printf("Уперся в стену\n");}
    }
    public void movePenDown()
    {
        if(penPosition.getX()+1<=board.length-1)
        {
            board[penPosition.getX()][penPosition.getY()]=coloredCellChar;
            penPosition.Step(1,0);
            board[penPosition.getX()][penPosition.getY()]=penChar;
        }

        else{ System.out.printf("Уперся в стену\n");}
    }
    public void movePenLeft()
    {    if(penPosition.getY()-1>=0)
        {
            board[penPosition.getX()][penPosition.getY()] = coloredCellChar;
            penPosition.Step(0, -1);
            board[penPosition.getX()][penPosition.getY()] = penChar;
        }
        else{ System.out.printf("Уперся в стену\n");}
    }
    public void movePenRight()
    {    if(penPosition.getY()+1<=board.length-1)
            {
                board[penPosition.getX()][penPosition.getY()]=coloredCellChar;
                penPosition.Step(0,1);
                board[penPosition.getX()][penPosition.getY()]=penChar;
            }
        else{ System.out.printf("Уперся в стену\n");}
    }
   public void  movePen (String dir,int lenght)
   {
       for(int i=0;i<lenght;i++)
       {
                   switch (dir)
                   {
                       case "u":
                                 movePenUp();
                           break;
                       case "d":
                           movePenDown();
                           break;
                       case "r":
                           movePenRight();
                           break;
                       case "l":
                           movePenLeft();
                           break;
                   }
       }
       OutBoard();
   }

}


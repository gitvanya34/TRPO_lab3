package com.company;

public class Position {
    private int x;
    private int y;
    public Position()
    {
        int x;
        int y;
    }
    public Position(int i, int i1)
    {
        x = i;
        y=i1;
    }


    public void  Step(int i, int i1)
    {
//            Position p = new Position(x + i, y + i1);
////            x = p.x;
////            y = p.y;
        x+=i;
        y+=i1;
    }


    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}

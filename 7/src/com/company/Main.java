package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        TurtleGraphics test =new TurtleGraphics();

        test.clearBoard();
        test.OutBoard();
        System.out.printf("Введите направление и кол-во шагов (u 1)\n");
              while (true)
              {
                  try{
                  test.movePen(in.next(),in.nextInt());
                  } catch (Exception ex)
                  {
                      System.out.printf("Неверная комманда\n");
                  }
              }

    }

}

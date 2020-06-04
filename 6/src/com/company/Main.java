package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);


        Clock clock1 =new Clock();
        int key = 0;

        while (key != 10) {

            System.out.printf("" +
                    "1)Конструктор по умолчанию (12:0:0)\n" +
                    "2) Конструктор с параметрами (часы минуты секунды)\n"+
                    "3) Конструктор с одним параметром в секундах\n"+
                    "4) Добавление одной секунды к clock(tick)\n"+
                    "5) Убавление одной секунды от clock (tickDown)\n"+
                    "6) Сложение времени(addClock) \n"+
                    "7) Разница времени (subtractClock)\n"+

                    "" );
            key = in.nextInt();
            switch (key)
            {
                case 1:
                    clock1 =new Clock();
                    clock1.printClock();
                    break;
                case 2:
                    System.out.printf("Введите время через пробел(час минута секунда):");
                    clock1=new Clock(in.nextInt(),in.nextInt(),in.nextInt());
                    clock1.printClock();
                    break;
                case 3:
                    System.out.printf("Введите время в секундах: ");
                    clock1=new Clock(in.nextInt());
                    clock1.printClock();
                    break;
                case 4:
                    System.out.printf("Введите время через пробел(час минута секунда):");
              //      clock1=new Clock(in.nextInt(),in.nextInt(),in.nextInt());
                    clock1.printClock();
                    clock1.Tick();
                    clock1.printClock();
                    break;
                case 5:
                    System.out.printf("Введите время через пробел(час минута секунда):");
                 //   clock1=new Clock(in.nextInt(),in.nextInt(),in.nextInt());
                    clock1.printClock();
                    clock1.TickDown();
                    clock1.printClock();
                    break;
                case 6:
                    System.out.printf("Введите время1 для сложения :");

                  //  clock1=new Clock(in.nextInt(),in.nextInt(),in.nextInt());
                    System.out.printf("Введите время2 для сложения :");
                    clock1.AddClock(in.nextInt(),in.nextInt(),in.nextInt());
                    clock1.printClock();
                    break;
                case 7:
                    System.out.printf("Введите время1 для нахождения разницы  :");
                 //   clock1=new Clock(in.nextInt(),in.nextInt(),in.nextInt());
                    System.out.printf("Введите время2 для нахождения разницы ");
                    clock1.SubtractClock(in.nextInt(),in.nextInt(),in.nextInt());
                    clock1.printClock();
                    break;
            }

        }
    }
}

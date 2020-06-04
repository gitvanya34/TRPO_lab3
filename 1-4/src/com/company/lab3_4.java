package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lab3_4 {

    public static void main(String[] args) {
        try
        {
            int RingCount = 0;

            ArrayList<Integer> array1 = new ArrayList<>();
            ArrayList<Integer> array2 = new ArrayList<>();
            ArrayList<Integer> array3 = new ArrayList<>();
            Scanner in = new Scanner(System.in);
            System.out.print("Введите размер башни: ");
            RingCount  = in.nextInt();
            ArrayInit(array1, RingCount);
            OutRing(array1,array2,array3,RingCount);



            int n=0;

            if(RingCount%2 ==0)
            {
                SwapRingEven(array1,array2,array3, RingCount,n);
            }
            else if(RingCount%2 ==1)
            {
                SwapRingOdd(array1,array2,array3, RingCount,n);
            }
        } catch (Exception ex)
        {
            System.out.printf("Неверная комманда\n");
        }

    }
    public static void SwapRingEven(ArrayList<Integer> array1, ArrayList<Integer> array2, ArrayList<Integer> array3,int RingCount,int n)
    {
        while(true) {
/////////////////////////////////////1

            if (array2.isEmpty()) {
                array2.add(0, array1.get(0));
                array1.remove(0);
            } else if (array1.isEmpty()) {
                array1.add(0, array2.get(0));
                array2.remove(0);
            } else if (!array2.isEmpty() && !array1.isEmpty()) {
                if (array1.get(0) < array2.get(0)) {
                    array2.add(0, array1.get(0));
                    array1.remove(0);
                } else if (array2.get(0) < array1.get(0)) {
                    array1.add(0, array2.get(0));
                    array2.remove(0);
                }

            }

            n++;

            OutRing(array1, array2, array3, RingCount);

/////////////////////////////////////2
            if (array3.isEmpty()) {
                array3.add(0, array1.get(0));
                array1.remove(0);
            } else if (array1.isEmpty()) {
                array1.add(0, array3.get(0));
                array3.remove(0);
            } else if (!array3.isEmpty()) {
                if (array1.get(0) < array3.get(0)) {
                    array3.add(0, array1.get(0));
                    array1.remove(0);
                } else if (array3.get(0) < array1.get(0)) {
                    array1.add(0, array3.get(0));
                    array3.remove(0);
                }
            }
            n++;
            OutRing(array1, array2, array3, RingCount);


/////////////////////////////////////////////3
            if (array3.isEmpty()) {
                array3.add(0, array2.get(0));
                array2.remove(0);
            } else if (array2.isEmpty()) {
                array2.add(0, array3.get(0));
                array3.remove(0);
            } else if (!array2.isEmpty() && !array3.isEmpty()) {
                if (array2.get(0) < array3.get(0)) {
                    array3.add(0, array2.get(0));
                    array2.remove(0);
                } else if (array3.get(0) < array2.get(0)) {
                    array2.add(0, array3.get(0));
                    array3.remove(0);
                }
            }
            n++;


            OutRing(array1, array2, array3, RingCount);

            if (array1.isEmpty() && array2.isEmpty())//проверка и выход из рекурсии
            {
                System.out.printf("Пирамида собрана за  " + n + " шагов");
                return;
            }
        }

    }
    public static void SwapRingOdd(ArrayList<Integer> array1, ArrayList<Integer> array2, ArrayList<Integer> array3,int RingCount,int n)
    {
        while(true) {
/////////////////////////////////////1

            if (array3.isEmpty()) {
                array3.add(0, array1.get(0));
                array1.remove(0);
            } else if (array1.isEmpty()) {
                array1.add(0, array3.get(0));
                array3.remove(0);
            } else if (!array1.isEmpty() && !array3.isEmpty()) {
                if (array1.get(0) < array3.get(0)) {
                    array3.add(0, array1.get(0));
                    array1.remove(0);
                } else if (array3.get(0) < array1.get(0)) {
                    array1.add(0, array3.get(0));
                    array3.remove(0);
                }
            }
            n++;
            OutRing(array1, array2, array3, RingCount);


            if (array1.isEmpty() && array2.isEmpty())//проверка и выход из рекурсии
            {
                System.out.printf("Пирамида собрана за  " + n + " шагов");
                return;
            }


/////////////////////////////////////2
            if (array2.isEmpty()) {
                array2.add(0, array1.get(0));
                array1.remove(0);
            } else if (array1.isEmpty()) {
                array1.add(0, array2.get(0));
                array2.remove(0);
            } else if (!array2.isEmpty() && !array1.isEmpty()) {
                if (array1.get(0) < array2.get(0)) {
                    array2.add(0, array1.get(0));
                    array1.remove(0);
                } else if (array2.get(0) < array1.get(0)) {
                    array1.add(0, array2.get(0));
                    array2.remove(0);
                }

            }

            n++;

            OutRing(array1, array2, array3, RingCount);


/////////////////////////////////////////////3
            if (array3.isEmpty()) {
                array3.add(0, array2.get(0));
                array2.remove(0);
            } else if (array2.isEmpty()) {
                array2.add(0, array3.get(0));
                array3.remove(0);
            } else if (array2.isEmpty() == false && array3.isEmpty() == false) {
                if (array2.get(0) < array3.get(0)) {
                    array3.add(0, array2.get(0));
                    array2.remove(0);
                } else if (array3.get(0) < array2.get(0)) {
                    array2.add(0, array3.get(0));
                    array3.remove(0);
                }
            }
            n++;


            OutRing(array1, array2, array3, RingCount);


        }
    }
    public static void ArrayInit(ArrayList<Integer> array1, int RingCount)
    {
        for(int i=0;i<RingCount;i++)
        {
            array1.add(0,i+1);
        }
        Collections.reverse(array1);
    }
    public static void OutRing(ArrayList<Integer> array1, ArrayList<Integer> array2, ArrayList<Integer> array3,int RingCount)
    {
        String value1;
        String  value2;
        String  value3;
        System.out.printf( "________________________________________\n" );
        for(int i=0; i<RingCount;i++)
        {

            if(array1.size()>i)
                value1 = "=".repeat(array1.get(i));
            else{value1=""; }

            if(array2.size()>i)
                value2 = "=".repeat(array2.get(i));
            else{value2=""; }

            if(array3.size()>i)
                value3 = "=".repeat(array3.get(i));
            else{value3=""; }

            System.out.printf( "%-10s %-10s %-10s \n",value1,value2,value3 );
        }

    }
}


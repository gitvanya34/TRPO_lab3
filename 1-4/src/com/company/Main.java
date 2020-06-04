package com.company;

import java.util.Arrays;
import java.util.Scanner;
///////////////lab 3.1
public class Main
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Введите размер массива: ");

            int size = in.nextInt();
          //  System.out.println("");
            System.out.print("Введите число для поиска: ");
            int search = in.nextInt();

            int[] array = new int[size];

            for (int i=0;i<size ;i++)
            {
                array[i]=(int) (Math.random()* 100);
                System.out.print(array[i]+" ");
            }
            System.out.println(" ");
            SearchInc(array,search);
            SearchBi(array,search);
        } catch (Exception ex)
        {
            System.out.printf("Неверная комманда\n");
        }
    }
    public static void SearchInc(int[] array , int search)//последовательный
    {    long time = System.nanoTime();
        boolean result=false;
        for (int arr : array)
        {
            if(arr==search)
                {
                    result=true;
                    break;
                }
        }
        time = System.nanoTime() - time;
        System.out.println("Последовательный поиск: "+result+" "+time+" nS");

    }
    public static void SearchBi(int[] array , int search)//бинарный
    {
        Arrays.sort(array);
        long time = System.nanoTime();


        int firstIndex = 0;
        int lastIndex = array.length - 1;

        // условие прекращения (элемент не представлен)
        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (array[middleIndex] == search) {
                {  time = System.nanoTime() - time;
                    System.out.println("Бинарный поиск: true "+time+" ns");
                   return;
                }
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (array[middleIndex] < search)
                firstIndex = middleIndex + 1;

                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (array[middleIndex] >search)
                lastIndex = middleIndex - 1;

        }
        time = System.nanoTime() - time;
        System.out.println("Бинарный поиск: false  "+time+" ns");

    }

}


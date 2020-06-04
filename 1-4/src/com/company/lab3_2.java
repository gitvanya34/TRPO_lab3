package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class lab3_2
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
            try{
                int size = in.nextInt();
                int[] array = new int[size];
                int[] array2 = new int[size];
                int[] array3 = new int[size];
                RandomArray(array);
                System.arraycopy(array, 0, array2, 0, array.length);
                System.arraycopy(array, 0, array3, 0, array.length);

                SortBubble(array);
                SortBi(array2);



                long time = System.nanoTime();
                Arrays.sort(array3);
                time = System.nanoTime() - time;

                System.out.println("\nСортировка встроенная:  "+time+" ns");
                OutArray( array);
//проверка
                if(Arrays.equals(array3, array2)&& Arrays.equals(array3, array2))
                 {System.out.println("\nМассивы отсортированы верно");}
                else{System.out.println("\nМассивы отсортированы неверно");}
               }
                catch (Exception ex)
                {
                    System.out.printf("Неверная комманда\n");
                }





    }
    public static void RandomArray(int[] array)
    {
        for (int i=0;i<array.length ;i++)
        {
            array[i]=(int) (Math.random()* 100);
        }
        System.out.println("\n Рандомное заполнение:");
        OutArray( array);
    }

    public static void OutArray(int[] array)
    {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
    public static void  SortBubble(int[] arr)//последовательный
    {
        int[] array = arr;
        long time = System.nanoTime();

        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }

        time = System.nanoTime() - time;
        System.out.println("\n Сортировка пузырьком "+time+" nS");
        OutArray( array);

    }

    public static void SortBi(int[] arr )//последовательный
    {
        int[] array = arr;
        long time = System.nanoTime();

        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            int value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }

        time = System.nanoTime() - time;
        System.out.println("\nСортировка вставками:  "+time+" ns");
        OutArray( array);
    }

}



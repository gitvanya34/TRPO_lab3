package com.company;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try
        {
            Scanner in = new Scanner(System.in);
            ArrayList<Author> author = new ArrayList<Author>();
            ArrayList<Book> book = new ArrayList<Book>();
            book.add(new Book("Developing Java Software","Russel","Winder",79.75));
            book.get(0).OutBook();
        } catch (Exception ex)
        {
            System.out.printf("Неверная комманда\n");
        }

    }
}


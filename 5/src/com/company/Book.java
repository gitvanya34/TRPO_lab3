package com.company;

public class Book {
    private String name;
    private  Author author ;
    private double price;


    public Book(String n, String fn,String ln , double p)
    {
        name=n;
        author =new Author(fn,ln);
        price=p;
    }
    public void OutBook()
    {
        System.out.printf("Название книги:  %-10s\n", name );
        System.out.printf("Автор: ") ;author.OutAuthor();
        System.out.printf("Цена:  %-10s\n", price );
    }
}
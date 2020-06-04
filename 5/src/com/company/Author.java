package com.company;

public class Author {
    private String firstName;
    private String lastName;


    public Author(String fn, String ln) {
        firstName =fn;
        lastName=ln;
    }
    public Author()
    {

    }


    public void OutAuthor()
    {
        System.out.printf("%-5s %-5s\n", firstName,lastName);
    }
}

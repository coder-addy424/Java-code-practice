package com.nit.abstract_class;

public class BookTester
{
    public static void main(String[] args) {
        MyBook mb=new MyBook("A tale of two Cities");
        String title=mb.getTitle();
        System.out.println("Title of the Book is : "+title);
        mb.setTitle("Creativity");
        String title1=mb.getTitle();
        System.out.println("Title of the Book is : "+title1);




    }
}

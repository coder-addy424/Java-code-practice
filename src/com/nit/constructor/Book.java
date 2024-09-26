package com.nit.constructor;

public class Book {
    String title;
    String author;
    double price;
    double discountPercentage;
    double discountPrice;

    public Book(String title,String author, double price) {
        if(this.title.equals("")||this.author.equals("")||this.price<=0)
        {
            System.err.println("Invalid Data");
            System.out.println("Enter Valid Data");
        }
        else {
            this.title = title;
            this.author = author;
            this.price = price;
        }

    }
    public void applyDiscount(double discountPercentage)
    {
        if(discountPercentage<=0)
        {
            System.err.println("Invalid Discount");
        }
        this.discountPercentage=discountPercentage;
       this.discountPrice=(this.price-(discountPercentage*this.price)/100);

    }

    public void printDetails()
    {
            System.out.println("Title: " + this.title);
            System.out.println("Author : " + this.author);
            System.out.println("The Price of Book is : " + this.price);
            System.out.println("After "+this.discountPercentage+" % Discount Price of Book is : " + discountPrice);
    }

}

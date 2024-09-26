package com.nit.constructor;

public class PrintBook {
    public static void main(String[] args) {
        Book b=new Book("","Swami Vivekananda",400);
        b.applyDiscount(50);
        b.printDetails();
    }
}

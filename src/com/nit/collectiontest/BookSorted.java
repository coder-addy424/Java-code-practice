package com.nit.collectiontest;

import java.util.TreeMap;
import java.util.TreeSet;

public class BookSorted
{
    public static void main(String[] args) {

        TreeSet<Book> b=new TreeSet<>();
        b.add(new Book("Pain","Swami Vivekananda"));
        b.add(new Book("Atomic Habit","James Bond"));
        b.add(new Book("Love Story","Nirmal Maharana"));
        b.add(new Book("Jung","Aditya Kashyap"));
        b.add(new Book("Power","RudraAnand"));
        System.err.println("Sorted According to BookName in Alphabetical order");
        b.forEach(System.out::println);
    }
}

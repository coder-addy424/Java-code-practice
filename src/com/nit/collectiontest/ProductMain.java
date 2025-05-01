package com.nit.collectiontest;

import java.util.*;

public class ProductMain
{
    public static void main(String[] args) {
        TreeSet<Product> p=new TreeSet<>((a, b)->a.pId().compareTo(b.pId()));
        System.out.println("Sort based on the pid in ascending order");
        p.add(new Product(222,"LapTop"));
        p.add(new Product(111,"Mobile"));
        p.add(new Product(333,"Camera"));
        p.add(new Product(444,"HardDisk"));
        p.forEach(System.out::println);

        TreeSet<Product> p1=new TreeSet<>((a, b)->b.pId().compareTo(a.pId()));
        System.out.println("Sort based on the pid in descending order");
        p1.add(new Product(222,"LapTop"));
        p1.add(new Product(111,"Mobile"));
        p1.add(new Product(333,"Camera"));
        p1.add(new Product(444,"HardDisk"));
        p1.forEach(System.out::println);

        TreeSet<Product> p3=new TreeSet<>((a, b)->a.pName().compareTo(b.pName()));
        System.out.println("Sort based on the Name in ascending order");
        p3.add(new Product(222,"LapTop"));
        p3.add(new Product(111,"Mobile"));
        p3.add(new Product(333,"Camera"));
        p3.add(new Product(444,"HardDisk"));
        p3.forEach(System.out::println);

        TreeSet<Product> p4=new TreeSet<>((a, b)->b.pName().compareTo(a.pName()));
        System.out.println("Sort based on the Name in Descending order");
        p4.add(new Product(222,"LapTop"));
        p4.add(new Product(111,"Mobile"));
        p4.add(new Product(333,"Camera"));
        p4.add(new Product(444,"HardDisk"));
        p4.forEach(System.out::println);



    }
}

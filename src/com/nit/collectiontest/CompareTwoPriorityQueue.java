package com.nit.collectiontest;

import java.util.PriorityQueue;

public class CompareTwoPriorityQueue
{
    public static void main(String[] args) {
        PriorityQueue<String> pq= new PriorityQueue<>();
        pq.add("Black");
        pq.add("Red");
        pq.add("White");
        pq.add("Green");
        System.out.println(pq);
        System.out.println();
        PriorityQueue<String> pq1= new PriorityQueue<>();
        pq1.add("Pink");
        pq1.add("Black");
        pq1.add("White");
        pq1.add("Red");
        pq1.add("Blue");
        System.out.println(pq1);


        for(String i:pq)
        {
            if(pq1.contains(i))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}

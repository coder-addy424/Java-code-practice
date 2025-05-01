package com.nit.collectiontest;

import java.util.PriorityQueue;

public class MergeTwoPriorityQueue
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
        pq1.addAll(pq);
        System.out.println();
        System.out.println(pq1);
    }
}

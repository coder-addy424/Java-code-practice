package com.nit.collectiontest;

import java.util.PriorityQueue;

public class PriorityQueues
{
    public static void main(String[] args) {
        PriorityQueue<String> pq= new PriorityQueue<>();
        pq.add("Red");
        pq.add("Orange");
        pq.add("White");
        pq.add("Black");
        pq.add("Green");
        pq.forEach(System.out::println);
    }
}

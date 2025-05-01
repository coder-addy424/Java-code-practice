package com.nit.collectiontest;

import java.util.List;

public class Tester
{
    public static void main(String[] args)
    {
        String []arr={"Adi","raj"};
       List<String> convertToList= ArrayToList.converToList(arr);
       convertToList.forEach(System.out::println);

    }
}

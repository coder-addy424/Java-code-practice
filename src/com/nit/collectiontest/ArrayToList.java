package com.nit.collectiontest;
import java.util.ArrayList;
import java.util.List;
public class ArrayToList
{
    public static List<String> converToList(String[] inputArray)
    {
        List<String> list=new ArrayList<>();
        for(int i=0;i<inputArray.length;i++)
        {
            list.add(inputArray[i]);
        }
        return list;
    }
}

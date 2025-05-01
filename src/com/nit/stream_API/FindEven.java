package com.nit.stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindEven
{
    public static void main(String[] args) {
        List<Integer> listOfNumber= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        listOfNumber.stream().filter(num->num%2==0).forEach(System.out::println);

    }
}

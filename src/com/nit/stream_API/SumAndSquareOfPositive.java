package com.nit.stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumAndSquareOfPositive {
    public static void main(String[] args) {
        int sum = 0;
        List<Integer> listOfNumber = Arrays.asList(-3, 2, -5, 6, -1, 4);
        int squareOfNum = listOfNumber.stream().filter(num -> num > 0).mapToInt(num -> num * num).sum();
        System.out.println(squareOfNum);


    }
}

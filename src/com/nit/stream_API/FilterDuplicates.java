package com.nit.stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterDuplicates
{
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,2,3,1);
        List<Integer> nums1=new ArrayList<>();
       nums.stream().filter(num-> nums1.contains(num)).map(num->nums1.add(num));
    }
}

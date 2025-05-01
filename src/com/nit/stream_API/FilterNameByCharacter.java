package com.nit.stream_API;

import java.util.Arrays;
import java.util.List;

public class FilterNameByCharacter
{
    public static void main(String[] args) {
        List<String> name= Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        name.stream().filter(names->names.length()<5).sorted().limit(2).forEach(System.out::println);
    }
}

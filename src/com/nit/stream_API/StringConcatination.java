package com.nit.stream_API;

import java.util.stream.Stream;

public class StringConcatination
{
    public static void main(String[] args) {
       Stream<String> s= Stream.of("Hello", "", "World", " ", "from", " ", "Java", "!");
        s.forEach(System.out::print);

    }
}

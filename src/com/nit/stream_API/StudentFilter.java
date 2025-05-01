package com.nit.stream_API;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentFilter
{
    public static void main(String[] args)
    {
        List<Student> students =  new ArrayList<>();
        students.add(new Student("Alice","Java"));
        students.add(new Student("Bob","Python"));
        students.add(new Student("Charlie","Java"));
        students.add(new Student("David","C++"));
        students.add(new Student("Eve","JavaScript"));

        students.stream().filter(student -> student.sCourse().equalsIgnoreCase("Java")).forEach(sName-> System.out.println(sName.sName()));
    }
}

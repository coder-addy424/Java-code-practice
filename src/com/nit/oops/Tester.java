package com.nit.oops;

import java.util.Scanner;

public class Tester {
    //ELC Class
    public static void main(String[] args) {
        Student addy=new Student();
        Scanner in=new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int studentID=in.nextInt();

        System.out.print("Enter Student Name: ");
        String studentName=in.nextLine();
        studentName=in.nextLine();

        System.out.print("Enter Student Marks: ");
        int studMarks=in.nextInt();

        addy.setStudentData(studentID,studentName,studMarks);
        addy.calculateGrade();
        System.out.println(addy.displayDetails());

    }
}

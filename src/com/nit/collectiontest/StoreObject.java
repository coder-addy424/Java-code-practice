package com.nit.collectiontest;

import java.io.*;
import java.util.*;

public class StoreObject
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many Student Object you Want :");
        int store=sc.nextInt();
        List<Student> studentList=new ArrayList<>();
        for(int i=1;i<=store;i++)
        {
            studentList.add(Student.getStudentObject());
        }
        var fos=new FileOutputStream("D:\\Student_File\\Student_File.txt");
        var oos=new ObjectOutputStream(fos);
      //Serialization
        try(fos;oos)
        {
            oos.writeObject(studentList);
            System.out.println("Student data Stored Successfully");
        }
        //De-Serialization
        var fis=new FileInputStream("D:\\Student_File\\Student_File.txt");
        var ois=new ObjectInputStream(fis);
        try(fis;ois) {
            ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
            System.out.println(list);
        } catch (Exception e)
        {
            System.out.println(e);
        }

    }
}

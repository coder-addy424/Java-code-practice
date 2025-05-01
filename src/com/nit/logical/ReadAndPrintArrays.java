package com.nit.logical;

import java.util.Scanner;

public class ReadAndPrintArrays
{
    public static int [] read(int arr[])
    {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Size of Arrays : ");
            int size = sc.nextInt();

            arr = new int[size];
            System.out.print("Enter the elements of Array : ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
        return arr;
    }
    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Elements are stored at arr["+i+"]="+arr[i]);
        }
    }

    public static void main(String[] args)
    {
        int arr[]=null;
        int arr1[]=read(null);
        print(arr1);
    }

}

package com.nit.logical;

import java.util.Vector;

public class Array_Question2
{
    public static void main(String[] args) {
       /* int arr[]={21,43,56,76,87};
        int arr1[]={21,23,55,67,88};
       boolean res= compareTwoArray(arr,arr1);
        System.out.println(res);

        int arr[]={1,2,3};
        int res[]=reverseArray(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }

        int [] arr={3,2,8};
        int res=largerElement(arr);
        System.out.println(res);*/


    }

    public static boolean compareTwoArray(int arr[],int arr1[])
    {
        int index=0;
        int len=arr.length-1;
        int len1=arr1.length-1;
        boolean result=false;
        if((arr.length>0&&arr1.length>0) && (arr[index]==arr1[index] || arr[len]==arr1[len1]))
        {
            result=true;
        }
        return result;
    }

    public static int[] leftRotate(int arr[])
    {
        int start=0,end=arr.length-1,temp=0;
        if(start<=end)
        {
            temp=arr[start];
            arr[start]=arr[start+1];
            arr[start+1]=temp;
            start++;
            end--;

            temp=arr[start];
            arr[start]=arr[start+1];
            arr[start+1]=temp;

        }
        return arr;
    }

    public static int[] reverseArray(int arr[])
    {
        int start=0,end=arr.length-1,temp=0;
        if(start<=end)
        {
            temp=arr[start];
            arr[start]=arr[start+1];
            arr[start+1]=temp;
            start++;
            end--;

            temp=arr[start];
            arr[start]=arr[start+1];
            arr[start+1]=temp;
            start++;
            end--;

            temp=arr[end];
            arr[end]=arr[end+1];
            arr[end+1]=temp;
        }
        return arr;
    }

    public static int largerElement(int arr[])
    {
        int start=0,end=arr.length-1,large=arr[0];
        if(arr[start]<arr[start+1])
        {
            large=arr[start+1];
            if(arr[start]<arr[end])
            {
                large=arr[end];

            }
           else if(large<arr[end])
            {
                large=arr[end];

            }

        }
        return large;
    }

    public static int replaceLargerElement(int arr[])
    {
        int start=0,end=arr.length-1,large=arr[0];
        int arr1[]=new int[3];
        if(arr[start]<arr[start+1])
        {
            large=arr[start+1];
            if(large<arr[end])
            {
                large=arr[end];

            }
            else
            {
                return large;
            }
        }
        return large;
    }
}

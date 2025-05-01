package com.nit.logical;

public class Array_Question1
{
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 15};
       // boolean res=checkNumber(arr);
       // System.out.println("Is 15 available or not : "+res);
        boolean res1=checkEqualNumber(arr);
        System.out.println("First Index and last index are same : "+res1);
    }
        public static boolean checkNumber(int arr[])
        {
        int  index=0;
        boolean result=false;
        if(arr.length>0&&((arr[index]==15)|| (arr[arr.length-1]==15)))
        {
            result=true;
        }
        return result;
        }

    public static boolean checkEqualNumber(int arr[])
    {
        int index=0;
        boolean result=false;
        if (arr.length>0 && (arr[index]==15 && arr[arr.length-1]==15))
        {
            result=true;
        }
        return result;
    }
}

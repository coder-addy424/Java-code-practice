package com.nit.student;

public class Arrayreverse {
    public static void main(String[] args)
    {
        int[] a={6,78,9,0,4,3};
        int[] res=usingTwoPointers(a);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }

    // O(n) time complexity
    // 0(n) space complexity
  /*  private static int[] methodArrayReverse(int[] a)
    {
        int z=0;
        int[] rev = new int[a.length];
        for(int i=a.length-1;i>=0;i--)
        {
            rev[z]=a[i];
            z++;
        }

        return rev;
    }*/


    private static int[] usingTwoPointers(int[] a)
    {

            int  fi=0,li=a.length-1, t = 0;
        while(li>fi)
        {
            t = a[fi];
            a[fi] = a[li];
            a[li] = t;
            fi++;
            li--;
           
        }

        return a;
    }
}


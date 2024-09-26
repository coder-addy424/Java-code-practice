package hackerRankQuestions;

import java.sql.SQLOutput;

public class FindSecMax {
    private static int secondMaximum(int a[])
    {
        int max=a[0],max1=0;
        for(int i=1;i<a.length;i++)
        {
            if(max<a[i])
            {
            max=a[i];
            }
        }
        for(int i=0;i<a.length-1;i++)
        {
            if(max>a[i]&&a[i]>a[i+1])
            {
                max1=a[i];
            }
        }
        return max1;
    }
    public static void main(String []args)
    {
        int a[] = {-6,-9,-4,-10,-2};
        int res=secondMaximum(a);
        System.out.println("Second maximum number of this array is "+res);
    }



}

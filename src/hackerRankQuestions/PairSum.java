package hackerRankQuestions;

public class PairSum {
    public static void main(String[] args)
    {
        int a[]={10,3,2,4,31,42};

        int number=13;
        boolean res=sum(a,number);
        System.out.println(res);
    }

    public static boolean sum(int[] a, int number)
    {
        // O(n^2)
        for(int i=0;i<a.length;i++) // n
        {
            for(int j=i+1;j<a.length;j++) // n
            {
                System.out.println(a[i] + " " + a[j]);
                if( a[i]+a[j]==number)
                {
                    return true;
                }
            }

        }
        return false;
    }


}

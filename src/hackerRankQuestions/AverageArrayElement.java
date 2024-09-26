package hackerRankQuestions;

public class AverageArrayElement {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5,6,7},i;
        float Avg= getAvgOfArrayElements(a);
        System.out.println(Avg);
    }

    private static float getAvgOfArrayElements(int[] a) {
        int i;
        int sum=0;
        float Avg;
        for(i=0;i<a.length;i++)
        {
            sum= (sum+a[i]);
        }
        Avg=sum/a.length;


       return Avg;
    }
}

package arrayQuestion;

public class SumArrayElements {
    public static void main(String[] args)
    {
        int a[]={1,3,5,7,9,11,13,15,17,19,21,23,67},i;
        int sum= getSumOfArrayElements(a);
        System.out.println("sum :" +sum);
    }

    private static int getSumOfArrayElements(int[] a)
    {
        int i,sum=0;
        for( i=0;i<=a.length-1;i++)
        {
            sum=sum+a[i];
        }
        return sum;
    }
}

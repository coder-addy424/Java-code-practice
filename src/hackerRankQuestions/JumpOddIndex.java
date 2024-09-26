package hackerRankQuestions;

public class JumpOddIndex {
    public static void main(String[] args)
    {
        int a[]={1,3,5,7,9,11,13,15,17,19,21,23,67},i;
        for(i=1;i<=a.length-1;i=i+2)
        {
            System.out.println("Element at odd index are : " +a[i]);
        }
    }
}

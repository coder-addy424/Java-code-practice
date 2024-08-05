public class JumpTwoIndex {
    public static void main(String[] args)
    {
        int a[]={1,3,5,7,9,11,13,15,17,19,21,23,67},i;
        for(i=0;i<=a.length-1;i=i+3)
        {
                System.out.println(a[i]);
        }
    }
}

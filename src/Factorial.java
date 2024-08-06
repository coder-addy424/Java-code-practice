public class Factorial {
    public static void main(String args[])
    {
        int result=numfactorial(7);
        System.out.println("factorial of this number is "+result);
    }


    private static int numfactorial(int number)
    {
        int n = 1,i;
        for(i=1;i<=number;i++)
        {
            n=n*i;
        }
        return n;
    }
}

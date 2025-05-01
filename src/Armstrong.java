import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args)
    {

        int check=0;
        int arm=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int n=sc.nextInt();
        int n2=n;
        int n1=n;
        while(n2>0)
        {
            check++;
            n2=n2/10;
        }
        while(n1>0)
        {
           int n3=n1%10;
            arm =  arm + (int)Math.pow(n3 ,check);
            n1=n1/10;
        }
        if(arm==n)
        {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not a Armstrong");
        }
    }
}

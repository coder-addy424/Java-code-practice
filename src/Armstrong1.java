import java.util.*;
public class Armstrong1
{
    public static void main(String [] args)
    {
        int check=0;
        int arm=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n=sc.nextInt();
        int n2=n;
        int n3=n;
        while(n2>0)
        {
            check++;
            n2/=10;
        }
        while(n3>0)
        {
            int n1=n3%10;
            arm = arm+(int)Math.pow(n1,check);
            n3/=10;
        }
        if(n==arm)
        {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }
}

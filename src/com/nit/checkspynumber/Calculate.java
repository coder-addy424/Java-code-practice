package com.nit.checkspynumber;

public class Calculate {
    public static void checkSpyNum(int num)
    {
        int sum=0,product=1,num1=num;
        while(num1>0)
        {
            int rem=num1%10;
            sum=sum+rem;
            product=product*rem;
            num1=num1/10;
        }
        if(sum==product)
        {
            System.out.println(num+" is a Spy Number ");
        }
        else
        {
            System.out.println(num+" is not a spy");
        }
    }
}

package com.nit.logical;
import java.util.*;
public class BankingApplication
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        final int limit=5;
        int currentBalance = 0,count=0,index=0;
        int deposit[]=new int[limit];
        String option=null;
        do {
            if(limit>count) {
                System.out.println("Welcome to our BankApplication");
                System.out.print("Enter how much money u want to deposit : ");
                deposit[index] = sc.nextInt();
                currentBalance += deposit[index];
                count++;
                index++;
                System.out.println("Press yes for deposit more money");
                System.out.println("press No for exit");
                option=sc.next();
            }
            else
            {
                System.err.println("Your Transaction limit Exceed!! ");
                break;
            }
        }while(option.equalsIgnoreCase("yes"));

        System.out.println("Bank Transaction!!!");
        System.out.println("Your current balance is : "+currentBalance);
        System.out.println("Transaction History is : ");
        for(int i=0;i<count;i++)
        {
            System.out.println(deposit[i]+" ");
        }

        System.out.println("ThankYou for using my website");
    }
}

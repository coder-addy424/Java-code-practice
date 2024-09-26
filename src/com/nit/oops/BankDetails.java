package com.nit.oops;
import java.text.DecimalFormat;


public class BankDetails {
    private long customerAccountNumber;
    private double currentBalance;
    private String bankCustomerName;
    private static String bankName="CENTRAL BANK OF INDIA";
    private static String bankAddress="BHAGWANPUR , MUZAFFARPUR";
    private static String bankIFSCCode="CBIN0283384";
    DecimalFormat df = new DecimalFormat("00.00");

    public void setDetails(long customerAccountNumber,int currentBalance,String bankCustomerName)
    {
        this.bankCustomerName=bankCustomerName;
        this.currentBalance=currentBalance;
        this.customerAccountNumber=customerAccountNumber;
    }
    public void withdrawl(double amount)
    {

        this.currentBalance= this.currentBalance-amount;

        if(amount<=1000) {
            System.out.println("Insufficient Balance");
            System.out.println("Maintain MinimumBalance");
        }

        else
        {
            System.out.println("Transaction SuccessFull");

        }
    }
    public void deposit(double amount)
    {
        if(amount<=0)
        {
            System.err.println("Amount Can't be deposit");
        }
        else
        {
            this.currentBalance = this.currentBalance + amount;
        }

    }
    public void currBalance()
    {

        System.out.println("Available Balance : "+df.format(this.currentBalance));
    }

    public String toString()
    {
        return "Bank Details [ CustomerAccountNumber = "+customerAccountNumber+", Bank Customer Name ="+bankCustomerName+", CurrentBalance ="+df.format(currentBalance)+",BankName ="+bankName+", BankAddress ="+bankAddress+",BankIFSCCode ="+bankIFSCCode+"]";
    }


}

package com.nit.constructor;

public class LoanDetails {
    private double principal;
    private double interestRate;
    private int durationMonths;
    public LoanDetails(double principal,double interestRate,int durationMonths)
    {
        if(principal<=0||interestRate<=0||durationMonths<=0)
        {
            System.err.println("Error");
        }
        else {
            this.principal = principal;
            this.interestRate = interestRate;
            this.durationMonths = durationMonths;
        }
    }



}

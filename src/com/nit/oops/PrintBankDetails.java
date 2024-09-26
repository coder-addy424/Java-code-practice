package com.nit.oops;

public class PrintBankDetails {
    public static void main(String[] args) {
        BankDetails bd=new BankDetails();
        bd.setDetails(330944235,1000,"Aditya Ranjan");
       // bd.withdrawl(1000);
       bd.deposit(10000);
        bd.currBalance();
        System.out.println(bd);

    }
}

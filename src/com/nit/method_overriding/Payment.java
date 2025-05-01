package com.nit.method_overriding;

public class Payment {
    public void processPayment() {
        System.out.println("Processing payment");
    }
}
    class CreditCardPayment extends Payment
    {
        @Override
        public void processPayment() {
            System.out.println("Processing credit card payment");
        }
    }
    class PayPalPayment extends Payment
    {
        @Override
        public void processPayment() {
            System.out.println("Processing PayPal payment");
        }
    }
    class BankTransferPayment extends Payment
    {
        @Override
        public void processPayment() {
            System.out.println("Processing bank transfer payment");
        }
    }


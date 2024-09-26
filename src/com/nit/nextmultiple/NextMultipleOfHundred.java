package com.nit.nextmultiple;

public class NextMultipleOfHundred {
    public static int getNextMultipleOfHundred(int number){
        if(number/10<10 || number/10==10)
        {
            int num1=number/10;
            return (num1+1)*10;
        }
        if(number/10>10)
        {
            int num1=number/10;
            int num2=num1/10;
            return (num2+1)*100;
        }
        return 0;
    }
}

package com.nit.roundsum;

public class RoundedSum {
    public static int sumOfRoundedValues(int a,int b,int c)
    {
      if(a%10>=5)
      {
          int num=a%10;
          int num2= (num+1)*10;
      }
      if(a%10<5)
      {
          int num3=(a%10)*10;
      }

        if(b%10>=5)
        {
            int num1=a%10;
            int num4= (num1+1)*10;
        }
        if(b%10<5)
        {
            int num5=(a%10)*10;
        }

        if(c%10>=5)
        {
            int num6=a%10;
            int num7= (num6+1)*10;
        }
        if(c%10<5)
        {
            int num8=(a%10)*10;
        }
       return 0;
    }
}

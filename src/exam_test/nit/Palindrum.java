package exam_test.nit;

import java.util.Arrays;
import java.util.function.Predicate;

public class Palindrum  {
    public static void main(String[] args) {
        int numbers[] = {134, 677, 145, 343};
        PalindrumCheck p=number -> {
            int reverse=0,original=number,reminder;
            while(number>0)
            {
                reminder=number%10;
                reverse=reverse*10+reminder;
                number=number/10;
            }
            return original==reverse;
        };
        System.out.println("Palindrum are :");
        Arrays.stream(numbers).filter(p::isPalindrum).forEach(System.out::println);
    }
    @FunctionalInterface
     interface PalindrumCheck
    {
        boolean isPalindrum(int number);
    }








}

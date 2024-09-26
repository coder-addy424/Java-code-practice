package hackerRankQuestions;

import java.util.*;

public class RangePrime {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        int f = 0;
        int s = 0;
        do {
            System.out.println("Enter first input of the range of prime number");
            f = in.nextInt();
            System.out.println("Enter Second input of the range of prime number");
            s = in.nextInt();
            if (f > s) {
                System.out.println("Enter valid input");
                continue;
            }

            for (int i = f; i <= s; i++) {
                if (i == 2) {
                    System.out.print(i + " ");
                }
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }while (s < f);

    }
}

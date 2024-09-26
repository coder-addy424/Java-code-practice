package hackerRankQuestions;

import java.util.Scanner;
public class FindMaxNumberOfArray {
    public static void main(String[] args) {
        int i, n, max =-65535;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = sc.nextInt();
        int a[] = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (max < a[i])
            {
                max = a[i];
            }

        }
        System.out.println("maximum number is : " + max);



    }
}

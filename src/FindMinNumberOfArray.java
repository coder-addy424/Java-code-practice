import java.util.Scanner;

public class FindMinNumberOfArray {
    public static void main(String[] args) {
        int i, n, min =65536;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = sc.nextInt();
        int a[] = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (min > a[i])
            {
                min= a[i];
            }

        }
        System.out.println("minimum number is : " + min);



    }
}

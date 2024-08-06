/*
find peak element
 */

public class FindMaxNum {
    public static void main(String[] args) {
        //int a[] = {20, 6, 12, 8, 10, 19, 1, 25};
        int[] a = {};
        int res = MaxNum(a);
        System.out.println("Maximum number is " + res);
    }


    public static int MaxNum(int[] a) {
        // edge case
        if (a.length == 0) {
            return 0;
        }

        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        return max;
    }
}
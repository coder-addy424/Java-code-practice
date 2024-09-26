package arrayQuestion;

import java.util.*;

public class NonRepeatingArray {
    private static int findNonRepeatingArray(int[] a) {
        int i;
        int j;

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    break;
                }
                if (j == a.length - 1) {
                    return a[i];
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int a[] = {1,12,12, 19,7, 2, 2,6, 1, 22, 22, 67, 36,7,67,36, 99};
        int res = findNonRepeatingArray(a);

        System.out.println(res);

    }
}


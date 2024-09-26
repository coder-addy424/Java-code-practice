package twoPointer;

public class Usingpointer {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] rotation = rotationOneArray(a, k);
        for (int i = 0; i < rotation.length; i++) {
            System.out.print(rotation[i] + " ");
        }
    }


    private static int[] rotationOneArray(int a[], int k) {

        int n = a.length;
        int modifiedK = k % n;
        for (int i = 0; i < modifiedK; i++) {
            int temp = a[n - 1];
            for (int j = n-1; j > 0; j--) {
                a[j ] = a[j-1];
            }
            a[0]=temp;
        }
        return a;
    }

}

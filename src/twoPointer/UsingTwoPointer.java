package twoPointer;

import java.util.Arrays;

public class UsingTwoPointer {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rightRotation(a,k);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    private static void rightRotation(int a[], int k){
        int len = a.length;
        int modifiedK = k % len;

        if(modifiedK == 0){
            return;
        }

        // rotate the whole array using 2 pointers algorithm
        reverse(0, len-1, a);

        // rotate the first modifiedK elements
        reverse(0, modifiedK - 1, a);

        // rotate the n-k elements
        reverse(modifiedK, len - 1, a);
    }

    private static void reverse(int start, int end, int[] a){
        while(start <= end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }
    }



}

package binarySearch;

public class Occurance {
    public static void main(String[] args) {
        int arr[] = {4, 5, 5, 6, 6, 7, 7, 7, 7, 7, 9, 9};
        int n = arr.length;
        int x = 7;
        int result1 = findLast(arr, n, x);
        if (result1 == -1) {
            System.out.println(x + " is not Available in this array");
            return;
        }
        System.out.println(result1);
        int result2 = findFirst(arr, n, x);
        System.out.println(result2);
        int check = result1 + result2;
        if (check == 2) {
            System.out.println("Only one element Available in Array");
            if (x == arr[0]) {
                System.out.println(x + " is available 1 time");
            } else {
                System.out.println(" But it is not " + x + " ....The Number is " + arr[0]);
            }

        } else if (check == -2) {
            System.out.println("Array is Empty");
        } else {
            int lastResult = (result1 - result2) + 1;
            System.out.println(x + " are available " + lastResult + " times");
        }
    }

     

    public static int findLast(int arr[], int n, int target) {
        int start = 0;
        int end = n - 1;
        int mid = (start + end) / 2;
        int res1 = -1;

        while (start <= end) {
            if (arr[mid] == target) {
                res1 = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return res1;
    }

    public static int findFirst(int arr[], int n, int target) {

        int start = 0;
        int end = n - 1;
        int mid = (start + end) / 2;
        int res2 = -1;

        while (start <= end) {
            if (arr[mid] == target) {
                res2 = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return res2;
    }

}

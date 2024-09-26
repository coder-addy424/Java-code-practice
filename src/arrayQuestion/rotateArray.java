package arrayQuestion;

public class rotateArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int k = 121;
        int[] rotation = arrayRotation(a, k);
        for (int i = 0; i < rotation.length; i++) {
            System.out.print(rotation[i] + " ");
        }
    }

    private static int[] arrayRotation(int[] a, int k) {
        int n = a.length;
        int pointer = n - (k % n);
        int rev[] = new int[a.length];

        int index = 0;
        //this loop will work for according to given k and if k is 2 then the element will rotate with last two elements, and it will  come starting 2 index and other element will  slide according to k
        for (int i = pointer; i < n; i++) {
            rev[index] = a[i];
            index++;
        }
        //This loop will work to arranging the other elements after the given k elements will store at his place
        //int order=n-pointer;
        for (int j = 0; j < pointer; j++) {
            rev[index] = a[j];
            index++;
        }
        return rev;
    }


}

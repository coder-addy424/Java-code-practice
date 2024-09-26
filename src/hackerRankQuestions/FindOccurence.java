package hackerRankQuestions;

public class FindOccurence {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9, 11, 1, 11, 3, 1}, i, num = 11;
        int Occ = FindOccurences(a, num);
        System.out.println("number found " + Occ + " times");
    }

    public static int FindOccurences(int[] a, int num) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                count++;
            }
        }
        return count;
    }

}
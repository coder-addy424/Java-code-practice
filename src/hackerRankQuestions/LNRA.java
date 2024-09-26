package hackerRankQuestions;

public class LNRA {
    public static void main(String[] args) {
        int a[] = {1, 1, 2, 3, 4, 5, 6, 6, 7, 7};
        int res = lastnonrepeat(a);

        System.out.println(res);
    }


    public static int lastnonrepeat(int a[]) {

        for (int i = a.length - 1; i >= 0; i--) {

            for (int j = a.length - 1; j >= 0; j--) {
                if (i != j && a[i] == a[j]) {

                    break;
                }
                if (j == 0 && a[i] != a[j]) {
                    return a[i];
                }
            }


        }
        return 0;
    }
}

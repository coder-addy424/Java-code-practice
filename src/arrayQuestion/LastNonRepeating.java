package arrayQuestion;

public class LastNonRepeating {
    private static int findLastNonRepeatingArray(int[] a) {
        int nonrep = -1;
        for (int i = 0; i < a.length; i++) {

            boolean isNonRepetable = false;

            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    isNonRepetable = true;
                    break;
                }
            }

            if (!isNonRepetable) {
                nonrep = a[i];
            }
        }

        return nonrep;
    }

    public static void main(String[] args) {
        int a[] = {19, 22, 22, 67, 36, 67, 99, 121, 121, 322, 322, 435};
        //int[] a = {1,2,2,3,3,4,4,5,5};
        int res = findLastNonRepeatingArray(a);

        System.out.println(res);

    }
}

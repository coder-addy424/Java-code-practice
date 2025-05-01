public class Check {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,6,8,9,10,12};
        //        {1,2,3,4,5,6,7}
        //        {0,1,2,3,4,5,6}
        int pow = 1;
        for (int i = 1; i <= arr.length; i++) {
            if (isPrime(i)) {
                int power2 = arr[i - 1] * pow;
                System.out.print(power2 + " ");
                if (pow == 1) {
                    pow = 2;
                } else {
                    pow = pow * 2;
                }
            }
        }
    }




    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num == 2) {
                return true;
            }
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;

    }
}

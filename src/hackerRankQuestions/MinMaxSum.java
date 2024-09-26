package hackerRankQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinMaxSum {
    public static void main(String [] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);

        Collections.sort(arr);

        long min = arr.get(0);
        long max = arr.get(arr.size() - 1);
        long maxSum = 0;
        long minSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i > 0) {
                maxSum += arr.get(i);
            }
            if (i < 4) {
                minSum += arr.get(i);
            }
        }

        System.out.print(minSum + " " + maxSum);
    }
    }






    


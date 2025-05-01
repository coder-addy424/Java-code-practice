package com.nit.logical;

import java.util.Arrays;
import java.util.Scanner;

public class String_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String : ");
        String s1 = sc.nextLine();
        System.out.print("Enter Second String : ");
        String s2 = sc.nextLine();
        int result = compareTwoString(s1, s2);
        System.out.println(result);

    }

    public static int compareTwoString(String s1, String s2) {
        char[] s3 = s1.toCharArray();// r e a  d => a d e r
        char[] s4 = s2.toCharArray();// d e a r => a d e r
        Arrays.sort(s3);
        Arrays.sort(s4);
        int i = 0, j = 0;
        while (i < s3.length && j < s4.length) {
            if (s3[i] == s4[j]) {
                i++;
                j++;
            } else if (s3[i] > s4[j]) {
                j++;
            } else {
                return 0;
            }
        }
        return i == s3.length ? 1 : 0;
    }
}

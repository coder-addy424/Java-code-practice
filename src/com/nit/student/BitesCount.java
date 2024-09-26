package com.nit.student;

import java.util.ArrayList;
import java.util.List;

public class BitesCount {
    public static void main(String[] args) {
       /*

      --- birthday----

       List<Integer> a = List.of(1, 1, 1, 1, 1, 9, 1);
        int total_bites = birthday(a, 10, 2);
        System.out.println(total_bites);
        */

        /*
        ------gradingStudents---------

       List<Integer> l = List.of(73,67,38,33);
        List<Integer> result=gradingStudents(l);
        for(int i=0;i< result.size();i++)
        {
            System.out.print(result.get(i) + " ");
        }
        */




      // -----breakingRecords-----

       List<Integer> report = List.of(3,4,21,36,10,28,35,5,42);
        List<Integer> score=breakingRecords(report);
        for(int i=0;i<score.size();i++)
        {
            System.out.print(score.get(i) +" ");
        }

        


    }

    public static List<Integer> gradingStudents(List<Integer> grades)
    {

        List<Integer> res = new ArrayList<>();
        for(int i=0;i<grades.size();i++)
        {
            int Modifie=0,Round=0,Range=0,output=0;
            Modifie=Modifie +(5- (grades.get(i) % 5));
            Round=Round+(grades.get(i) + Modifie);
            Range= Round-grades.get(i);
            if(Range<3 && grades.get(i)>=38)
            {
                output=output+Round;

            }
            else{
                output=output+grades.get(i);
            }

            res.add(output);
        }
        return res;
    }



    public static List<Integer> breakingRecords(List<Integer> scores)
    {
        int low= scores.get(0),high=scores.get(0),min=0,max=0;
        for(int i =1;i<scores.size();i++)
        {
            if(high<scores.get(i))
            {
                high=scores.get(i);
                max++;
            }
            if(low>scores.get(i))
            {
                low=scores.get(i);
                min++;
            }


        }
        List<Integer> result=new ArrayList<>();
        result.add(max);
        result.add(min);

        return result;
    }



    //O(n*m)
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int bites = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum = sum + s.get(j);
            }
            if (sum == d) {
                bites++;
            }
        }
        return bites;
    }
    // try to solve using 2 pointers approach
}

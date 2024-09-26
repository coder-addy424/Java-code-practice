package hackerRankQuestions;

import java.util.ArrayList;

import java.util.List;

public class TripletsCompare {

    public static List<Integer> compareTriplets(List<Integer> alien, List<Integer> bob)
    {

        int firstResult=0,secondResult=0;
        int j=0;
        for(int i=0; i < alien.size();i++)
        {
            for(;j<=i;j++)
            {
                if(alien.get(i)> bob.get(j))
                {
                   firstResult++;
                }
                else if(alien.get(i)< bob.get(j))
                {
                    secondResult++;
                }
            }
        }
        List<Integer> result=new ArrayList<>();
           result.add(0,firstResult);
           result.add(1,secondResult);
           return result;
    }

    public static void main(String[] args) {
      List<Integer> alien=new ArrayList<>();
        alien.add(20);
        alien.add(32);
        alien.add(34);
        List<Integer> bob=new ArrayList<>();
        bob.add(67);
        bob.add(43);
        bob.add(56);

        List<Integer> printResult=new ArrayList<>();

        printResult=compareTriplets(alien,bob);
        System.out.print(printResult +" ");


    }


}

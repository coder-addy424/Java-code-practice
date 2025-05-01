package hackerRankQuestions;

import java.util.ArrayList;

public class DivisibleSumPair {
    public static void main(String[] args)
    {
        int k=5;
        int pair=0;
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(0,1);
        ar.add(1,2);
        ar.add(2,3);
        ar.add(3,4);
        ar.add(4,5);
        ar.add(5,6);
        for(int i=0;i<ar.size();i++)
        {
            for(int j=0;j<ar.size();j++)
            {
                if(i<j)
                {
                    if((ar.get(i)+ar.get(j))%k==0)
                    {
                        pair++;
                    }
                }
            }
        }
        System.out.println(pair);
    }
}

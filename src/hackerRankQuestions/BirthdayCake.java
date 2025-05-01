package hackerRankQuestions;

import java.util.ArrayList;

public class BirthdayCake {
    public static void main(String[] args) {
        ArrayList<Integer> candles=new ArrayList<>();
        candles.add(0,4);
        candles.add(1,4);
        candles.add(2,1);
        candles.add(3,3);
        int big=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<candles.size();i++)
        {
            if(candles.get(i)>big)
            {
                big= candles.get(i);
            }
        }
        for(int i=0;i< candles.size();i++)
        {
            if(big==candles.get(i))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}

package arrayQuestion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayPartition {

    public static List<Integer> quickSort(List<Integer> arr)
    {
       // 4 5 3 7 2
        int firstValue= arr.get(0);
        LinkedList<Integer> element=new LinkedList<>();
        element.add(firstValue);
        for(int i=1;i<arr.size();i++)
        {

            if(arr.get(i)>firstValue)
            {
                element.addLast(arr.get(i));
            }
            else if(arr.get(i)<firstValue)
            {
                element.addFirst(arr.get(i));
            }

        }
        return element;
    }

    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(3);
        arr.add(7);
        arr.add(2);
        LinkedList<Integer> result=new LinkedList<>();
        result= (LinkedList<Integer>) quickSort(arr);
        System.out.println(result +" ");

    }
}

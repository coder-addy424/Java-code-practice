package hashmap;

import java.util.HashMap;

public class NonRepeat {
    public static void main(String[] args) {
        int a[]={1,1,2,3,4,7,5,2,3,4};
        int n=a.length;
        int result=findNonRepeat(a,n);
        if(result==0)
        {
            System.out.println("NO any Non-Repeating number in this Array");
        }
        else
            System.out.println(result+" is the First Non-Repeating Number ");

    }

   public static int findNonRepeat(int a[],int n)
    {
        HashMap<Integer,Integer> check=new HashMap<>();
        for(int i=0;i<n;i++)
        {
          if(check.containsKey(a[i]))
          {
              check.put(a[i],check.get(a[i])+1);
          }
          else
          {
              check.put(a[i], 1);
          }
        }

        for(int i=0;i<n;i++)
        {
            if(check.get(a[i])==1)
            {
                return a[i];
            }

        }
        return 0;
    }
}

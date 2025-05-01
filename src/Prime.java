public class Prime {
    public static void main(String[] args) {
        int range=1000;
     for(int i=2;i<=range;i++)
     {
         if(prime(i))
         {
             System.out.print(i+" ");
         }
     }
    }
    public static boolean prime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}

package arrayQuestion;

public class SortArray {
    public static void main(String[] args) {
     // int a[] = {1, 3, 4, 5, 5, 6, 1};

        int[] a = {1,2,3,4,4};
      // int[] a= {5,4,3,2,1};
       int key=3;
     //   boolean res = isAscending(a);
       boolean rev = isDescending(a);
      // int linear=linearsearch(a,key);
       int binary=binarySearch(a,key);
        System.out.println(key+" is found at "+binary+" index");


    }

    private static boolean isAscending(int[] a)
    {

        boolean isSortedAsc = true;
        for (int i = 0; i < a.length - 1; i++)
        {
            if (a[i] > a[i + 1] )
            {
                isSortedAsc = false;
                break;
            }
        }
        if(isSortedAsc){
            System.out.println("sorted in ascending order");

        }
        else
        {
            System.out.println("Array is not in ascending order it is descending order");
            return false;
        }

        return true;
    }

    private static boolean isDescending(int [] a)
    {
        boolean isSortedDes=true;
        for(int j=0;j<a.length-1;j++)
        {
            if(a[j]<a[j+1])
            {
                isSortedDes=false;
                break;
            }
        }
        if(isSortedDes)
        {
            System.out.println("Sorted in descending order");
            return true;
        }
        else {
            System.out.println("Array is not in descending order array is ascending order");
        }
        return false;
    }

    public static int linearsearch(int a[],int key)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
               return i;
            }
        }
       return 0;
    }

    public static int binarySearch(int a[],int key)
    {
        for(int i=0;i<a.length;i++)
        {
            int li=a[0],hi=a.length-1,mi=(li+hi)/2;

            while(li<=hi)
            {
                if (a[mi]==key)
                {
                    return mi;
                }
                else if(a[mi]<key)
                {
                    li=mi+1;
                }
                else
                {
                    hi=mi-1;
                }
                mi=(li+hi)/2;
            }
        }


     return 0;
    }
}

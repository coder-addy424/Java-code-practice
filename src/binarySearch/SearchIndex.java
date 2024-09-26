package binarySearch;

public class SearchIndex
{
    public static void main(String[] args)
    {
       int [] arr={5,7,7,8,8,10};
       // int[] arr = {8,8,8,8,8,8};
        int target=8;
        int last=searchLastIndex(arr,target);
        int first=searchFirstIndex(arr,target);
        int [] result=new int[2];
        result[0]=first;
        result[1]=last;
        System.out.print(target+" is Available at ");
        for(int i=0;i< result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
        System.out.print("Index");

    }
/*
     .....O(n).......*/
public static int search(int arr[],int target)
{
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==target)
        {
            return i;
        }
    }
    return 0;
}

                   /* O(log n) */
        public static int searchFirstIndex(int[] arr, int target)
        {
            int start=0;
            int res=0;
            int count=0;
            int end=arr.length-1;
            int mid=(start+end)/2;
            while(start<=end)
            {
                if(arr[mid]==target)
                {
                    res=mid;
                    end=mid-1;
                    count++;
                }
                else if(arr[mid]<target)
                {
                    start=mid+1;
                }
                else {
                    end = mid- 1;
                }
                mid=(start+end)/2;
            }
            return res;
        }

        /* O(log n)*/
        public static int searchLastIndex(int arr[],int target)
        {
            int start=0;
            int res=0;
            int end=arr.length-1;
            int mid=(start+end)/2;
            while(start<=end)
            {
                if(arr[mid]==target)
                {
                    res=mid;
                    start=mid+1;
                }
                else if(arr[mid]<target)
                {
                    start=mid+1;
                }
                else {
                    end = mid- 1;
                }
                mid=(start+end)/2;
            }
            return res;
        }
    }

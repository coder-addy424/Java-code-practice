package binarySearch;

public class findIndex {
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6};
        int target = 0;
        int result=fixIndex(nums,target);
        System.out.println(result);
    }
        public static int fixIndex( int nums[], int target)
        {
            int n=nums.length;
            int start=0;
            int end=n-1;
            int mid=(start+end)/2;
            while(start<=end)
            {
                if(nums[mid]==target)
                {
                    return mid;
                }
                else if(nums[mid]<target)
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;

                }
                mid=(start+end)/2;
            }

            return start;
        }

}

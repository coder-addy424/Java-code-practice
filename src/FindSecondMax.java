public class FindSecondMax
{
    public static void main(String[] args) {
        int [] nums={4,2,6,3,-1,9,8,5};
        int max= Integer.MIN_VALUE;
        int secondMax= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                secondMax=max;
                max=nums[i];
            }
            else if(nums[i]>secondMax && nums[i]!=max)
            {
                secondMax=nums[i];
            }
        }
            System.out.println("Second maximum number in the array is : "+secondMax);

    }
}

package arrayQuestion;

public class FirstRepeatingNumber
{
    public static void main(String[] args) {
        int arr[]={6,3,7,2,3,1,6};
        int res=findFirstRepeatingNumber(arr);
        System.out.println(res+" is the first repeated element present");
    }
    public static int findFirstRepeatingNumber(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    return arr[i];
                }
            }

        }
       return 0;
    }
}

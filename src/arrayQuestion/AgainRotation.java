package arrayQuestion;

public class AgainRotation {
    public static void main(String[] aditya)
    {
        int a[]={1,2,3,4,5,6,7};
        int k = 86;
        leftRotation(a,k);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void leftRotation(int a[],int k)
    {
        int len = a.length;
        int modifiK = k % len;
        if(modifiK==0)
        {
            return ;
        }
        //By using this First,I reversed whole array
        reverse(len-1,0,a);
        //By using this,Rotate First modifiedK elements
        reverse(len-1,len-modifiK,a);
        //By using this,Reverse the array 0-k elements
        reverse(len-modifiK-1,0,a);
    }

    public static void reverse(int start,int end,int a[])
    {
        while(start>=end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start--;
            end++;

        }
    }
}

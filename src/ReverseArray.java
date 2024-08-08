public class ReverseArray {
    public static void main(String []args){
        int[] a={1,4,8,9,14,23};
        System.out.println("Array without Reverse ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("\n");
        int[] res=methodArrayReverse(a);
        System.out.println("Array with Reverse ");
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    private static int[] methodArrayReverse(int[] a)
    {
        int z=0;
        int[] rev = new int[a.length];
        for(int i=a.length-1;i>=0;i--)
        {
            rev[z]=a[i];
            z++;
        }

        return rev;
    }


}

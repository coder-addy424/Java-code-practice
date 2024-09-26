package arrayQuestion;

public class SecondNonRepeatingNumber {
    public static int findsecondnonrepeating(int a[])
    {
        int i,j,c=0;
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length;j++)
            {
                if(i!=j && a[i]==a[j])
                {
                    break;
                }
                if(j==a.length-1)
                {
                    c++;
                }
                if(c==2)
                {
                    return a[i];
                }
            }
        }

        return 0;
    }
    public static void main(String[] args)
    {
        int a[] = {1, 7, 2, 2, 1,22,22,67, 36};
        int res = findsecondnonrepeating(a);

        System.out.println(res);

    }
}

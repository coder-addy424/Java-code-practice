import java.util.*;

class A{
    public void aa(StringBuilder o){
        Deque<Integer> a = new LinkedList<>();
    }

    public void aa(String a){
        System.out.println("bbb");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

class B extends A{
    public static int add(int a, int b){
        System.out.println("B add");
        return a + b;
    }
}
public class StarPrint {
    public static void main(String[] args) {

        A a  = new A();
        //a.aa(null);
        /*
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int s=1;s<=rows-i;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }

         */
    }
}

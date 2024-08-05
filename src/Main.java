

class Test {
    public static void main(String[] args)
    {
        int a[]={10,4,5,6,7};
       int number= 20;
       int res = linearSearch(a, number);
       if(res == -1){
           System.out.println(number + " is not available");
       }else{
           System.out.println(number + " is available at index "+res);
       }
    }

    //access modifier(public, private, protected, default)
    // static or non-static
    // return type
    // function name
    // no of arguments

    private static int linearSearch(int no[], int number) {
        // logic for linear search
        for (int i = 0; i <= no.length - 1; i++)
        {

            if (no[i] == number)
            {
                return i;
            }

        }
        return -1;
    }
}






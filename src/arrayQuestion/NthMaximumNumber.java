package arrayQuestion;

import java.util.Scanner;

public class NthMaximumNumber
{
    public static void main(String[] args) {
    int arr[]={5,1,7,8,6,2};
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the choice of max element : ");
        int userChoiceMaxEle=sc.nextInt();
    int res=findNthMaximumNumber(arr,userChoiceMaxEle);
        System.out.println(res+" is the "+ userChoiceMaxEle+"th max number present in the array ");
    }

    public static int findNthMaximumNumber(int arr[],int userChoiceMaxEle)
    {
        for(int i=0;i< arr.length;i++)
        {
         for(int j=i+1;j< arr.length;j++)
         {
            if(arr[i]<arr[j])
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
         }
        }
        return arr[userChoiceMaxEle-1];
    }
}

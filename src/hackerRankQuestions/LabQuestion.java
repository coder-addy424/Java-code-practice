package hackerRankQuestions;

import java.util.Scanner;
    class LabQuestion
    {
        public static void main(String [] args) {
            Bill();
            LabQuestion.Palindrum(121);
            even(1000);
            naturalSum(100);
            table();
        }

        public static int Bill()
        {
            System.out.println("for four chicken rolls (@ Rs 60 per chicken rolls)");
            System.out.println();
            System.out.println("three vegetable puffs (@ Rs 25 per vegetable puffs");
            System.out.println("There is a special discount of Rs 50");
            System.out.println("first you enter qnt. for roll then puffs");
            Scanner in=new Scanner(System.in);
            System.out.println("How many rolls do you want ");
            int roll=in.nextInt();
            System.out.println("How many Puffs do you want ");
            int  puff = in.nextInt();
            System.out.print("Your Total Bill is With discount of Rs 50 is ");
            int  total=((roll*60)+(puff*50))-50;
            System.out.println(total);

            return total;
        }
        public static void Palindrum(int num)
        {
            int a=num%10;
            int b=num/10;
            int c=b/10;
            if(a==c)
            {
                System.out.println(num+" is palindrum");
            }
            else
            {
                System.out.println(num+" is not a palindrum");
            }
        }

        public static void even(int number)
        {
            for(int i=1;i<=number;i++)
            {
                if(i%2==0) {
                    System.out.print(i + " ");
                }
            }
        }

        public static void naturalSum(int number)
        {
            int sum=0;
            for(int i =1;i<=number;i++)
            {
                sum +=i;
            }
            System.out.println(sum);
        }

        public static void table()
        {
            int result=1,number;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter that number whose table you want ");
            number=sc.nextInt();
            for(int i =1;i<=10;i++)
            {
                result=number*i;
                System.out.println(number+" * "+i+" = "+result);
            }
        }




    }





package hackerRankQuestions;

class Solution
{
        public static void main(String[] args)
        {
            int[] num ={2,7,11,15,17,56};
            int target=32;

            int[] res=twosum(num,target);
            System.out.print("Sum of this number is available at ");
            for (int b=0;b<res.length;b++)
            {
                System.out.print("[" + res[b]+ "]" + " ");
            }
            System.out.println("index");
        }

        public static int[] twosum(int[] num, int target)
        {
            for(int i=0;i<num.length-1;i++)
            {
                for(int j=i+1;j<num.length;j++)
                {
                    if(num[i]+num[j]==target)
                    {
                        return new int[]{i,j};
                    }
                }
            }
            return null;
        }
    }


package hackerRankQuestions;

public class pair {
        public static void main(String [] args)
        {
            int [] arr={10, 20, 20 ,10, 10, 30, 50, 10 ,20};
           int totpair=sockMerchant(arr);
           System.out.print(totpair);

        }
        public static int sockMerchant(int [] arr)
        {
          sortarray(arr);
          int count=0;
          for(int i=0;i<arr.length-1;i++)
          {
              if(arr[i]==arr[i+1])
              {
                  count++;
                  i++;
              }
          }
          return count;
        }
        public static int [] sortarray(int arr[])
        {
            int temp=0;
            for(int i=0;i<arr.length-1;i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            return arr;
            }
        }



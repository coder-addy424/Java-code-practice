package hackerRankQuestions;

public class OccTest {

    public static void main(String[] args) {
        //double d1=convertStringToDouble("10.4","21.4");
        //System.out.println("Multiplication of two Floating number is "+d1);
        // char ch='u';
        //int ascii=findAsciiValue(ch);
        //System.out.println("The ASCII value of "+ch+" is : "+ascii);

        double d1 = 12.12;
        d1++;
        System.out.println(d1);


    }



    public static double convertStringToDouble(String str,String str2)
    {
        double str1=Double.parseDouble(str);
        double str3=Double.parseDouble(str2);
        double d=str1*str3;
        return d;
    }
      public static int findAsciiValue(char ch)
      {
          int i=ch;
          return i;
      }
      
}

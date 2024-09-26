public class Reverse
{
    public static void main(String[] args)
    {
        String s3=CaseChange("aDiTyA","");
        System.out.println(s3);
    }
    public static String CaseChange(String s1, String s2)
    {


        for (int i = 0; i < s1.length(); i++) {
            if (Character.isLowerCase(s1.charAt(i))) {
                s2 = s2 + Character.toUpperCase(s1.charAt(i));
            } else {
                s2 = s2 + Character.toLowerCase(s1.charAt(i));
            }
        }
       return s2;
    }

    public static char[] reverseWithoutExtraMemory(String s1)
    {
        char[] c=s1.toCharArray();

        return c;
    }

}

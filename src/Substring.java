public class Substring
{

    private static String getSubStr(String string)
    {
        StringBuilder stringBuilder = new StringBuilder(string);
        int i = 0;
        int j = 1;

            while (i < stringBuilder.length() && j < stringBuilder.length()) {
                if (stringBuilder.charAt(i) == stringBuilder.charAt(j)) {
                    stringBuilder.deleteCharAt(j);
                    stringBuilder.deleteCharAt(i);


                    i = 0;
                    j = 1;
                } else {
                    i++;
                    j++;
                }
            }

            return stringBuilder.isEmpty() ? "Empty String" : stringBuilder.toString();

    }


    public static void main(String[] args)
    {
        String s = "bababbabb";
        System.out.println(getSubStr(s));
        /*
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                s1 = String.valueOf(s.charAt(i));
                System.out.print(s1);
            } else if (s.charAt(i) == s.charAt(i + 1)) {
                i++;
            } else {
                s1 = String.valueOf(s.charAt(i));
                System.out.print(s1);

            }
        }
        for (int j = 0; j < s1.length() - 1; j++) {
            if (s1.charAt(j) == s1.charAt(j + 1)) {
                System.out.println("Empty String");
            }
        }


        if (s1.length() == 0) {

            System.out.println("Empty String");
        }
        */

    }
}



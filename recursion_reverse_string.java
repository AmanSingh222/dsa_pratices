import java.util.Collections;

public class recursion_reverse_string {
    /*public static String reverse_str(String s)
    {
        if(s==null|| s.length()<=1)
        {
            return s;
        }


        return reverse_str(s.substring(1))+s.charAt(0);


    }*/public static String reverse_str(String str) {

        int n = str.length();

        // Since strings are immutable in java, we are using a char array.
        char [] charArray = str.toCharArray();

        for (int i = 0; i < n / 2; ++i){
            // Swap characters.
            char ch = charArray[i];
            charArray[i] = charArray[n - i - 1];
            charArray[n - i - 1] = ch;
        }

        return String.valueOf(charArray);
    }
    public static void main(String []args)
    {
        String str="jude";

       String ans= reverse_str(str);
        System.out.println(ans);
    }
}

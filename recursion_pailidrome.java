public class recursion_pailidrome {
    public static boolean is_palindrome(String str,int s)
    {
        if(s>str.length()/2){
            return true;
        }

        return str.charAt(s)==str.charAt(str.length()-s-1)&& is_palindrome(str,s+1);


    }
    public static void main(String []args)
    {
        String str="markm";
        int s=0;
        int len=str.length();
       boolean ans= is_palindrome(str,s);
        System.out.println(ans);
    }
}

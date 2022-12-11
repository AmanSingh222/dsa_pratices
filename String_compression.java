public class String_compression {
    public static void compressStr(String str)
    {
        StringBuilder ans= new StringBuilder("");


        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1))
            {
                count++;
                i++;
            }
            ans.append(str.charAt(i));
            if(count > 1)
            {
                ans.append(count.toString());
            }


        }
        System.out.println( ans);
    }
    public static void main(String args[])
    {
        String str= "aaabbcccdd";
        String str2= "abces";
        compressStr(str);
        compressStr(str2);
        System.out.println(5>>2);

    }
}

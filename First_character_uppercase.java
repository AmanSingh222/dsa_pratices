public class First_character_uppercase {
    public static void fUpperCase(String str)
    {
        int len= str.length();
        StringBuilder ans= new StringBuilder("");
        // to convert first character into large case
        char ch= Character.toUpperCase(str.charAt(0));
        ans.append(ch);

        for(int i=1; i<len;i++)
        {
            if(str.charAt(i)==' ' && i<len -1)
            {
                ans.append(str.charAt(i));
                i++;
                ans.append(Character.toUpperCase(str.charAt(i)));
            }else
            {
                ans.append(str.charAt(i));
            }
        }

        System.out.println(ans);


    }
    public static void main(String args[])
    {
        String str= "hi, i am luffy";
        String str2= "how are YOU";
        fUpperCase(str);
        fUpperCase(str2);

    }
}

public class Print_largest_string {
    public static void largerString(String str[])
    {
        int n= str.length;
        String largest= str[0];

        for(int i=0; i<n;i++)
        {
            if(largest.compareToIgnoreCase(str[i])<0)
            {
                largest= str[i];

            }
        }
        System.out.println(largest);
    }
    public static void main(String args[])
    {
        String str[]= {"apple","mango","banana"};
        largerString(str);
        String str2 =new String("kiwi");
        StringBuilder str3= new StringBuilder("orange");
        System.out.println(str3);

    }
}

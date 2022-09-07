public class reverse_string {
    public static void main(String []args)
    {
        String name="supefgdfgfgr",demo="";
        char ch;
        System.out.println("before reverse"+name);
        for(int i=0;i<name.length();i++)
        {
            ch=name.charAt(i);
            demo=ch+demo;

        }
        System.out.println("reverse string "+demo);
    }
}

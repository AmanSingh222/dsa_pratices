public class recursion_powersets {

    public static String powersets(String p, int idx, String curr)
    {
        int len=p.length()-1;
        if(idx==len) {
            return curr;
        }
        powersets(p,idx+1,curr+p.charAt(idx));
        powersets(p,idx+1,curr);

        return curr;
    }
    public  static void main(String []args)
    {
        String p="abc";

        int idx=0;
        String curr="";
        String output= powersets(p,idx,curr);
        System.out.println(output);
    }
}

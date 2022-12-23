public class recursion_remove_duplicates_in_string {

    public static void removeDuplicate(String str,int idx,StringBuilder newStr,boolean map[])
    {
        //baseCase
        if(idx==str.length())
        {
            System.out.println(newStr);
            return;
        }
        //kaam
        char curChar= str.charAt(idx);

        if(map[curChar -'a']==true)
        {
            removeDuplicate(str,idx+1,newStr,map);
        }

        else
        {
            map[curChar -'a']= true;
            removeDuplicate(str,idx+1,newStr.append(curChar),map);

        }


    }
    public static void main(String args[])
    {
        StringBuilder str= new StringBuilder("");
        String s= "appnnacollege";
         removeDuplicate(s,0,str, new boolean [26]);


    }
}

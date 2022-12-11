public class occurrence_of_word_in_string {

    public static void findLastWord(String str)
    {// find the length of last word in the given string
        int count =0;
        str=str.trim();
        int n= str.length();
        for(int i=n-1;i>=0;i--)
        {
            char str2= str.charAt(i);
            if(str2 != ' ' )
            {
                count++;

            }
            else {
                break;
            }
        }
        System.out.println(count);
    }



    // find occurrence of given word
    public static void findOcc(String str,String word)
    {
        int count=0;
        String temp[]= str.split(" ");

        for(int i=0;i< temp.length;i++)
        {
            if(word.equals(temp[i]))
            {
                count++;

            }
        }
//        System.out.println("word not found");
        System.out.println(count);

    }
    public static void main(String args[] )
    {
        String str= "my name is mark mark";
        String find ="mark";
        findLastWord(str);
        findOcc(str,find);

    }
}

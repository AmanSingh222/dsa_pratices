import java.util.ArrayList;
import java.util.Collections;

public class Arrayslist

{
    public static void main(String [] args)
    {
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(502);
        list.add(22);
        list.add(32);

        System.out.println(list);
        System.out.println(list.get(1));
        list.add(2,7000);
        System.out.println(list);
        list.set(1,23);
        System.out.println(list.size());
        list.remove(0);

        System.out.println(list);
        System.out.println(list.size());


        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        System.out.println(list);
    }
}

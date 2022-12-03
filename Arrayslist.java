import java.util.ArrayList;
import java.util.Collections;

public class Arrayslist

{
    public static void swap(ArrayList<Integer> arr, int idx_1,int idx_2)
    {
        int temp= arr.get(idx_1);
        arr.set(idx_1,arr.get(idx_2));
        arr.set(idx_2,temp);
    }
    public static void main(String [] args)
    {
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(502);
        list.add(22);
        list.add(32);
        list.add(221);
        list.add(510);

//        System.out.println(list);
//        System.out.println(list.get(1));
//        list.add(2,7000);
//        System.out.println(list);
//        list.set(1,23);
//        System.out.println(list.size());
//        list.remove(0);
//
//        System.out.println(list);
//        System.out.println(list.size());
//
//
//        for(int i=0;i<list.size();i++)
//        {
//            System.out.println(list.get(i));
//        }
//        Collections.sort(list);
        System.out.println(list);



        //find maximum
        int max= Integer.MIN_VALUE;

//        for(int i=0;i<list.size();i++)
//        {
//            if(list.get(i)>max)
//            {
//                max=list.get(i);
//            }
//        }
//
//        System.out.println(max);



        // swap number idex=1,indx3

        swap(list,1,2);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);


        // multi dimension array list

        ArrayList<ArrayList<Integer>> main_list= new ArrayList<>();
        main_list.add(list);


        // 2 list
        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(1);
        list2.add(2);
        main_list.add(list2);


        for(int i=0;i<main_list.size();i++)
        {
           ArrayList<Integer> currlist = main_list.get(i);
           for(int j=0;j<currlist.size();j++)
           {
               System.out.print(currlist.get(j)+ " ");
           }
            System.out.println("");
        }


        System.out.println(main_list);






    }
}

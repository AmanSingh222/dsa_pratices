import java.lang.reflect.Array;
import java.util.ArrayList;

public class Arraylist_container_fill_water {
    public static  int storeWater(ArrayList<Integer> height){
        int maxWater=0;
        //brute force complexity n^2
        for(int i=0;i<height.size();i++)
        {
            for(int j=i+1;j<height.size();j++)
            {
                int h= Math.min(height.get(i),height.get(j));
                int width= j-1;
                int cur_water_area= h* width;
                maxWater= Math.max(maxWater,cur_water_area);
            }
        }
        return maxWater;
    }


    // optimize solution 2 pointer approach
    public static int store_Water(ArrayList<Integer> height)
    {
        int start=0;
        int end= height.size()-1;
        int maxWater=0;

        while(start<end)
        {
            int h= Math.min(height.get(start), height.get(end));
            int width= end- start;
            int currWater= h*width;
            maxWater= Math.max(maxWater,currWater);
            //compare the height
            if(height.get(start) < height.get(end) )
            {
                start++;
            }else
            {
                end--;
            }


        }
        return maxWater;

    }

    public static void main(String []args)
    {
        ArrayList<Integer> height= new ArrayList<>();
        //[1,8,6,2,5,4,8,3,7]
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int ans= storeWater(height);
        System.out.println(ans);
        System.out.println(store_Water(height));


    }
}

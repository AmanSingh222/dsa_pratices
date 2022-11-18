public class min_max_array {
     static void find_min_max(int []arr)
    {
        if(arr == null || arr.length==0)
        {
            return;
        }

        int min= arr[0];
        int max= arr[0];
        for(int i= 0; i<arr.length-1;i++)
        {
            if(arr[i]<min){
                min= arr[i];
            }
            if(arr[i]>max){
                max= arr[i];
            }
        }
        System.out.println("Minimum= " + min);
        System.out.println("Maximum= " + max);



    }
    public static void main(String args[])
    {

        int [] arr={-2, 1, -4, 5, 3};
        find_min_max(arr);


    }
}

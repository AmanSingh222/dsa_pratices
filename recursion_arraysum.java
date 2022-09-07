public class recursion_arraysum {
    public static int sum(int []arr,int size)
    {
        if(size==1)
        {
            return arr[0];
        }
        return helper_sum(arr,size,0,0);
    }
    public static int helper_sum(int []arr,int size,int index,int sum)
    {
        if(index==size)
        {
            return sum;
        }
        int crsum= sum+ arr[index];
        return helper_sum(arr,size,index+1,crsum);

    }
    public static void main(String []args)
    {
        int []arr={5,2,7,3,7,2};
        int size= 6;
        int ans= sum(arr,size);
        System.out.println(ans);
    }
}

public class recursion_bubble_sort {
    public static void b_sort(int []arr,int len)
    {
        if(len==0||len==1){
            return ;
        }
        for(int i=0;i<len-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                arr[i]=arr[i]^arr[i+1];
                arr[i+1]=arr[i]^arr[i+1];
                arr[i]=arr[i]^arr[i+1];

            }
        }
        b_sort(arr,len-1);
    }
    public static void main(String []args)
    {
        int []arr={1,7,2,0,14,3,8,5};
        int len=arr.length;

        System.out.println("before bubble sort");
        for(int i=0;i<len-1;i++)
        {
            System.out.print(""+arr[i]);
        }
        b_sort(arr,len);

        System.out.println("\nafter bubble sort");
        for(int i=0;i<len;i++)
        {
            System.out.println(arr[i]);
        }


    }
}

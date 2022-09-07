public class recursion_selection_sort {
    public static void s_sort(int []arr,int len,int idx)
    {
        if(idx==len){
            return;
        }
        int minidx=idx;
        for(int i=idx+1;i<len;i++)
        {
            if(arr[minidx]>arr[i])
                minidx=i;
        }
//        arr[minidx]=arr[idx]^arr[minidx];
//        arr[idx]=arr[idx]^arr[minidx];
//        arr[minidx]=arr[idx]^arr[minidx];
        int temp=arr[idx];
        arr[idx]=arr[minidx];
        arr[minidx]=temp;

        s_sort(arr,len,idx+1);

    }

    public static void main(String []args)
    {
        int []arr={1,7,2,0,14,3,8,5};
        int len=arr.length;

        System.out.println("before bubble sort");
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
        s_sort(arr,len,0);

        System.out.println("\nafter bubble sort");
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

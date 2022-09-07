public class recursion_insertion_sort {
    public static void i_sort(int []arr,int len,int idx)
    {
        if(idx==len){
            return;
        }

        int temp= arr[idx];
        int j=idx-1;
        while (j>=0 && arr[j]>temp){
            if(arr[j+1]<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;

        }
            i_sort(arr,len,idx+1);

    }

    public static void main(String []args)
    {
        int []arr={12,4,0,55,2,10};
        int len=arr.length;

        System.out.println("before insertion sort");
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
        i_sort(arr,len,0);

        System.out.println("\nafter insertion sort");
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

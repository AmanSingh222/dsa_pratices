public class recursion_mergesort {
    public static void merge(int []arr,int s,int e){
        int mid=s+(e-s)/2;
        int len1=mid-s+1;
        int len2=e-mid;

        // create array
        int []arr1=new int[len1];
        int []arr2=new int[len2];

        int origin_array=s;
        for(int i=0;i<len1;i++)
        {
            arr1[i]=arr[origin_array++];
        }


        for(int i=0;i<len2;i++)
        {
            arr2[i]=arr[origin_array++];
        }


         origin_array=s;
        int idx1=0;
        int idx2=0;

        while (idx1 < len1 && idx2 < len2)
        {
            if(arr1[idx1] < arr2[idx2]) {
                arr[origin_array++] = arr1[idx1++];
            }
            else
            {
                arr[origin_array++]=arr2[idx2++];
            }
        }

        while (idx1<len1){
            arr[origin_array++]=arr1[idx1++];

        }
        while (idx2<len2)
        {
            arr[origin_array++]=arr2[idx2++];
        }






    }
    public static void merge_sort(int []arr,int start,int size)
    {
        if(start>=size)
            return;
        int mid=start+(size-start)/2;
        //left array
        merge_sort(arr,start,mid);

        //right array
        merge_sort(arr,mid+1,size);

        merge(arr,start,size);
    }


    public static void main(String []args)
    {
        int []arr={10,3,1,5,7,11,2};
        int size=arr.length;


        System.out.println("Before Sorting");

        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        merge_sort(arr,0,size-1);
        System.out.println("After Sorting");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

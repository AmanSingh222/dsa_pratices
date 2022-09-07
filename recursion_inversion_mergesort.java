public class recursion_inversion_mergesort {
    public static void merge_array(int []arr,int s,int e)
    {
        int mid=s+(e-s)/2;
        int lenidx1=0;
        int lenidx2=0;
        int [] a1=new int[lenidx1];
        int []a2=new int [lenidx2];
    }
    public static void merge_sort(int []arr,int s,int e)
    {
        if(s>=e)
            return;

        int mid=s+(e-s)/2;
        //for left array
        merge_sort(arr,s,mid);
//        for right array
        merge_sort(arr,mid+1,e);

        merge_array(arr,s,e);
    }
    public static void main(String []args)
    {
        int []arr={5,1,8,4,2,1};
        int len=arr.length-1;
        merge_sort(arr,0,len);
    }
}

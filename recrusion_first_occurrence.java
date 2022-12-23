public class recrusion_first_occurrence {

    public static int firstOcc(int arr[],int s,int k)
    {
        if(s==arr.length-1)
            return -1;
        if(arr[s]==k)
        {
            return s;
        }

            return firstOcc(arr,s+1,k);

    }

    //last Occurrence

    public static int lastOccurrence(int arr[],int idx,int k)
    {
        int n= arr.length;

        //base case
        if(idx==n)
            return -1;

        int isFound=lastOccurrence(arr,idx+1,k);
        if(isFound== -1 && arr[idx]==k  )
            return idx;

        return isFound;
    }


    public static void main(String args[])
    {
        int arr[]={4,3,5,2,1,9,1,12,18};
        int arr2[]={2,2,2,2,2,2,2,2,2};
        int key=1;
        int idx=0;
        int ans=firstOcc(arr,idx,key);
        System.out.println("first occurrence "+ans);
        System.out.println("last occurrence "+lastOccurrence(arr2,idx,2));

    }
}

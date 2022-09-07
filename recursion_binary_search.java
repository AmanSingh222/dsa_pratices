public class recursion_binary_search {
    public static int b_serach(int []arr,int key,int s,int end)
    {

        if(s>end)
        {
            return -1;
        }
        int mid =s+(end-s)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]<key)
        {
            return b_serach(arr,key,mid+1,end);
        }else
        {
            return b_serach(arr,key,s,mid-1);
        }
    }

    public static void main(String []args)
    {
        int []arr={1,2,5,7,8};
        int key =5,s=0;
        int end= arr.length;
        int ans= b_serach(arr,key,s,end);
        if(ans==-1)
        {
            System.out.println("not present");
        }else
        {
            System.out.println("element present at index "+ans);
        }
    }
}

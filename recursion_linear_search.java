public class recursion_linear_search {
    public static int is_present(int []arr,int n,int key,int idx)
    {
       return helper_sol(arr,n,key,idx);

    }
    public static int helper_sol(int []arr,int n,int key,int idx)
    {
        if(idx==n)
        {
            return -1;
        }
        if(arr[idx]==key)
        {
            return idx;
        }
        return  helper_sol(arr,n,key,idx+1);
    }
    public static void main(String []args)
    {
        int []arr={1,8,5,7,5,1,55,22,4};
        int n=arr.length;
        int key=1,idx=0;
        int ans=is_present(arr,n,key,idx);
        if(ans==-1){
            System.out.println("not found");
        }else {
            System.out.println("Element present at index"+ans);
        }

    }
}

public class pivot_in_array {

    public static int findpivot(int []arr,int n)
    {
        int s=0;
        int e= n;
        int mid= s + (e-s)/2;
        while(s<e){
            if(arr[mid]>= arr[0])
            {
                s=mid+1;
            }else
            {
                e=mid;
            }
            mid= s + (e-s)/2;

        }
        return s;

    }


    public static void main(String []args)
    {
        int []arr= {7,8,10 ,1,2,3};
        int ans=findpivot(arr,6);

        System.out.println("Pivot array index "+ans);
    }
}
 
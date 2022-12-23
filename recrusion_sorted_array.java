public class recrusion_sorted_array {

//    public static boolean is_sorted(int []arr,int size){
//        if(size<=1)
//        {
//            return true;
//        }
//          return sorted_helper(arr,1,size);
//
//    }
//
//    private static boolean sorted_helper(int[] arr, int i, int size) {
//        if(i==size)
//        {
//            return true;
//        }
//        if (arr[i-1]>arr[i])
//        {
//            return false;
//        }else
//        {
//            return sorted_helper(arr,i+1,size);
//        }
//    }



    public static boolean is_sorted2(int arr[],int i)
    {
        int n=arr.length-1;
        if(i==n)
            return true;

        if(arr[i]>arr[i+1])
        {
            return false;
        }else
        {
            return is_sorted2(arr,i+1);
        }
    }


    public static void main(String []args){
        int []arr={2,4,5,10,12,50};
        int size=arr.length;
        boolean ans=is_sorted2(arr,0);
        if(ans){
            System.out.println("Array sorted");
        }else
        {
            System.out.println("Array not sorted");
        }


    }
}

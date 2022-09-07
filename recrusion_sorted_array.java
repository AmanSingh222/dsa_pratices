public class recrusion_sorted_array {

    public static boolean is_sorted(int []arr,int size){
        if(size<=1)
        {
            return true;
        }
          return sorted_helper(arr,1,size);

    }

    private static boolean sorted_helper(int[] arr, int i, int size) {
        if(i==size)
        {
            return true;
        }
        if (arr[i-1]>arr[i])
        {
            return false;
        }else
        {
            return sorted_helper(arr,i+1,size);
        }
    }


    public static void main(String []args){
        int []arr={2,4,5,1,10,12,50};
        int size=6;
        boolean ans=is_sorted(arr,size);
        if(ans){
            System.out.println("Array sorted");
        }else
        {
            System.out.println("Array not sorted");
        }


    }
}

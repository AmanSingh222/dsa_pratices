public class selection_sort {
    public static void printarray(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String [] args){
        int []arr= {5,77,2,17,233,1};
        //selection sort

        for(int i=0;i<arr.length-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    int temp = arr[smallest];
                    arr[smallest]= arr[j];
                    arr[j]= temp;

                }
            }
        }



        printarray(arr);
    }
}

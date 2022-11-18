public class bubble_sort {
    public static void printarray(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String [] args){
        int []arr= {5,23,2,7,3,1};

        //bubble sort
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        printarray(arr);
    }
}

public class insertion_sort {
    public void i_sort(int []arr){
        int len=arr.length;
        for(int i=1;i<len;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=temp;
        }
    }
    public static void printarray(int []arr1)
    {
        int n=arr1.length;
        System.out.println("after sorting");
        for(int i=0;i<n;i++)
        {

            System.out.print(arr1[i]+" ");

        }

    }


    public static void main(String []args)
    {
        int []arr={1,7,2,0,14,3,8,5};
        int len=arr.length;

        System.out.println("before insertion sort");
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
        insertion_sort ss=new insertion_sort();
        ss.i_sort(arr);
        printarray(arr);





    }
}

import java.util.Collections;

public class move_negative_of_starting {
    //using 2 pointer approach
    public static void move(int arr[])
    {
        int start =0;
        int end= arr.length -1;
        while(start<= end)
        {
            if(arr[start] < 0 && arr[end]< 0)
            {
                start++;
            }
            else if(arr[start] >0 && arr[end]<= 0)
            {
                int temp= arr[start];
                arr[start]= arr[end];
                arr[end]= temp;
                start++;
                end--;

            }
            else if(arr[start] < 0 && arr[end] >=0)
            {
                end--;
            }

            else {
                start++;
                end--;

            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }

    // without changing positions
    public static void move_2(int arr[])
    {
        int pos=-1;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]<0)
            {
                pos++;
                int temp= arr[pos];
                arr[pos]= arr[i];
                arr[i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }


    public static void main(String args[])
    {
        int arr[]={};
         //move(arr);
         move_2(arr);


    }
}

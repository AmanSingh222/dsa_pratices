public class Recursion_quick_sort {
    public static int partition(int []arr,int s,int e)
    {
        int pivot =arr[s];
        int count=0;
        for(int i=s+1;i<=e;i++)
        {
            if(arr[i]<=pivot)
                count++;

        }

        //place pivot to right position
        int pivotindex=s+count;
        int temp= arr[pivotindex];
        arr[pivotindex]=arr[s];
        arr[s]=temp;

        //sorting array
        int i=s,j=e;
        while(i<pivotindex && j>pivotindex)
        {
            while (arr[i]<=pivot)
            {
                i++;
            }

            while (arr[j]>pivot)
            {
                j--;
            }

            if(i<pivotindex && j>pivotindex)
            {
                 temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }


        }
        return pivotindex;


    }

    public static void quick_sort(int []arr,int s,int e)
    {
        if(s>=e)
            return;

        int p=partition(arr,s,e);
        //left array
        quick_sort(arr,s,p-1);

        //right array
        quick_sort(arr,p+1,e);


    }
    public static void main(String []args)
    {
        int []arr={5,4,2,8,1,0,6};
        int n=arr.length-1;
        quick_sort(arr,0,n);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

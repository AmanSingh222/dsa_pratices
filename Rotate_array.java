public class Rotate_array {

    // rotate array in left side

    public static void rotateArray(int arr[],int n,int r)
    {
        for(int i=0;i<r;i++)
        {
            int first= arr[0];
            int j;
            for(j=0;j<n-1;j++)
            {
                arr[j]=arr[j+1];

            }

            arr[j]= first;

        }


        // print array
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


    // rotate array in right side

    public static void rotateRight(int arr[],int n,int r)
    {
        for(int i=0; i<r;i++)
        {
           int last= arr[n-1];
           int j;
           for(j= n-1;j>0;j--)
           {
               arr[j]=arr[j-1];

           }
           arr[j]=last;
        }

        System.out.println("Array rotated right side");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }



    // rotate optimized way
    public static void rotateOpt(int arr[],int n,int r)
    {
//        if(r==0|| arr==null|| n==0)
//        {
//            return;
//        }

        int ans[]= new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]= arr[(i+r)%n];
        }


        for(int i=0;i<n;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        int n=arr.length;

        int rotate=3;

        //rotateArray(arr,n,rotate);

        //rotateRight(arr,n,rotate);

        rotateOpt(arr,n,rotate);






    }
}

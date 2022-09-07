public class elementshift {

    public void sort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<=n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    arr[j]=arr[j]^arr[i];
                    arr[i]=arr[j]^arr[i];
                    arr[j]=arr[j]^arr[i];
                }
            }
        }


    }

    public void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String []args)
    {
        int arr[]={8,-1,4,2,-4,21,-3,1};
        elementshift sc=new elementshift();
        int a;
        sc.sort(arr);
        sc.print(arr);






    }
}

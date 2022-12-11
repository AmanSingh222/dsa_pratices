public class Max_sum_subarray {

    public static void findSum(int []arr)
    {
        int n= arr.length;
        int maxSum= Integer.MIN_VALUE;
        int prefix[]= new int[n];
        int currSum=0;

        //calculate prefix
        prefix[0]= arr[0];
        for(int i=1;i< prefix.length;i++)
        {
            prefix[i]=prefix[i-1] + arr[i];
        }

        // calculate sum
        for(int i=0;i<n;i++)
        {
            int start=i;
            for(int j=i;j<n;j++)
            {
                int end=j;
                currSum= start ==0 ? prefix[j]:prefix[j] - prefix[i-1];

            }
            if(currSum> maxSum)
            {
                maxSum= currSum;
            }

        }
        System.out.println(" max sum "+maxSum);
    }


    // kadane Algorithm

    public static void kadaneSum(int []arr)
    {
        int currSum=0;
        int maxSum= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            currSum+= arr[i];
            if(currSum < 0)
                currSum=0;

            maxSum=Math.max(currSum,maxSum);

        }
        System.out.println("max sum using kadane algorithm "+maxSum);
    }
    public static void main(String []args)
    {
//        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int arr[]={-2 ,-3 ,4 ,-1 ,-2 ,1, 5};
        findSum(arr);

        kadaneSum(arr);
        kadaneSum(nums);


    }
}

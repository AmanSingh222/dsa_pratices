public class Pair {
//    public static void printpair(int arr[])
//    {
//        int n= arr.length;
//        int tpair=0;
//        for(int i=0;i<n;i++)
//        {
//            int curr= arr[i];
//            for(int j=i+1;j<n;j++)
//            {
//                System.out.print("(" + curr + "," + arr[j] + ")");
//                tpair++;
//            }
//            System.out.println();
//        }
//        System.out.print(tpair);
//    }

    // print sub array
//    public static void subArray(int arr[])
//    {
//        int total=0;
//        int sum=0;
//        for(int i=0;i<arr.length;i++)
//        {
//            int start= i;
//            for(int j=i;j<arr.length;j++)
//            {
//                int end=j;
//                for(int k=start;k<=end;k++)
//                {
//                    System.out.print(arr[k]+" ");
//
//
//                }
//                sum+= arr[j];
//                total++;
//
//                System.out.println();
//
//            }
//            System.out.println();
//        }
//        System.out.println(total);
//        System.out.println(sum);
//    }




    // print sum of maximum sub array
    public  static void maxiSum(int arr[])
    {
        int currSum=0;
        int maxSum= Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
                int end=j;
                currSum=0;
                for(int k=start;k<= end;k++)
                {
                    currSum+= arr[k];
                }
                System.out.println(currSum);
                if(currSum > maxSum)
                {
                    maxSum= currSum;
                }
            }
        }
        System.out.println("maximum sum "+maxSum);
    }
    public static void main(String []args)
    {
//        int []arr= {2,4,6,8,10};
        int arr[]={1,-2,6,-1,3};
//        printpair(arr);

//        System.out.println("sub array");
//        subArray(arr);
        maxiSum(arr);


    }
}

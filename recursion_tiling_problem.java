public class recursion_tiling_problem {


    //we can arrange tile with two choice and vertical
    public static int tilingProblem(int n)//2 x N(floor size)
    {
        if(n==0||n==1)
        {
            return 1;
        }

        if(n==2)
        {
            return n;
        }
        //choice to horizontal
        int fnm1 =tilingProblem(n-2);

        // vertical
        int fnm2=tilingProblem(n-1);

        int maxways= fnm1+fnm2;

        return maxways;


    }
    public static void main(String args[])
    {

        System.out.println(" floor filling total ways "+tilingProblem(4));

    }

}

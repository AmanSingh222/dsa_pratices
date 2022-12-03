import java.util.*;
public class squareroot_binary_search {


    //for find square
    public static int findSquare(int n)
    {
        int s=1;
        int e=n;
        int ans=0;
        while(s<=e)
        {
            int mid= s +(e-s)/2;
            if(mid <= n/mid)
            {
                s= mid+ 1;
                ans = mid;
            }
            else{
                e= mid -1;
            }
        }
        return ans;

    }

    //for decimal point
    public static double morePrecision(int n,int precision,int tempsol)
    {
        double factor= 1;
        double ans=tempsol;
        for(int i=0;i<precision;i++)
        {
            factor = factor/10;
            for(double j=ans;j*j< n;j=j+factor)
            {
                ans=j;
            }
        }
        return ans;

    }




    public static void main(String []args)
    {
        int num=0;
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        num= sc.nextInt();
//        long output=findSquare(num);
//        System.out.println(output);
        int output= findSquare(num);

        double accurate_ans= morePrecision(num,3,output);
        System.out.println(accurate_ans);


    }
}

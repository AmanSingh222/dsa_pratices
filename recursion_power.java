import java.util.Scanner;

public class recursion_power {
//    public static int power(int a,int b)
//    {
//        if(b==0)
//        {
//            return 1;
//        }
//
//        if(b==1)
//        {
//            return a;
//        }
//        int ans= power(a,b/2);
//
//        if(b%2==0)
//        {
//              return ans *ans;
//        }else
//        {
//            return a *ans *ans;
//        }
//
//    }



    // brute force
    public static int powerN(int a,int n)
    {
        if(n==0)
            return 1;

        int ans= a*powerN(a,n-1);
        return ans;

    }

    // optimized approach

    public static int powerOpt(int a,int n)
    {
        if(n==0)
            return 1;

        if(n==1)
            return a;


       int halfPower= powerOpt(a,n/2);

       // for even part
       int halfPowerSqr= halfPower * halfPower;

       if(a%2!=0)
       {
          return halfPowerSqr * halfPower;
       }
       return halfPowerSqr;


    }
    public static void main(String []args)
    {
        System.out.println("Enter any two number");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(powerN(a,n));

        System.out.println("Optimized approach " +powerOpt(a,n));

    }
}

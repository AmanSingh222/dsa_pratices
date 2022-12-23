import java.util.Scanner;

public class recursion_Demo {
    // find factorial
    private static int fact(int n){
        if(n==0)
        {
            return 1;
        }
        //System.out.println(n);
        int ans= n*fact(n-1);


        return ans;
    }

    // print number 1 to n using recursion
    public static void printNum(int n){


        if(n==1)
        {
            System.out.println(n);
            return;
        }


        printNum(n-1);
        System.out.println(n);

    }


    // print sum of n natural number
    public static int printN_sum(int n)
    {
        if(n==1){
            return 1;
        }
         int sum =n + printN_sum(n-1);
//        System.out.println(sum);
        return sum;
    }



//    print fibonacci number using recursion

    public static int  fibNum(int n)
    {
        if(n==0|| n==1)
        {
            return n;
        }
        int ans= fibNum(n-1)+ fibNum(n-2);
        return ans;
    }


    public static void main(String [] args){



        int num;
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
//        int ans=fact(num);
//        System.out.println(ans);
//        printNum(num);

        System.out.println(fibNum(num));


    }
}

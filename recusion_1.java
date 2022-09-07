import java.util.Scanner;

public class recusion_1 {
    private static int fact(int n){
        if(n==0)
        {
            return 1;
        }
        //System.out.println(n);
        int ans= n*fact(n-1);


        return ans;
    }
    public static void main(String [] args){



        int num;
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        int ans=fact(num);
        System.out.println(ans);


    }
}

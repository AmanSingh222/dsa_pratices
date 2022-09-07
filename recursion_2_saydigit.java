import java.util.Scanner;
import java.util.*;

public class recursion_2_saydigit {

    public static void say(String []arr,int n)
    {
        if(n==0)
        {
            return;
        }
        int digit= n%10;
        n=n/10;
        say(arr,n);
        System.out.println(arr[digit]);


    }
    public static void main(String []args) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        say(arr,n);
    }
}

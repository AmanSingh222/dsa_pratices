import java.util.Scanner;
public class Advance_Pattern {

    //number pyramid
    public static void numPyramid(int n)
    {
        for(int i=1; i<=n;i++)
        {
            // print space
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    //number palindrome
    public static void numP(int n)
    {
        for(int i=1;i<=n;i++)
        {
            // space
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String args[])
    {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);

        int num= sc.nextInt();
//        numPyramid(num);

        numP(num);




    }

}

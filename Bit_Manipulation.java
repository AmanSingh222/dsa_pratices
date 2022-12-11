import java.util.Scanner;
public class Bit_Manipulation {

    public static void checkNum(int num)
    {
        int bitMasking= 1;
        if((num & bitMasking)==0)
        {
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }
    public static void main(String args[])
    {
        System.out.println("To Check number is even or odd");
        int num;
        Scanner sc= new Scanner(System.in);
        num= sc.nextInt();
        checkNum(num);
    }
}

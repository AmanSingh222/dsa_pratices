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



    // get ith bit of given number
    public static int getIthBit(int num,int i)
    {
        int bitMasking =1<<i;
        if((num & bitMasking) ==0) {
            return 0;

        }else {
            return 1;
        }
    }



    // set ith bit
    public static int setIthBit(int num, int i)
    {
        int bitMask=1<<i;
        int ans= num | bitMask;
        return ans;
    }

    //clear ith bit
    public static int clearIthBit(int num,int i)
    {
        int bitMask= ~(1<<i);
        return num & bitMask;
    }




    //clear ith last bit

    public  static int clearLastIthBit(int num,int i)
    {
        int bitmask=(-1)<<i;
        int bit= (~0)<< i;
        return num & bit;
    }


    // clear range of bits
    public static int clearRange(int num,int i,int j)
    {
        int a=(~0)<<j+1;
        int b=(1<<i)-1;
        int bitmask=a|b;
        return num & bitmask;

    }


    // check number is power of 2
    public static boolean checkNumber(int num)
    {
        return  (num & (num-1))==0;
    }


    //count set bits

    public static int  countSet(int num)
    {
        int s=0;
        int count=0;
        while(s<num)
        {
            if((num & 1)!=0)
            {
                count++;
            }
            num= num>>1;
        }
        return count;
    }



    // fast exponentiation

    public static int fastExpo(int a,int n )
    {
        int ans=1;
        while (n>0)
        {
            if((n & 1)!=0)
            {
                ans = ans *a;
            }
            a=a*a;
            n=n>>1;

        }
        return ans;
    }
    public static void main(String args[])
    {
        System.out.println("To Check number is even or odd");
        int num;
        Scanner sc= new Scanner(System.in);
        num= sc.nextInt();
//        checkNum(num);
//        System.out.println("Get ith Bit = "+getIthBit(num,2));
//
//        System.out.println("Set ith Bit = "+setIthBit(num,2));
//
//        System.out.println("Clear ith Bit = "+clearIthBit(num,1));
//
//        System.out.println("Clear last ith bit = "+ clearLastIthBit(num,2));
//
//        System.out.println("Clear range of bits = "+ clearRange(num,2,4));
//
//        System.out.println("this number id power of two = "+ checkNumber(num));

        System.out.println("Count set bits in given number = "+ countSet(num));

        System.out.println("Fast Exponentiation "+ fastExpo(5,num));




    }
}

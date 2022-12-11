import java.util.Scanner;

public class matrices_array {
//    public static boolean  findelement(int matrix[][],int key)
//    {
//        for(int i=0;i< matrix.length; i++)
//        {
//            for(int j=0;j<matrix[0].length;j++)
//            {
//                if(matrix[i][j]== key)
//                {
//                    System.out.println("element present "+"("+ i+","+ j+")");
//                    return true;
//                }
//
//            }
//
//        }
//        return  false;
//
//    }

    public static int find_larger(int matrix[][])
    {
        int row= matrix.length;
        int col= matrix[0].length;
        int larger=0;
        for(int i=0;i< row;i++)
        {
            for(int j=0;j< col;j++)
            {
                if(matrix[i][j]>= larger  )
                {
                    larger= matrix[i][j];
                }
            }
        }
        return larger;
    }

    public static void main(String args[])
    {
        int matrix[][]= new int[3][3];
        int n= matrix.length;
        int m= matrix[0].length;
        // add element in matrix
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i< n; i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]= sc.nextInt();

            }
        }

        // to print matrix;
        for(int i=0;i< n; i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

//        findelement(matrix,9);
        System.out.println(find_larger(matrix));


    }
}

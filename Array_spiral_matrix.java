public class Array_spiral_matrix {

    public static void spiralElement(int matrix[][])
    {
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol= 0;
        int endCol= matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol)
        {
            //  top side
            for(int j=startRow;j<= endCol;j++)
            {
                System.out.print(matrix[startRow][j] + " ");
            }
            // right side
            for(int i=startRow+1;i<=endRow;i++)
            {

                System.out.print(matrix[i][endCol]+ " ");

            }

            //  bottom side
            for(int j=endCol-1;j>=startCol;j--)
            {
                //for odd number  matrix we use condition
                if(startRow== endRow)
                {
                    break;
                }
                System.out.print(matrix[endRow][j]+ " ");
            }


            //  left side
            for(int i=endRow-1;i>= startRow+1;i--)
            {
                if(startCol== endCol)
                {
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;


        }
        System.out.println();
    }



    // find diagonal sum
    public static int diagonalSum(int matrix[][])
    {
        int sum=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i==j)
                {
                    sum+= matrix[i][j];
                }
                else if(i+j == matrix.length -1)
                {
                    sum+= matrix[i][j];
                }
            }
        }
        return sum;

    }

    // diagonal optimized sum
    public static int dSum(int matrix[][])
    {
        int sum=0;
        //first diagonal
        for(int i=0;i<matrix.length;i++) {
            sum += matrix[i][i];
            // if our N is odd over element add 2 times
            if(i!= matrix.length -i-1)
            {
                sum+= matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String args[])
    {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                {13,14,15,16}};

        int matrix2[][]={{1,2,3,4},
                        {5,6,7,8},
                         {9,10,11,12},
                        };
        spiralElement(matrix);
        System.out.println("Diagonal Sum "+ diagonalSum(matrix));
        System.out.println("Diagonal Sum "+ dSum(matrix2));

    }
}

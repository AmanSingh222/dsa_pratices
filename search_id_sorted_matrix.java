public class search_id_sorted_matrix {
    public static boolean searchKey(int matrix[][],int key)
    {
        int row=0;
        int col=matrix[0].length-1;
        while(row < matrix.length && col >=0)
        {
            if(matrix[row][col]==key)
            {
                System.out.println("position of key "+ "("+ row+","+ col+")");
                return true;
            }
            else if(matrix[row][col]<key)
            {
                row++;

            }else {
                col--;
            }
        }
        System.out.println("key not found");
        return false;

    }
    public static void main(String args[])
    {
        int matrix[][]= {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};

        searchKey(matrix,37);
    }
}

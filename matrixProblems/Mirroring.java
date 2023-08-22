package practiceSet.matrixProblems;

public class Mirroring
{
    public static void main(String[] args) {
        int[][] matrix=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        print(matrix);
        System.out.println("--------");
        // flipHorizontal(matrix);
        flipVertical(matrix);
        print(matrix);


    }
    static void flipVertical(int[][] matrix)
    {
        int n = matrix.length;
        for(int i=0;i<n/2;i++)
        {
            for(int j =0;j<n;j++)
            {
                //  swap the opposite sides
                int temp = matrix[n-1-i][j];
                matrix[n-1-i][j] = matrix[i][j];
                matrix[i][j] = temp;

            }
        }
    }


    static void flipHorizontal(int[][] matrix)
    {
        int n = matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j =0;j<n/2;j++)
            {
                //  swap the opposite sides
                int temp = matrix[i][n-1-j];
                matrix[i][n-1-j] = matrix[i][j];
                matrix[i][j] = temp;

            }
        }
    }



    static void print(int[][] ans)
    {
         for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans.length;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }   
    }

}
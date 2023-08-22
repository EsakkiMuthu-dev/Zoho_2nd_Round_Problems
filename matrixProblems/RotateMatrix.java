package practiceSet.matrixProblems;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int deg = 360;
        deg = deg/2;
        int[][] ans =rotateAnti(matrix);
        for(int i=1;i<deg;i++)
        {
            ans=rotateAnti(ans);
        }
        print(ans);
        
    }
    static int[][] rotate(int[][] matrix)
    {
        int n = matrix.length;
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[j][n-1-i]=matrix[i][j];
            }
            
        } 
        return arr;

    }
    static int[][] rotateAnti(int[][] matrix)
    {
        int n = matrix.length;
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[n-1-j][i]=matrix[i][j];
            }
            
        } 
        return arr;

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

package practiceSet.matrixProblems;

public class SubMatrix {
    public static void main(String[] args) {
        int[][] arr1 = {
            {8, 3, 7, 1, 9},
            {2, 5, 1, 6, 3},
            {0, 4, 9, 2, 5},
            {6, 8, 3, 4, 1},
            {7, 0, 2, 5, 6}
        };
        
        int[][] arr2 = {
            {9, 2, 5},
            {3, 7, 1},
            {2, 5, 6}
        };
        System.out.println(isContain(arr1,arr2));
    }
    static boolean isContain(int[][] arr1, int[][] arr2)
    {
        int biggerRows = arr1.length;
        int biggerCols = arr1[0].length;
        int smallerRows =arr2.length;
        int smallerCols = arr2[0].length;

        for(int i=0; i<= biggerRows-smallerRows ;i++)
        {
            for(int j=0;j<=biggerCols-smallerCols;j++)
            {

                //  extract sub matrix
                
                if(matches(arr1,i,j,arr2)) return true;
            }
        }

       return false;
    }

    static boolean matches(int[][] arr1, int startRow,int startCol, int[][] arr2)
    {

        
        for( int i =startRow,r=0;i<arr2.length;i++,r++)
        {
            for(int j= startCol,c=0;j<arr2[0].length;j++,c++)
            {
                if(arr1[i][j] != arr2[r][c])  return false;

            }
           
        }

        return true;
    }

}

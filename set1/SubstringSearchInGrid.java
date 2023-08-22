package practiceSet.set1;
import java.util.Scanner;
public class SubstringSearchInGrid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String target = input.next();
        input.close();
        char[][] charGrid = generate2DMatrix(sentence);
        findSubString(charGrid,target);
    }

    static void findSubString(char[][] charGrid,String target)
    {
        boolean found = false;
        
        int k =0;
        // find in row
        for(int i=0; i<charGrid.length;i++)
        {
            for(int j=0;j<charGrid.length;j++)
            {
                //  if target first element is matches 
                
                if(charGrid[i][j] ==target.charAt(k))
                {
                    found = true;
                    k++;
                    j++;
                    while(k<target.length())
                    {
                        if(target.charAt(k) != charGrid[i][j])
                        {
                            found=false;
                            break;
                        }
                        k++;
                    }
                    if(found){
                        System.out.printf("(%d,%d) , (%d,%d) %n",i,j-target.length(),i,j-1);
                        k=0;
                    }
                    else{
                        
                        k=0;
                        break;
                    }
                }
            }
        }

        // find in col
        for(int j=0; j<charGrid.length;j++)
        {
            for(int i=0;i<charGrid.length;i++)
            {
                //  if target first element is matches 
                
                if(charGrid[j][i] ==target.charAt(k))
                {
                    found = true;
                    k++;
                    i++;
                    while(k<target.length())
                    {
                        if(target.charAt(k) != charGrid[j][i])
                        {
                            found=false;
                            break;
                        }
                        k++;
                    }
                    if(found){
                        System.out.printf("(%d,%d) , (%d,%d) %n",j-target.length(),i,j-1,i);
                        k=0;
                    }
                    else{
                        k=0;
                        break;
                    }
                }
            }
        }



    }
    public static char[][] generate2DMatrix(String sentence)
    {
        //  build the 2d matrix
        int len = sentence.length();
        int d =1;
        while(d*d < len) d++; // finding dimension of an matrix
        char[][] grid = new char[d][d];
        int k =0;
        for(int i=0;i<d;i++)
        {
            for(int j=0;j<d;j++)
            {
                if(k<len) {
                    grid[i][j] =sentence.charAt(k);
                    System.out.print(sentence.charAt(k));
                    k++;
                }
                else{
                    System.out.print(grid[i][j]);
                } 
            }
            System.out.println();
        }

        return grid;

    }

}
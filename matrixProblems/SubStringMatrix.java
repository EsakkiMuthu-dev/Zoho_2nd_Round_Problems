package practiceSet.matrixProblems;


public class SubStringMatrix {
    public static void main(String[] args) {
        String word = "WELCOMETOZOHOCORPORATION";
        int l = generateLength(word);
        char[][] ans = new char[l][l];
        generateMatrix(word,ans);

        print(ans);
        search(ans,"TOO");

        
    }
    static void search(char[][] ans , String target)
    {
        int[] startIdx=new int[2];
        int[] endIdx = new int[2];
        int len = target.length();
        //  horizontally
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans.length-(len-1);j++)
            {
                String sub = new String(ans[i],j,len);
                if(target.equals(sub))
                {

                    startIdx[0] =i;
                    startIdx[1]=j;
                    endIdx[0]=i;
                    endIdx[1]=j+(len-1);
                    System.out.println("Found !! ");
                    System.out.printf("< start Index %d ,%d > %n",startIdx[0],startIdx[1]);
                    System.out.printf("< end Index %d ,%d > %n",endIdx[0],endIdx[1]);
                }
            }

        }

        // vertically
        for(int i=0;i<ans.length-(len-1);i++)
        {
            for(int j=0;j<ans.length;j++)
            {
                StringBuilder sub = new StringBuilder();
                for(int k=i;k<i+len;k++)
                {
                    sub.append(ans[k][j]);
                }
                if(target.equals(sub.toString()))
                {
                    startIdx[0] =i;
                    startIdx[1]=j;
                    endIdx[0]=i+(len-1);
                    endIdx[1]=j;
                    System.out.println("Found !! ");
                    System.out.printf("< start Index %d ,%d > %n",startIdx[0],startIdx[1]);
                    System.out.printf("< end Index %d ,%d > %n",endIdx[0],endIdx[1]);
                }

            }
        }
    }
    static void print(char[][] ans)
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
    static void generateMatrix(String word,char[][] ans)
    {
        int k=0;
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans.length;j++)
            {
                if(k<word.length())
                {
                ans[i][j] =word.charAt(k);
                k++;
                }
               
            }
        }
       
    }
    
    static int generateLength(String word)
    {
        int len = word.length();
        int i=2;
        while(i*i < len)
        {
            i++;
        }
        return i;
    }
}

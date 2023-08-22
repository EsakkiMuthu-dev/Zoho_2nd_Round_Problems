package practiceSet.set2;

public class RemoveUnbalancedParenthesis {

    public static void main(String[] args) {
        String paranthesis ="((abc)((de))";
        String paranthesis1 ="(((ab)";
        removeUnBalanced(paranthesis);
    }
    static void removeUnBalanced(String word)
    {
        StringBuilder wrd = new StringBuilder(word);
        // checking open
        int open =0;
         // checking close
        int close =0;
        for(int i=0,j = word.length()-1;i<word.length();i++,j--)
        {
            if(word.charAt(i) == '(') 
            {
                open++;
               
            }
            else if(word.charAt(i)==')') 
            {
                open--;
            }
            if(open<0)
            { 
                wrd.insert(i,'a');
                open=0;
            }

            // handle close
            if(word.charAt(j) == ')') 
            {
                close++;
            }
            if(word.charAt(j)=='(') 
            {
                close--;
            }
            if(close<0)
            { 
                wrd.insert(j,'a');
                close=0;
            }

        }
       
  
        System.out.println(wrd);

    }
    

}

package practiceSet.matrixProblems;

import java.util.HashSet;
import java.util.Set;

public class SearchForWord {
    public static void main(String[] args) {
        char[][] arr= {
            {'a','z','o','l'},
            {'n','x','h','o'},
            {'v','y','i','v'},
            {'o','r','s','e'}
        };
        Set<String> dictionary = new HashSet<>();
        //  {van, zoho, love, are, is}
        dictionary.add("van");
        dictionary.add("zoho");
        dictionary.add("love");
        dictionary.add("are");
        dictionary.add("is");
        for(String wrd : dictionary)
        {
            find(arr, dictionary,wrd);
            
        }
        // find(arr,dictionary,"his");
        
        

    }
    static void find(char[][] arr , Set<String> dictionary, String target)
    {
    
        // horiontal
        for(int i=0;i<arr.length;i++) // rows
        {
            for(int j =0; j<= (arr.length) - target.length();j++ )
            {
                String sub = new String(arr[i],j,target.length());
                if(target.equals(sub))System.out.println("Match found on horizontal "+target);
            }

        }
        
        //vertical 
        for(int i=0;i<=arr.length-target.length(); i++)
        {
            for(int j =0 ; j<arr.length;j++)
            {
                StringBuilder sub = new StringBuilder();
                for(int k =i; k<=i+target.length()-1;k++)
                {
                    sub.append(arr[k][j]);
                }
                
                if(target.equals(sub.toString())) System.out.println("Match found on vertical "+target);
            }
        }
    }
}

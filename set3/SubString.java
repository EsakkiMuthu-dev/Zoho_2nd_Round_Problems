package practiceSet.set3;

public class SubString {
    public static void main(String[] args) {
        String  word = "test123string";
        String w1 = "testing12";
        System.out.println(findSubString(word,"123"));
        System.out.println(findSubString(w1,"1234"));
    }
    static int findSubString(String word,String target)
    {
        int pos =-1;
        int i=0, k=0;
        while(i<word.length())
        {
            if(word.charAt(i) == target.charAt(k))
            {
                pos=i;
                k++;
                i++;
                while(i< target.length() && i <word.length())
                {
                    if(word.charAt(i)!=target.charAt(k))
                    {
                        pos=-1; 
                        break;
                    }
                    i++;
                    k++;

                }
                if(pos> 0 )
                {
                    return pos;

                }else{
                    k=0;
                }
            }
            i++;
        
        }
        return pos;
    
    }
}
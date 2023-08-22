package practiceSet.set3;

public class Print {
    public static void main(String[] args) {
        String word1="a1b10";
        String word2 = "b3c6d15";
        print(word1);
        print(word2);
    }
    static void print(String word)
    {
        // step 1 : iterate through string
        //  S2 : store the character in to print variable
        //  S3 : then check whether the next number is type add the type to count var
        //  S4 : also update the count value ifnext is also number
        //  S5 : if nextCharacter comes print the char according to its count
        String toBePrint="";
        int count=0;
        for(int i=0; i<word.length();i++)
        {
            if(Character.isDigit(word.charAt(i)))
            {
                count=(count*10)+Integer.parseInt(Character.toString(word.charAt(i))); 
            }else{
                if(toBePrint!="")
                {
                    System.out.print(toBePrint.repeat(count));
                    count=0; 
                }
                toBePrint =Character.toString(word.charAt(i));
            }
            
        }
        System.out.print(toBePrint.repeat(count));
        System.out.println();
    }
}

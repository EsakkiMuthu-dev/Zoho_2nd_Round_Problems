package practiceSet.set1;

public class ProgramPattern {
    public static void main(String[] args) {
        String word = "program";
        print(word);
    }
    static void print(String word)
    {
        // outer row
        for(int i=0;i< word.length();i++)
        {
            // inner row
            for(int j=0;j<word.length();j++)
            {
                if(i==j | i+j ==word.length()-1)System.out.print(word.charAt(j));
                else System.out.print(" ");
            }
            System.out.println();

        }

    }
}

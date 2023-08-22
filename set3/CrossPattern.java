package practiceSet.set3;

public class CrossPattern {
    public static void main(String[] args) {
        String input = "12345";
        String input1="geeksforgeeks";
        print(input);
        System.out.println("-------------");
        print(input1);
    }
    static void print(String word){
        for(int i=0;i<word.length();i++)
        {
            for(int j=0;j<word.length();j++)
            {
                if(i==j || i+j == word.length()-1)System.out.print(word.charAt(j)+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

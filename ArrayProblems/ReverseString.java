package practiceSet.ArrayProblems;

public class ReverseString {
    public static void main(String[] args) {
        String word ="one two three";
        reverse(word.split(" "),0);
        System.out.println(" ");
        String s1 = "two";
        System.out.println(reverseString(s1,0));
    }
    static String reverseString(String s1, int index)
    {
        if(index == s1.length()) return "";

        return reverseString(s1,index+1) + s1.charAt(index);

    }

    static void reverse(String[] words, int ind)
    {
        // base condition
        if(words.length == ind) return;
        reverse(words,ind+1);
        System.out.print(words[ind]+" ");

    }
}

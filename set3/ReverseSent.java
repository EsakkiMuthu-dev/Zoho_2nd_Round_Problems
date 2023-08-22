package practiceSet.set3;

public class ReverseSent {
    public static void main(String[] args){
        String w1 = "one two three";
        reverse(w1.split(" "),0);
        System.out.println();
        reverse("I love india".split(" "), 0);
    }
    static void reverse(String[] words, int index)
    {
        if(index >=words.length)
        {
            return;
        }
        reverse(words, index+1);
        System.out.print(words[index]+" ");

    }
}

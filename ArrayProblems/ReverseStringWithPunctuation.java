package practiceSet.ArrayProblems;

public class ReverseStringWithPunctuation {
    public static void main(String[] args) {
        String sentence = "A man, in the boat says : I see 1-2-3 in the sky";
        reverse(sentence);
        reverse("house no : 123@ cbe");
    }

    static void reverse(String sentence) {
        StringBuilder sent = new StringBuilder(sentence);
        int left = 0;
        int right = sent.length() - 1;

        while (left <= right) {
            while (left <= right && !Character.isLetterOrDigit(sent.charAt(left))) left++;
         
            while (left <= right && !Character.isLetterOrDigit(sent.charAt(right)))  right--;
            swapChar(sent, left, right);
            left++;
            right--;
        }
        System.out.println(sent);
    }

    static void swapChar(StringBuilder sent, int left, int right) {
        char temp = sent.charAt(left);
        sent.setCharAt(left, sent.charAt(right));
        sent.setCharAt(right, temp);
    }
}

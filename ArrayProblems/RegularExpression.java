package practiceSet.ArrayProblems;

public class RegularExpression {
    
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "a*cd";
        boolean result = isPatternMatched(str1, str2);
        System.out.println(result ? "Yes" : "No");
    }

    static boolean isPatternMatched(String str1, String str2) {
        int firstIdx = 0;
        int secondIdx = 0;

        while (secondIdx < str2.length()) {
            char currChar = str2.charAt(secondIdx);

            if (currChar == '\\') {
                // Skip the backslash and compare the next character
                secondIdx++;
                if (secondIdx >= str2.length() || str1.charAt(firstIdx) != str2.charAt(secondIdx)) {
                    return false;
                }
            } else if (currChar == '*') {
                // Check for zero or more occurrences
                while (firstIdx < str1.length() && str1.charAt(firstIdx) == str2.charAt(secondIdx - 1)) {
                    firstIdx++;
                }
                secondIdx++;
            } else {
                // Compare characters
                if (firstIdx >= str1.length() || str1.charAt(firstIdx) != currChar) {
                    return false;
                }
                firstIdx++;
                secondIdx++;
            }
        }

        // Ensure both strings have been matched completely
        return firstIdx == str1.length() && secondIdx == str2.length();
    }
}


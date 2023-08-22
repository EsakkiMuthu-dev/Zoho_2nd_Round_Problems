package practiceSet.othersProblems;


public class NumbersToWord {
    /*
     Input: 234
    Output: Two hundred and Thirty Four
     */
    private static final String[] ones = {
        "", "One", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
        "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty",
        "Sixty", "Seventy", "Eighty", "Ninety"
    };
    public static void main(String[] args) {
        
        int n = 786;
        System.out.println(convertToWord(n));

    }
    static String convertToWord(int n)
    {

        //  value is < 20
        if(n < 20)
        {
          return ones[n]+" ";   
        }
        if(n < 100)
        {
            return tens[n/10] +" "+ones[n%10];
        }
        return ones[n/100]+" hundred and "+convertToWord(n%100);
    }
}

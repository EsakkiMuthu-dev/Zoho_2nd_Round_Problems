package practiceSet.numberProblems;


/*
    a = 1010 b = 11001
    o/p 100011
 */
public class AddBinary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "11001";
        String result = addBinary(a, b,2);
        System.out.println("Result: " + result);  // Output: 100011
    }
    
    public static String addBinary(String a, String b, int n) {
        StringBuilder res = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry=0;
        while(i>=0 || j>=0)
        {
            int x = (i>=0)?Character.getNumericValue(a.charAt(i)):0;
            int  y =(j>=0)? Character.getNumericValue(b.charAt(j)):0;

            int sum = x+y+carry;
            res.insert(0,sum%n);
            carry=sum/n;
            i--;
            j--;
        }
        if(carry>0) res.insert(0,carry);

        return res.toString();
    
    }

}

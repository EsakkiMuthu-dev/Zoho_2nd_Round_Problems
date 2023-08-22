package practiceSet.numberProblems;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class RomanToDecimal {
    public static void main(String[] args) {
        String numeral = "III";
        String n1 = "IX";
        System.out.println(convert(numeral));
        System.out.println(convert(n1));
        System.out.println(convert("CM"));
        System.out.println(convertDecimalToRoman(34));
    }
    static String convertDecimalToRoman(int n)
    {
        StringBuilder res = new StringBuilder();
        HashMap<Integer, String> romanMappings = new LinkedHashMap<>();
        romanMappings.put(1000, "M");
        romanMappings.put(900, "CM");
        romanMappings.put(500, "D");
        romanMappings.put(400, "CD");
        romanMappings.put(100, "C");
        romanMappings.put(90, "XC");
        romanMappings.put(50, "L");
        romanMappings.put(40, "XL");
        romanMappings.put(10, "X");
        romanMappings.put(9, "IX");
        romanMappings.put(5, "V");
        romanMappings.put(4, "IV");
        romanMappings.put(1, "I");

        for(int val : romanMappings.keySet())
        {
            while(n>=val)
            {
                System.out.println(n +" "+val);
                res.append(romanMappings.get(val));
                n=  n- val;
            }
        }
        return res.toString();

    }
    
    static int convert(String n1)
    {
        HashMap<Character ,Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('X',10);
        romanMap.put('v',5);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);        


        int res=0; 
        int currVal=0;
        int prevVal =0;

        for(int i=n1.length()-1;i>=0;i--)
        {
            currVal= romanMap.get(n1.charAt(i));
            // check if this currval is greater than or equal to prev one  - add
            if(currVal >= prevVal) res+=currVal;
            else if(currVal <prevVal) res-=currVal;

            // change prev to current val
            prevVal=currVal;

        }
        return res;

    }
}

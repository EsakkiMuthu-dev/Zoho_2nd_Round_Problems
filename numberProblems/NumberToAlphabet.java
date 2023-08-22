package practiceSet.numberProblems;
import java.util.Scanner;

public class NumberToAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        String result = convertToAlphabet(number);
        System.out.println(result);
    }

    public static String convertToAlphabet(int number) {
        StringBuilder result = new StringBuilder();
       
        int last = number%26;
        if(last == 0)
        {
            result.insert(0,'z');
        }
        while(number >0)
        {
            
        }

     
      


        return result.toString();
    }
}

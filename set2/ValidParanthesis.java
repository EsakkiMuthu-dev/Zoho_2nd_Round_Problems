package practiceSet.set2;
import java.util.Stack;
public class ValidParanthesis {
    public static void main(String[] args) {
        String e1="(a+b)(a*b)";
        String e2 = "((a+b)";
        System.out.println(isValid(e1));
        System.out.println(isValid(e2)); 
    }
    static boolean isValid(String e)
    {
        Stack<Character> stack = new Stack<>();
        for(char a : e.toCharArray())
        {
            if(a ==  '(' ) 
            {
                stack.push(a);
            }
            else if(a == ')')
            {
                if(stack.isEmpty()) return false;
                else{
                    stack.pop();
                }
                 
            }
        }
        return stack.isEmpty();
    }
}

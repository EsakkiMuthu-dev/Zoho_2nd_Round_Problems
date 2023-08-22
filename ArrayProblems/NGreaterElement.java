package practiceSet.ArrayProblems;
import java.util.Stack;
public class NGreaterElement {
    public static void main(String[] args) {
        int[] arr = {2,4,8,90,77,84};
        findGreater(arr);
    }
    public static void findGreater(int[] arr)
    {
        //  use stack
        Stack<Integer> stack = new Stack<>(); // store in increasing order
        int n = arr.length;
        for(int i=n;i>=0;i--)
        {
            if(!stack.isEmpty()){
            while( (i<n )&& (arr[i] > stack.peek())) stack.pop(); //remove small elemnets in stack
            }
            else arr[i] =stack.peek();
            stack.add(arr[i]);
        }

    }
}

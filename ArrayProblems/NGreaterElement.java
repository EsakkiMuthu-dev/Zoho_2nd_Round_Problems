package practiceSet.ArrayProblems;
import java.util.Arrays;
import java.util.Stack;
public class NGreaterElement {
    public static void main(String[] args) {
        int[] arr = {2,4,8,90,77,84};     
        System.out.println(Arrays.toString(findGreater(arr)));
    }
    public static int[] findGreater(int[] arr)
    {
       int[] ans = new int[arr.length];
       Stack<Integer> st = new Stack<>();
       for(int i=arr.length-1;i>=0;i--)
       {
        while(!st.isEmpty() && st.peek() <= arr[i]) st.pop();

        if(!st.isEmpty())
        {
            ans[i] = st.peek();
        }else{
            ans[i] = -1;
        }
        st.push(arr[i]);

       }
       return ans;
    }
}

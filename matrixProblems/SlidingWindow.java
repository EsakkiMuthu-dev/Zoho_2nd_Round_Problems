package practiceSet.matrixProblems;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr= {3,2,7,6,5,1,2,3,4};
        int k =3;
        System.out.println(maxInWindows(arr, k));
    }
    static ArrayList<Integer> maxInWindows(int[] arr , int k)
    {
        ArrayList<Integer> maxList =new ArrayList<>();
        int n = arr.length;
        Deque<Integer> q = new ArrayDeque<>();

        for(int i =0; i< n ; i++)
        {
            // remove elements which are out of boundary
            if(!q.isEmpty() && q.peek()==i -k) q.poll();

            // remove the smaller element compared to arr[i]
            while(!q.isEmpty() && arr[q.peekLast()] < arr[i]) q.pollLast();

            // add the current element on the last;
            q.offer(i);

            // add the the max value on the array  max value in leftmost
            if(i >=k-1) maxList.add(arr[q.peek()]);
        }

        return maxList;

    }
}

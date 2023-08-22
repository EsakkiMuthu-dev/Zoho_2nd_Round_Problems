package practiceSet.SortingProblems;
import java.util.Arrays;
public class SortWithnoRepeat {
    public static void main(String[] args) {
        int[] arr1 = {2,4,5,6,7,9,10,13};
        int[] arr2 = {2,3,4,5,6,7,8,9,11,15};
       int[] ans = mergeSortwithNoRepeatVal(arr1,arr2);
       System.out.println(Arrays.toString(ans));

    }
    static int[] mergeSortwithNoRepeatVal(int[] arr1, int[] arr2)
    {
        int[] ans = new int[arr1.length+arr2.length];

        int left = 0; // arr1
        int right = 0;//arr2
        int k =0; // ans
        while(left< arr1.length && right <arr2.length)
        {

            if(arr1[left]< arr2[right])
            {
                ans[k] =arr1[left];
                left++;
            }
            else if(arr2[right] < arr1[left])
            {
                ans[k] = arr2[right];
                right++;
            }else if(arr1[left] == arr2[right])
            {
                ans[k] = arr1[left];
                left++;
                right++;
            }
            k++;
        }

        // left remaining
        while(left <arr1.length)
        {
            while(left+1<arr1.length && arr1[left] == arr1[left+1]) left++;
            ans[k] =arr1[left];
            k++;
            left++;
        }

        // right remaining
        while(right <arr2.length)
        {
            while(right +1 <arr2.length && arr2[right] == arr2[right+1]) right++;
            ans[k] =arr2[right];
            k++;
            right++;
        }
        return ans;
    } 
}

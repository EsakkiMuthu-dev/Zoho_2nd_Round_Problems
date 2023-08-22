package practiceSet.set3;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {2,4,5,6,7,9,10,13};
        int[] arr2 = {2,3,4,5,6,7,8,9,11,15};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }
    static int[] merge(int[] arr1, int[] arr2)
    {
        int left=0; // for arr1
        int right =0 ; // for arr2
        int maxLength = arr1.length+arr2.length;
        int[] ans = new int[maxLength];
        int k =0;
        while((left < arr1.length) && (right<arr2.length))
        {
            if(arr1[left]<arr2[right]) 
            {
                ans[k] =arr1[left];
                left++;
            }
            else if(arr1[left] > arr2[right])
            {
                ans[k]=arr2[right];
                right++;
            }
            else if(arr1[left] == arr2[right])
            {
                ans[k] = arr1[left];
                left++;
                right++;
            }
            k++;
        }

        //  remaining in left
        while(left<arr1.length )
        {
            ans[k] = arr1[left];
            left++;
            k++;
        }

        //  remaining in right
        while(right < arr2.length)
        {
            ans[k] = arr2[right];
            right++;
            k++;
        }

        return ans;

    }
}

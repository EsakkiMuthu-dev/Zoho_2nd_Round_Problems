package practiceSet.set2;
import java.util.Arrays;
public class AlternateSorting {
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5, 6, 7};
        int[]ans =sort(arr);
        inplaceSort(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(arr));
    }
    static void inplaceSort(int[] arr)
    {
        //  right shift
        int end=arr.length-1;
        int start=0;
        while(start<=end)
        {
            int temp = arr[arr.length-1];
            end = arr.length-1;
            // swap till the start positon
            
            while(end>start)
            {
                arr[end] = arr[end-1];
                end--;
            }
            // in the first pos put max val
            
            arr[start] = temp;
            start+=2;
            end=arr.length-1;

        }
    }

    static int[] sort(int[] arr)
    {
        int[] ans = new int[arr.length];
        int left=0;
        int right=arr.length-1;
        int k =0;
        while(left <= right)
        {
            if(left == right)
            {
                ans[k]= arr[left];
                left++;
                break;
            }
            ans[k]= arr[right];
            right--;
            k++;

            ans[k] =arr[left];
            left++;
            k++;
        }
        return ans;

    }

}

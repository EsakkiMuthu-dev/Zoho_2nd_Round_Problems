package practiceSet.SortingProblems;
import java.util.Arrays;
public class AlternateSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        alternateSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void alternateSort(int[] arr)
    {
        int i =0;
        while(i < arr.length)
        {
            int n = arr.length-1;
            int max = arr[n];
            while(n > i)
            {
                arr[n] = arr[n-1];
                n--;
            }
            // on the i value put max
            arr[i] = max;
            i+=2;

        }
    }
}


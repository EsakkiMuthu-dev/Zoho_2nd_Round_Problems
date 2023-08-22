package practiceSet.SortingProblems;
import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
        int[] arr ={13,2, 4,15,12,10,5};
        sort(arr);
    }
    static void sort(int[] arr)
    {
       int n = arr.length;
        //  sort the odd positin using descending sort
        for(int i=0;i<n;i+=2)
        {
            for(int j =i+2;j<n;j+=2)
            {
                if(arr[j]>arr[i])
                {
                    int temp =arr[j];
                    arr[j] = arr[i];
                    arr[i]= temp;
                }
            }
        }
        
        // sort the even pos in ascendiig order
        for(int i =1;i<n;i+=2)
        {
            for(int j=i+2;j<n;j+=2)
            {
                // buble sort
                if(arr[i]> arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

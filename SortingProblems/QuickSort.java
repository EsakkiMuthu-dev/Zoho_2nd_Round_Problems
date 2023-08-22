package practiceSet.SortingProblems;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7, 1, 6, 2, 5, 3, 4};
        sort(arr ,0, arr.length);
    }
    static int[] sort(int[] arr ,int low , int high)
    {
        // pivot == mid element of arr
        // pivot left side should be smaller
        //  swap
        // pivot right side should be larger
        //  swap
        // left side sent it to sort
        // right side sent it to sort
        int start =low;
        int end =high;
        int mid = start+(end-start)/2;
        int pivot = arr[mid];

        //  pivot left should be smaller  {7, 1, 6, 2, 5, 3, 4}; mid = 2

        while(start <= end)
        {
            
        }


        
        
        
    }
}

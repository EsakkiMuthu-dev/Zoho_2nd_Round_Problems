package practiceSet.ArrayProblems;

public class KadanesAlgo {
    /*
    Given array find maximum sum of contiguous sub array
    {-2 -3 4 -1 -2 1 5 -3}
    output 7 elements [ 4 -1 -2 1 5]
     */
    public static void main(String[] args) {
        int[] arr ={-2, -3,4, -1, -2, 1, 5, -3};
        largeSubArray(arr);
    }
    public static void largeSubArray(int[] arr)
    {
        int sum =0;
        int start =0;
        int end =0;
        int max = Integer.MIN_VALUE;

        for(int i =0;i<arr.length;i++)
        {
            
            sum+=arr[i];
            
            if(sum < 0) 
            {
                sum=0;
                start=i+1;
            }
            // upadte max
            if(sum > max)
            {
                end=i;
                max= sum;
            }
        }
        System.out.println(max);
        for(int i=start;i<=end;i++)
        {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
}

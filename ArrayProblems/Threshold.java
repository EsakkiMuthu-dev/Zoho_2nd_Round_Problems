package practiceSet.ArrayProblems;

public class Threshold {
    public static void main(String[] args) {
        int[] arr = {5,8,10,13,6,2};
        int threshold = 3;
        findThresholdValue(arr, threshold);
    }
    static void findThresholdValue(int[] arr , int threshold)
    {
        int totalCount=0;
        for(int num : arr)
        {
            int count =0;
            while(num >threshold)
            {
                num=num-threshold;
                count++;
            }
            count++;
            totalCount+=count;
        }
        System.out.println(totalCount);
    }

}

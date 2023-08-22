package practiceSet.set1;
import java.util.Map;

import java.util.TreeMap;

public class Weights1 {
    public static void main(String[] args)
    {
        int[] arr ={10,36,54,89,12};
        calculate(arr);
        System.out.println(Math.sqrt(35));
        System.out.println(Math.floor(Math.sqrt(35)));
    }
    static void calculate(int[] arr)
    {
        Map<Integer,Integer> weights = new TreeMap<>();
        
        for(int a : arr)
        {
            int weight =0;
            if(isPerfectSquareB(a)) weight+=5;
            if((a%4==0)&&(a%6==0)) weight+=4;
            if(a%2==0) weight+=3;
            weights.put(a,weight);
        }

        for(int i : weights.keySet())
        {
            System.out.println("<  "+i+" its weights "+weights.get(i)+"  >");
        }


    }

    static boolean isPerfectSquareB(int n)
    {
        if(n <0) return false;
        if(n==1 || n ==0) return true;
        int left =2;
        int right=n;
        while(left<=right)
        {
            int mid = left+(right-left)/2;

            int square = mid*mid;
            
            if(square<n) left=mid+1;
            else if(square > n) right = mid-1;
            else return true;
        }

        return false;
    }
    

    static boolean isPerfectSquare(int n)
    {
        for(int i =2;i*i<=n;i++)
        {
            if(i*i == n) return true;
        }
        return false;
    }
}

package practiceSet.numberProblems;

import java.util.*;
class Factor implements Comparable<Factor>{
    int count;
    int val;
    public Factor(int val, int count)
    {
        this.val = val;
        this.count = count;
    }
    @Override
    public int compareTo(Factor f1)
    {
        return f1.count- this.count;
    }
}
public class Factors {
    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 12, 16};
        // LinkedHashMap<Integer,ArrayList<Integer>> factorsMap = findFactors(arr);
        ArrayList<Factor> factors = findFactorsobj(arr);
        Collections.sort(factors);
        // System.out.println(factorsMap);
        

        for(Factor f : factors)
        {
            System.out.printf("Element %d  : Value  %d %n",f.val,f.count);
        }
    }
    static  ArrayList<Factor> findFactorsobj(int[] arr)
    {
        ArrayList<Factor>ans= new ArrayList<>();
        for(int i : arr)
        {
            ArrayList<Integer> factors = factorList(i, arr);
            ans.add( new Factor(i, factors.size()));
        }
        return ans;
    }

    static LinkedHashMap<Integer,ArrayList<Integer>> findFactors(int[] arr)
    {
        LinkedHashMap<Integer,ArrayList<Integer>> ans= new LinkedHashMap<>();
        for(int i : arr)
        {
            ArrayList<Integer> factors = factorList(i, arr);
            ans.put(i,factors);
        }
        return ans;
    }

    static ArrayList<Integer> factorList(int i, int[] arr)
    {
        ArrayList<Integer> factors = new ArrayList<>();
        for(int el : arr)
        {
            if(i %el ==0)factors.add(el);
        }
        return factors;
    }
}

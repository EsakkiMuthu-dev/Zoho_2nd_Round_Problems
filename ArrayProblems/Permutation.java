package practiceSet.ArrayProblems;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        StringBuilder word =new StringBuilder("abc");
        permutateString(word, 0);
        System.out.println("----------");
        permutate(arr ,0);
    }
    static void permutateString(StringBuilder word , int index)
    {
        if(index == word.length())
        {
            System.out.println(word);
        }
        for(int i=index;i<word.length();i++)
        {
            swapChar(word,index,i);
            permutateString(word,index+1);
            swapChar(word,index, i);
        }
    }
    static void swapChar(StringBuilder word, int start, int last )
    {
        // swap : a b c
        char temp =word.charAt(start);
        word.setCharAt(start, word.charAt(last));
        word.setCharAt(last, temp);

    }
    static void permutate(int[] arr,int  index)
    {
        // base comdition
        if( index == arr.length)
        {
            System.out.println(Arrays.toString(arr));
        }

        for(int i = index ; i< arr.length;i++)
        {
            swap(arr, index, i);
            permutate(arr, index+1);
            swap(arr,index,i);
        }
    }
    static void swap(int[] arr, int start, int last)
    {
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] =temp;
    }
}

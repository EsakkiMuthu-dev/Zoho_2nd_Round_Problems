package practiceSet.numberProblems;
import java.util.Scanner;
public class AddLargeNumbers {
    public static void main(String[] args) {
        // int[] arr1 ={9,2,8,1,3,5,6,7,3,1,1,6};
        // int[] arr2 ={7,8,4,6,2,1,9,9,7};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of first number : ");
        int n1 = input.nextInt();
        int[] arr1=new int[n1];
        System.out.println("Enter the numbers:  ");
     
        
        for(int i=0;i<n1;i++)
        {
            arr1[i] = input.nextInt();
        }
        System.out.println("Enter the size of second number : ");
        int n2 = input.nextInt();
        int[] arr2=new int[n2];
        System.out.println("Enter the numbers:  ");
        for(int i=0;i<n2;i++)
        {
            arr2[i] = input.nextInt();
        }
       System.out.println(add(arr1,arr2));
    }
     // int[] arr1 ={9,2,8,1,3,5,6,7,3,1,1,6};
        // int[] arr2 ={7,8,4,6,2,1,9,9,7};

    static String add(int[] arr1, int[] arr2)
    {
        StringBuilder res = new StringBuilder();
        int i=arr1.length-1;
        int j = arr2.length-1;
        int carry =0;
        while(i>=0 || j>=0)
        {
            // lets do addition
            int x = (i>=0)? arr1[i]:0;
            int y =(j>=0)?arr2[j]:0;
            int sum = x+y+carry;
            res.insert(0,sum%10);
            carry = sum/10;
            i--;
            j--;
        }
      if(carry >0) res.insert(0,carry);
        return res.toString();

    }
}

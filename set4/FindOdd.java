package practiceSet.set4;

public class FindOdd {
    public static void main(String[] args) {
        int start = 2;
        int end = 15;
        printOdd(start , end);
    }
    static void printOdd(int start, int end)
    {
        for(int i=start;i<end;i++)
        {
            if(i%2!=0) System.out.println(i);
        }
    }
}

package practiceSet.set4;
public class ConvertToAlpahatetic
{
    public static void main(String[] args) {
        int n = 27;
        int n1 =1000;
        System.out.println(convertToAlphapet(n));
        System.out.println(convertToAlphapet(n1));
    }
    public static String convertToAlphapet(int n)
    {
        StringBuilder res = new StringBuilder();

        while(n>0)
        {
            // find the last digit
            int last = (n-1)%26;// 0 indexing
            res.insert(0,(char)('A'+last));
            n=n/26;
        }
        return res.toString();

    }

}
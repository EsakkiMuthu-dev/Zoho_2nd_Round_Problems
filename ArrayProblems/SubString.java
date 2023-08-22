package practiceSet.ArrayProblems;

public class SubString {
    public static void main(String[] args) {
        String original ="test123String";
        String target ="123";
        System.out.println(findSubInd(original,target));
    }
    static int findSubInd(String original ,String target)
    {

        for(int i=0;i<original.length();i++)
        {
            if(original.charAt(i)==target.charAt(0))
            {
                boolean found = true;
                for(int k=0;k<target.length();k++)
                {
                    if((i+k)< original.length() && original.charAt(i+k) != target.charAt(k))
                    {
                        found=false;
                        break;
                    }
                }
                if(found) return i;

            }
        }
        return -1;

    }

}

package practiceSet.set4;

public class LookAndSayPattern {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n)
    {
        System.out.println(1);
        String val = "1";
        int count =1;
        for(int i=1;i<n;i++)
        {
            char temp =val.charAt(0);
            for(char a : val.toCharArray())
            {
                if(a == temp)
                {
                    count++;
                }
                else{
                    val =Character.toString(temp).repeat(count);
                    System.out.print(val);
                    temp = a;
                    count=0;
                }
            }
            System.out.println();

        }
        
    }
}

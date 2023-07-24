import java.util.Scanner;

public class CountPrimes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println(findPrimeCount(number));
    }
    public static int findPrimeCount(int number)
    {
        int count=0;
        for(int i=2;i<number;i++)
        {
            boolean flag=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                count++;
            }
        }
        return count;
    }
}

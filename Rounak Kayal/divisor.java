import java.util.*;

public class divisor
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        n = sc.nextInt();

        for(int i = 1; i<=n; i++)
        {
            if(n%i == 0)
            {
                System.out.println(i);
            }
        }
    }
}

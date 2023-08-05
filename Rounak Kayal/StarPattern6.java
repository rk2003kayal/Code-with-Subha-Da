import java.util.*;

public class StarPattern6
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = ip.nextInt();
        int m = n;

        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=m; j++)
            {
                if(n%2 == 0)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

// ****
// ***
// **
// *

public class StarPattern8
{
    public static void main(String[] args)
    {
        int n = 8;
        int m = 8;

        for(int i = 1; i<n; i++)
        {
            for(int j = 8; j>i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

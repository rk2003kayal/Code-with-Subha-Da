import java.util.Scanner;

public class new2D
{
    public static void main(String[] args)
    {
        int [][] a = new int[3][2];

        // for scanning 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        for(int i = 0; i<3; i++)
        {
                for(int j = 0; j<2; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        // for printing
        System.out.println("Matrix:\n");
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<2; j++)
            {
                System.out.print(a[i][j]+ " ");
            }

            System.out.println("\n");
        }
            
    }
}

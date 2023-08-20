import java.util.Scanner;

public class transpose2D
{
    public static void main(String[] args)
    {
        // initialisation
        int a[][] = new int [3][2];
        Scanner sc = new Scanner(System.in);

        // taking values and going through rows and columns
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

        // for transposing
        System.out.println("Transpose Matrix: \n");
        for(int i = 0; i<2; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.print(a[j][i] + " ");
            }
            System.out.println("\n");
        }
    }
}

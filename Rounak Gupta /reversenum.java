import java.util.*;

public class reversenum
{
    public static void main(String[] args)
    {
        int size, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of digits - ");
        size = sc.nextInt();

        int a[] = new int[size]; 
        for(i = 0; i<size; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the number - ");
        for(i=0; i<size; i++)
        {
            System.out.print(a[i] + " ");
        }

        System.out.print("\nReversed number - ");
        for(i=size-1; i>=0; i--)
        {
            System.out.print(a[i] + " ");
        }
    }
}

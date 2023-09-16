// reverse an array 

import java.util.*;

public class arrayReverse
{
    public static void main(String[] args)
    {
        int size; 
        int i;;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size- ");
        size = sc.nextInt();

        int a[] = new int[size]; 
        for(i = 0; i<size; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.print("Array elements : ");
        for(i=0; i<size; i++)
        {
            System.out.print(a[i] + " ");
        }

        System.out.print("\nArray elements in reverse : ");
        for(i=size-1; i>=0; i--)
        {
            System.out.print(a[i] + " ");
        }
    }
}

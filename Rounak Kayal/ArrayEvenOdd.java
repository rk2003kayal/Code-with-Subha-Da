// find the odd and even elements in an array

import java.util.*;

public class ArrayEvenOdd 
{
    public static void main(String[] args) 
    {
        int size, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        size = sc.nextInt();

        int a[] = new int[size];
        System.out.println("Enter the array elements: ");
        for (i = 0; i < size; i++) 
        {
            a[i] = sc.nextInt();
        }

        System.out.println("The even elements are: ");
        for (i = 0; i < size; i++) 
        {
            if (a[i] % 2 == 0) 
            {
                System.out.print(a[i] + " ");
            }
        }

        System.out.println("\nThe odd elements are: ");
        for (i = 0; i < size; i++) 
        {
            if (a[i] % 2 != 0) 
            {
                System.out.print(a[i] + " ");
            }
        }
    }
}
